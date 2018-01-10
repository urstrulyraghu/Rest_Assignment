package profile.users.Service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlType;

import profile.users.Profile.Profile;

@XmlType(name="")
public class ProfileService extends Profile{
	
		ArrayList<Profile> list = new ArrayList<Profile>();
		
		public ProfileService() {
			list.add(new Profile("raghu", 21, "abc@gm.com"));
			list.add(new Profile("sandeep", 22, "bbc.fg.com"));
		}
		
		public List<Profile> getAllProfiles() {
			return list;
		}
		
		public void postProfile(Profile profile) {
			list.add(profile);
		}
		
		public Profile getProfile(String pName) {
			for(Profile m : list) {
				if(m.getProfileName().equals(pName)) {
					return m;
				}
			}
			return null;
		}

		public void putProfile(Profile profile) {
			// TODO Auto-generated method stub
			for(Profile m : list) {
				if(m.getProfileName().equals(profile.getProfileName())) {
					list.remove(m);
					list.add(profile);
				}
			}
		}

		public void deleteProfile(String pName) {
			// TODO Auto-generated method stub
			for(Profile m : list) {
				if(m.getProfileName().equals(pName)) {
					list.remove(m);
				}
			}
		}
}

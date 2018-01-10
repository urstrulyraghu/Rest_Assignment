package profile.users.Profile;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Profile {
	String profileName;
	int age;
	String emailId;
	
	public Profile(String profileName, int age, String emailId) {
		super();
		this.profileName = profileName;
		this.age = age;
		this.emailId = emailId;
	}
	
	public Profile() {
	}

	@Override
	public String toString() {
		return "Profile [profileName=" + profileName + ", age=" + age + ", emailId=" + emailId + "]";
	}
	public String getProfileName() {
		return profileName;
	}
	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
}

package profile.users.Resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlElement;

import org.glassfish.jersey.server.JSONP;

import profile.users.Profile.Profile;
import profile.users.Service.ProfileService;

@Path("profiles")
public class ProfileResource {
		ProfileService service = new ProfileService();
		
		@GET
		@Produces(MediaType.APPLICATION_XML)
		public List<Profile> getProfiles()
		{
			return service.getAllProfiles();
		}
		
		@GET
		@Path("/{pName}")
		@Produces(MediaType.APPLICATION_XML)
		public Profile getProfile(@PathParam("pName") String pName) {
			return service.getProfile(pName);
		}
		
		@POST
		@Consumes(MediaType.APPLICATION_JSON)
		public void postProfile(Profile profile)
		{
			service.postProfile(profile);
		}
		
		@PUT
		@Consumes(MediaType.APPLICATION_JSON)
		public void putProfile(Profile profile) {
			service.putProfile(profile);
		}
		
		@DELETE
		@Path("/{pName}")
		public void deleteProfile(@PathParam("pName") String pName) {
			service.deleteProfile(pName);
		}
	}

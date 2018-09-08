package APITwitter;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import twitter4j.TwitterException;

@Path("API")
public class APIRest_Twitter {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of APIRest_Twitter
     */
    public APIRest_Twitter() {
    }
    
    @PUT
    public void Twittear() throws TwitterException{
        CTwitter twt = new CTwitter();
    }
    
    @PUT
    public void Twittear2(String ConsumerKey, String ConsumerSecret, String AccesToken, String AccesSecretToken) throws TwitterException{
        CTwitter twt = new CTwitter(ConsumerKey, ConsumerSecret, AccesToken, AccesSecretToken);
    }
    
    /**
     * Retrieves representation of an instance of APITwitter.APIRest_Twitter
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public String getXml() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of APIRest_Twitter
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }
    
    
}

package APITwitter;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class CTwitter {
    public CTwitter() throws TwitterException{
        Twitter twitter;
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("")
                .setOAuthConsumerSecret("")
                .setOAuthAccessToken("")
                .setOAuthAccessTokenSecret("");
        twitter = new TwitterFactory(cb.build()).getInstance();
        
        Status tweet = twitter.updateStatus("NOTIFICACION: La piscina se encuentra llena.");
    }
    
    public CTwitter(String ConsumerKey, String ConsumerSecret, String AccesToken, String AccesSecretToken) throws TwitterException{
        Twitter twitter;
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey(ConsumerKey)
                .setOAuthConsumerSecret(ConsumerSecret)
                .setOAuthAccessToken(AccesToken)
                .setOAuthAccessTokenSecret(AccesSecretToken);
        twitter = new TwitterFactory(cb.build()).getInstance();
        
        Status tweet = twitter.updateStatus("NOTIFICACION: La piscina se encuentra llena.");
    }
}

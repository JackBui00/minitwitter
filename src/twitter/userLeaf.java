package twitter;



import java.util.List; 
import java.util.ArrayList;
import java.util.Arrays;
//import javafx.collections.FXCollections;
//import javafx.collections.ObservableList;

public class userLeaf extends followedUser implements tree, observer{
	//the database that makes up each user
	private String userID;
	private List<userLeaf> following = new ArrayList<>();
	private List<String> tweets = new ArrayList<>();
	private List<String> newsFeed = new ArrayList<>(Arrays.asList());
	
		public userLeaf(String ID) {
			this.userID = ID; 
		}
	
	
	@Override
	public String getID() {
		return userID; 
	}
	
	@Override
	public void add(visitor visitor) {
		visitor.visitUser(this);
		
	}

	//update the feed ot the followers
	@Override
	public void updateFeed(followedUser subject, String message) {
		if (subject instanceof userLeaf) {
			this.newsFeed.add(((userLeaf) subject).getID() + " - " + message);
		}
	}
	//add new follower
	public void newFollowed(userLeaf user) {
		following.add(user); 
	}
	//grab tweets
	public List<String> getTweets(){
		return tweets; 
	}
	//tweet message 
	public void tweet(String message) {
		tweets.add(message);
		newsFeed.add(this.userID + " - " + message );
		updateFollowersFeed(message); 
	}
	
	
	
	
	
}
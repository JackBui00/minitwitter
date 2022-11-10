package twitter; 
import java.util.ArrayList;
import java.util.List;

//create observer List 
public class followedUser{
	private List<observer> followers = new ArrayList<>(); 
	
	
	public void follow(observer observer) {
		followers.add(observer); 
	}
	
	public void updateFollowersFeed(String tweet) {
		for(observer observer : this.followers) {
			observer.updateFeed(this, tweet);
		}
	}
}
package twitter; 
import java.util.ArrayList;
import java.util.List;

public class groupTree implements tree{
	//database for tree 
	private List<tree> groupDataBase = new ArrayList<>(); 
	private String groupID; 
	
	public void addGroup(tree group) {
		this.groupDataBase.add(group); 
	}
	
	public List<tree> getGroupDataBase(){
		return groupDataBase; 
	}
	//get ID 
	public groupTree(String ID){
		this.groupID = ID; 
	}
	//check if the user exist to follow later
	public Boolean hasUser(String userID) {
		for (tree member : groupDataBase) {
			if (member instanceof userLeaf) {
				if (member.getID() == userID) {
					return true; 
				}
			}
			else if(member instanceof groupTree) {
				if(((groupTree) member).hasUser(userID){
					return true; 
				}
			}
		}
		return false; 
	}
	//find the user 
	public userLeaf findUser(String userID) {
		for (tree member : groupDataBase) {
			//type comparison 
			if(member instanceof userLeaf) {
				if(member.getID() == userID) {
					return (userLeaf) member; 
				}
			}
			////type comparison 
			else if (member instanceof groupTree) {
				if (((groupTree) member).hasUser(userID)) {
					return (((groupTree) member).findUser(userID); 
				}
			}
		}
		return null; 
	}
	
	@Override
	public String getID() {
		return groupID; 
	}
	//add a visitor pattern 
	@Override
	public void add(visitor visitor) {
		visitor.visitGroup(this);
		for (tree member : groupDataBase) {
			////type comparison 
			if(member instanceof userLeaf) {
				member.add(visitor);
			}
			else if(member instanceof groupTree) {
				member.add(visitor);
			}
			
			
			
		}
		
	}
	
	

	
}
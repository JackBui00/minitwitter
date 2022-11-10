package twitter; 

//user interface
public interface visitor{
	public void visitGroup(groupTree group);
	
	public void visitUser(userLeaf user); 
}
package twitter; 


public interface visitor{
	public void visitGroup(groupTree group);
	
	public void visitUser(userLeaf user); 
}
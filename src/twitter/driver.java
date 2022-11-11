package twitter;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeSelectionModel;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class driver {

	private JFrame frame;


	//start up admin
	public static void main(String[] args) {
					groupTree database = new groupTree("root"); 
					driver window = new driver();
					window.frame.setVisible(true);
				}
			

	
	
	public class driver() {
		//create an object of SingleObject
		private static SingleObject instance = new SingleObject();

		//make the constructor private so that this class cannot be
		//instantiated
		private SingleObject(){}
	 
		//Get the only object available
		public static SingleObject getInstance(){
		   return instance;
		}
	 
	 }
		 
		
		
		
		
		
		
	}
	//admin ui 
	private void adminUI() {
		groupTree database = new groupTree("root"); 
		frame = new JFrame("root");
		frame.setBounds(100, 100, 674, 387);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		//tree for the data 
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
		JTree Tree = new JTree(root);
		Tree.setFont(new Font("Agency FB", Font.PLAIN, 17));
		Tree.setBounds(10, 10, 241, 315);
		frame.getContentPane().add(Tree);
		
		JTextPane addUserTextBox = new JTextPane();
		addUserTextBox.setFont(new Font("Agency FB", Font.PLAIN, 20));
		addUserTextBox.setBounds(261, 10, 241, 33);
		frame.getContentPane().add(addUserTextBox);
		//user input for add new user iD 
		JTextPane addGroupTextBox = new JTextPane();
		addGroupTextBox.setFont(new Font("Agency FB", Font.PLAIN, 20));
		addGroupTextBox.setBounds(261, 53, 241, 33);
		frame.getContentPane().add(addGroupTextBox);
		//add user 
		JButton addUser = new JButton("Add User");
		addUser.setFont(new Font("Agency FB", Font.PLAIN, 17));
		addUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) Tree.getLastSelectedPathComponent(); 
				DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(addUserTextBox.getText());
				selectedNode.add(newNode);
				DefaultTreeModel model = (DefaultTreeModel)Tree.getModel();
		        model.reload();
			}
		});
		
		addUser.setBounds(536, 10, 114, 33);
		frame.getContentPane().add(addUser);
		//add a new group
		JButton addGroup = new JButton("Add Group");
		addGroup.setFont(new Font("Agency FB", Font.PLAIN, 17));
		addGroup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) Tree.getLastSelectedPathComponent(); 
				DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(addGroupTextBox.getText());
				selectedNode.add(newNode);
				DefaultTreeModel model = (DefaultTreeModel)Tree.getModel();
		        model.reload();
			}
		});
		addGroup.setBounds(536, 53, 114, 33);
		frame.getContentPane().add(addGroup);
		//open the user view 
		JButton openUserView = new JButton("Open User View");
		openUserView.setFont(new Font("Agency FB", Font.PLAIN, 17));
		openUserView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userView userUI = new userView();
			}
		});
		openUserView.setBounds(257, 106, 393, 40);
		frame.getContentPane().add(openUserView);
		//show the total users 
		JButton showUserTotal = new JButton("Show User Total");
		showUserTotal.setFont(new Font("Agency FB", Font.PLAIN, 17));
		showUserTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NumberOfUsers numberUsers = new NumberOfUsers(); 
			}
		});
		showUserTotal.setBounds(257, 253, 189, 33);
		frame.getContentPane().add(showUserTotal);
		//show the total messages 
		JButton showMessagesTotal = new JButton("Show Messages Total");
		showMessagesTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MessageAmount messageamount = new MessageAmount(); 
			}
		});
		showMessagesTotal.setFont(new Font("Agency FB", Font.PLAIN, 17));
		addGroup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		showMessagesTotal.setBounds(257, 292, 189, 33);
		frame.getContentPane().add(showMessagesTotal);
		//show the group totals 
		JButton showGroupTotal = new JButton("Show Group Total");
		showGroupTotal.setFont(new Font("Agency FB", Font.PLAIN, 17));
		showGroupTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NumberofGroups numberGroups = new NumberofGroups(); 
			}
		});
		showGroupTotal.setBounds(452, 253, 198, 33);
		frame.getContentPane().add(showGroupTotal);
		//show the positive percentages 
		JButton showPositivePercentage = new JButton("Show Positive Percentage");
		showPositivePercentage.setFont(new Font("Agency FB", Font.PLAIN, 17));
		showPositivePercentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				percenthappy numberhappy = new percenthappy(); 
			}
		});
		showPositivePercentage.setBounds(452, 292, 198, 33);
		frame.getContentPane().add(showPositivePercentage);
	}
}

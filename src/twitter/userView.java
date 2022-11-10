package twitter;

import java.awt.EventQueue; 
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class userView implements ActionListener{
	private JFrame frame;

	

	public userView() {
		frame = new JFrame();
		frame.setBounds(100, 100, 456, 457);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		
		JTextArea followingFeed = new JTextArea();
		followingFeed.setText("List View (Current Following)");
		followingFeed.setRows(5);
		followingFeed.setEditable(false);
		followingFeed.setBounds(10, 88, 422, 120);
		frame.getContentPane().add(followingFeed);
		
		
		
		
		JTextArea newsFeed = new JTextArea();
		newsFeed.setText("List View (News Feed)");
		newsFeed.setEditable(false);
		newsFeed.setBounds(10, 296, 422, 114);
		frame.getContentPane().add(newsFeed);
		
		JTextArea inputFollowUser = new JTextArea();
		inputFollowUser.setBounds(10, 10, 222, 68);
		frame.getContentPane().add(inputFollowUser);
		
		JTextArea inputPostTweet = new JTextArea();
		inputPostTweet.setBounds(10, 218, 222, 68);
		frame.getContentPane().add(inputPostTweet);
		
		JButton postTweet = new JButton("Post Tweet");
		postTweet.setFont(new Font("Agency FB", Font.BOLD, 30));
		postTweet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newsFeed.setText(newsFeed.getText() + "\n - " + "bob: " + inputPostTweet.getText() );
			}
		});
		postTweet.setBounds(242, 218, 190, 68);
		frame.getContentPane().add(postTweet);
		
		JButton followUser = new JButton("Follow User");
		followUser.setFont(new Font("Agency FB", Font.BOLD, 30));
		followUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				followingFeed.setText(followingFeed.getText()  + "\n-  " +  inputFollowUser.getText());
				
			}
		});
		followUser.setBounds(242, 10, 190, 68);
		frame.getContentPane().add(followUser);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
}

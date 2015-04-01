package blog;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JPanel;

public class BlogGUI implements ActionListener {

	public BlogGUI(){}
	private JFrame mainFrame;
	private JTextArea postTextArea;
	private JTextField postContent;
	private JButton refresh;
	private JButton post;
	private JPanel posting;
	
	public void setWindow(){
		JFrame mainFrame = new JFrame("Your Name");
		mainFrame.setSize(500, 500);
		
		
		posting = new JPanel(new BorderLayout());
		
		mainFrame.setLayout(new BorderLayout());
		
		postTextArea = new JTextArea("What's on your mind?", 5, 20);
		mainFrame.add(postTextArea, BorderLayout.NORTH);
		postTextArea.setEditable(false);
		postTextArea.setVisible(true);
		
		refresh = new JButton("REFRESH");
		mainFrame.add(refresh, BorderLayout.WEST);
		//refresh.setVisible(true);
		refresh.addActionListener(this);
		
		
		post = new JButton("POST");
		//post.setVisible(true);
		mainFrame.add(post, BorderLayout.EAST);
		post.addActionListener(this);
		
		
		postContent = new JTextField("Here is put my posts!", 20);
		postContent.setEditable(false);
		mainFrame.add(postContent, BorderLayout.SOUTH);
		
		mainFrame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == post) {
		// TODOAuto-generated method stub
			postContent.setText("POST!!!");
		}
		else if(e.getSource() == refresh) {
			// TODOAuto-generated method stub
				postContent.setText("REFRESH!!!");
			}
		}
	
	public static void main(String[] args) {
		BlogGUI blogGUi= new BlogGUI();
		blogGUi.setWindow();
		}
	
}

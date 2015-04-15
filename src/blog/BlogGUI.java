package blog;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JPanel;

import base.Post;

public class BlogGUI{

	public BlogGUI(){}
	private JFrame mainFrame;
	private JTextArea postTextArea;
	private JTextArea postContent;
	private JButton refresh;
	private JButton post;
	private JPanel posting;
	private Blog myBlog = new Blog();
	private Post postT;
	private JLabel test1 = new JLabel();
	
	public void setWindow(){
		mainFrame = new JFrame("Your Name");
		mainFrame.setSize(500, 500);
		
		
		posting = new JPanel(new BorderLayout());
		
		mainFrame.setLayout(new BorderLayout());
		
		postTextArea = new JTextArea("", 5, 20);
		mainFrame.add(test1, BorderLayout.PAGE_START);
		test1.setText("You can still input 140 Characters");
		
		mainFrame.add(postTextArea, BorderLayout.CENTER);
		postTextArea.setEditable(true);
		postTextArea.setVisible(true);
		postTextArea.addKeyListener(new lengthListener());
		
		
		
		
		
		refresh = new JButton("REFRESH");
		mainFrame.add(refresh, BorderLayout.WEST);
		refresh.setVisible(true);
		refresh.addActionListener(new refreshListener());
		
		
		post = new JButton("POST");
		//post.setVisible(true);
		mainFrame.add(post, BorderLayout.EAST);
		post.addActionListener(new postListener());
		
		
		postContent = new JTextArea("Here is put my posts!", 5, 20);
		postContent.setEditable(false);
		mainFrame.add(postContent, BorderLayout.SOUTH);
		
		mainFrame.setVisible(true);
	}
	
	
	public class postListener implements ActionListener{

		public void actionPerformed(ActionEvent e){
			String filepath = "M:/" + "Test.Blog";
			String content = postTextArea.getText();
			if (content == "") {postContent.setText("empty post"); return;}
			if (content.length() > 140) postContent.setText("content too long");
			
			Date d = new Date();
			postT = new Post(d, content);
			myBlog.add(postT);
			myBlog.save(filepath);
			postContent.setText(content);
			postTextArea.setText("");
			System.out.println("File path: "+filepath);
		}
	}
	
	public class refreshListener implements ActionListener{

		public void actionPerformed(ActionEvent e){
			String filepath = "M:/" + "Test.Blog";
			myBlog.load(filepath);
			String content = myBlog.toString();
			postContent.setText(content);
			}
		}

	class lengthListener implements KeyListener{

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			String content = postTextArea.getText();
			int length = 140 - content.length();
			test1.setText("You can still input"+ length+ "Characters");
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public static void main(String[] args) {
		BlogGUI blogGUi= new BlogGUI();
		blogGUi.setWindow();
		}
	
}

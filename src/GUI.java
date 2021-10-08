import javax.swing.*;
import java.awt.*;

public class GUI {
	
	// GUI objects
	JFrame mainFrame = new JFrame();
	JPanel mainPanel = new JPanel();
	JPanel optionPanel = new JPanel();
	JPanel userInputPanel = new JPanel();
	
	JLabel titleLabel = new JLabel();
	JLabel userLabel = new JLabel();
	JLabel resultLabel = new JLabel();
	
	JTextField userInputField = new JTextField(10);
	JTextField resultField = new JTextField(10);
	
	JButton encryptButton = new JButton();
	JButton decryptButton = new JButton();
	JButton generatePass = new JButton();
	JButton storeButton = new JButton();
	JButton calculatePass = new JButton();
	
	public GUI() {
		
		mainFrame.setTitle("Password Application");
		mainFrame.setSize(500,500);
		mainFrame.setResizable(false);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.add(mainPanel);
		
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		
		titleLabel.setText("Password Application");
		titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		titleLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		mainPanel.add(titleLabel);
		
		mainPanel.add(optionPanel);
		encryptButton.setText("Encrypt");
		optionPanel.add(encryptButton);
		decryptButton.setText("Decrypt");
		optionPanel.add(decryptButton);
		generatePass.setText("Generate Password");
		optionPanel.add(generatePass);
		
		mainPanel.add(userInputPanel);
		userLabel.setText("Enter Password: ");
		userInputPanel.add(userLabel);
		userInputPanel.add(userInputField);
		
		
		
		
		mainFrame.setVisible(true);
		
	}
}

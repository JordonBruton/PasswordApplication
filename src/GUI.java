import javax.swing.*;
import javax.swing.border.TitledBorder;

import java.awt.*;

public class GUI {
	
	// GUI objects
	JFrame mainFrame = new JFrame();
	JPanel mainPanel = new JPanel();
	JPanel northPanel = new JPanel();
	JPanel centerPanel = new JPanel();
	JPanel southPanel = new JPanel();
	JPanel optionPanel = new JPanel();
	JPanel userInputPanel = new JPanel();
	JPanel resultPanel = new JPanel();
	JPanel userInteractionsPanel = new JPanel();
	
	JLabel titleLabel = new JLabel();
	JLabel userLabel = new JLabel();
	JLabel resultLabel = new JLabel();
	
	static JTextField userInputField = new JTextField(10);
	static JTextField resultField = new JTextField(10);
	
	JButton encryptButton = new JButton();
	JButton decryptButton = new JButton();
	JButton generatePass = new JButton();
	JButton storeButton = new JButton(); 
	JButton clearButton = new JButton();
	
	public GUI() {
		
		mainFrame.setTitle("Password Application");
		mainFrame.setSize(400, 300);
		mainFrame.setResizable(false);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.add(mainPanel);
		
		mainPanel.setLayout(new BorderLayout());
		
		mainPanel.add(northPanel, BorderLayout.NORTH);
		titleLabel.setText("Password Application");
		titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		Font myFont = new Font("Times New Roman", Font.BOLD, 20);
		titleLabel.setFont(myFont);
		northPanel.add(titleLabel);
		
		centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.PAGE_AXIS));
		optionPanel.setLayout(new FlowLayout());
		userInputPanel.setLayout(new FlowLayout());
		resultPanel.setLayout(new FlowLayout());
		
		mainPanel.add(centerPanel, BorderLayout.CENTER);
		centerPanel.add(optionPanel);
		
		TitledBorder optionBorder = BorderFactory.createTitledBorder("Options");
		optionBorder.setTitleJustification(TitledBorder.LEFT);
		optionPanel.setBorder(optionBorder);

		encryptButton.setText("Encrypt");
		encryptButton.addActionListener(new EncryptAction());
		optionPanel.add(encryptButton);
		
		
		decryptButton.setText("Decrypt");
		decryptButton.addActionListener(new DecryptAction());
		optionPanel.add(decryptButton);
		
		generatePass.setText("Generate Password");
		generatePass.addActionListener(new GenerateAction());
		optionPanel.add(generatePass);
		
		centerPanel.add(userInputPanel);
		centerPanel.add(resultPanel);
		
		TitledBorder userInteractionsBorder = BorderFactory.createTitledBorder("Users Input/Results");
		userInteractionsBorder.setTitleJustification(TitledBorder.LEFT);
		
		userLabel.setText("Enter Password: ");
		userInputPanel.add(userLabel);
		userInputPanel.add(userInputField);
		resultLabel.setText("Result: ");
		resultPanel.add(resultLabel);
		resultPanel.add(resultField);
		
		centerPanel.add(southPanel, BorderLayout.SOUTH);
		storeButton.setText("Store");
		southPanel.add(storeButton);
		
		clearButton.setText("Clear");
		clearButton.addActionListener(new ClearAction());
		southPanel.add(clearButton);
		
		storeButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		mainFrame.setVisible(true);
		
	}
	
	static public String getUserInput() {
		return userInputField.getText();
	}
}

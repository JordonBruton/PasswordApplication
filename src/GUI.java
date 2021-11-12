import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class GUI extends JFrame implements GUIComponents {

	
	public GUI() {
		
		setTitle("Password Application");
		setSize(400, 350);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		add(mainPanel);
		
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

		//Adding CheckBoxs to button group 
		encryptDifficultyGroup.add(easyEncryptBox);
		encryptDifficultyGroup.add(mediumEncryptBox);
		encryptDifficultyGroup.add(hardEncryptBox);
		
		//optionalPanel
		encryptButton.setText("Encrypt");
		encryptButton.addActionListener(new EncryptAction());
		optionPanel.add(encryptButton);
		decryptButton.setText("Decrypt");
		decryptButton.addActionListener(new DecryptAction());
		optionPanel.add(decryptButton);
		generatePass.setText("Generate Password");
		generatePass.addActionListener(new GenerateAction());
		optionPanel.add(generatePass);
		optionPanel.add(encyrptDifficultyCheckBoxJPanel);
		
		//encyrptDifficultyCheckBoxJPanel
		encyrptDifficultyCheckBoxJPanel.setLayout(new FlowLayout());
		encyrptDifficultyCheckBoxJPanel.add(easyEncryptBox);
		encyrptDifficultyCheckBoxJPanel.add(mediumEncryptBox);
		encyrptDifficultyCheckBoxJPanel.add(hardEncryptBox);
		
		//centerPanel
		centerPanel.add(userInputPanel);
		centerPanel.add(resultPanel);
		
		TitledBorder userInteractionsBorder = BorderFactory.createTitledBorder("Users Input/Results");
		userInteractionsBorder.setTitleJustification(TitledBorder.LEFT);
		
		//userInputPanel
		userLabel.setText("Enter Password: ");
		userInputPanel.add(userLabel);
		userInputPanel.add(userInputField);
		
		//resultPanel
		resultLabel.setText("Result: ");
		resultPanel.add(resultLabel);
		resultPanel.add(resultField);
		
		centerPanel.add(southPanel, BorderLayout.SOUTH);
		storeButton.setText("Store");
		southPanel.add(storeButton);
		
		//southPanel
		clearButton.setText("Clear");
		clearButton.addActionListener(new ClearAction());
		southPanel.add(clearButton);
		
		storeButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		setVisible(true);
	}
	
	static public String getUserInput() {
		return userInputField.getText();
	}
}

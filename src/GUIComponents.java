import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public interface GUIComponents {
	
	JPanel mainPanel = new JPanel();
	JPanel northPanel = new JPanel();
	JPanel centerPanel = new JPanel();
	JPanel southPanel = new JPanel();
	JPanel optionPanel = new JPanel();
	JPanel userInputPanel = new JPanel();
	JPanel resultPanel = new JPanel();
	JPanel encyrptDifficultyCheckBoxJPanel = new JPanel();
	
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
	
	JCheckBox easyEncryptBox = new JCheckBox("Easy Encryption", true);
	JCheckBox mediumEncryptBox = new JCheckBox("Medium Encryption", false);
	JCheckBox hardEncryptBox = new JCheckBox("Hard Encryption", false);
	
	ButtonGroup encryptDifficultyGroup = new ButtonGroup();
}

import java.awt.event.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class EncryptAction implements ActionListener {
	static String userPass;
	int s;
	char change;
	static public String resultPass = "";
	static public ArrayList<Character> userPassList = new ArrayList<>();
	static public ArrayList<Character> encryptedPassList = new ArrayList<>();
	
	public void actionPerformed(ActionEvent e) {
		userPass = GUI.getUserInput();
		
		for(char ch : userPass.toCharArray()) {
			userPassList.add(ch);
		}
		
		for (int i = 0; i < userPassList.size(); i++) {
			s = userPassList.get(i) + 5;
			change = (char)s;
			encryptedPassList.add(change);	
		}
		
		for (char ch : encryptedPassList) {
			resultPass += ch;
		}
		
		GUI.resultField.setText(resultPass);
	}
	
	
}


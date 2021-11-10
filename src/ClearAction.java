import java.awt.event.*;
import java.util.Currency;

public class ClearAction implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		GUI.userInputField.setText("");
		GUI.resultField.setText("");
		EncryptAction.userPassList.clear();
		EncryptAction.encryptedPassList.clear();
		EncryptAction.resultPass = "";
	}
}

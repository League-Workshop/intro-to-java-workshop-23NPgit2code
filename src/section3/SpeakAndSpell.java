package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
String poke = JOptionPane.showInputDialog(null, "Name the widely known pokemon!");
if(poke.equals("Pikachu")) {
	speak("Right! Lightning Attack!");
} else {
	speak("Wrong! Search it up on Google and try again");
}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}



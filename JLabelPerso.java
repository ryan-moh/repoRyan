import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;

public class JLabelPerso extends JLabel implements Observer {

	private String texte;
	

	public JLabelPerso() {
		;
	}
	public void update(Observable o, Object arg) {

		o.addObserver(this);
	}
	
	public String getTexte() {
		return texte;
	}
	
	public void setTexte(String texte) {
		this.texte = texte;
	}

}

import java.util.Observable;
import java.util.Observer;

public class Model extends Observable{
	private Observer texte;

	
	public Observer getTexte() {
		return texte;
		
	}

	public void setTexte(Observer texte) {
		this.texte = texte;
	}
	
	

	
	private void notifyAllObservers() {
			observer.update();
		}
	}
}

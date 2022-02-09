
public class Main {

	public static void main(String[] args) {
		Vue fenetre = new Vue();
		fenetre.lancerVue();

		Model model = new Model();
		Controller cont = new Controller(fenetre,model);
		
		fenetre.getBouton().addActionListener(cont);
	}
}

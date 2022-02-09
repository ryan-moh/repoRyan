import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Controller implements ActionListener {

	private Vue fenetre;
	private Model model_texte;
	
	public Controller(Vue fenetre,Model model) {
		this.fenetre = fenetre;
		this.model_texte = model;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		 //String s = this.getFenetre().getTexte().getText();
		// this.model_texte.setTexte(s);
		 System.out.println(this.model_texte.getTexte());
		 JLabelPerso label1 = this.fenetre.getLabel1();
		 label1.setText(this.model_texte.getTexte());

		 /*
		 JLabel label1 = this.fenetre.getLabel1();
		 label1.setText(this.model_texte.getTexte());
		 JLabel label2 = this.fenetre.getLabel2();
		 label2.setText(this.model_texte.getTexte());
		 JLabel label3 = this.fenetre.getLabel3();
		 label3.setText(this.model_texte.getTexte());
		 JLabel label4 = this.fenetre.getLabel4();
		 label4.setText(this.model_texte.getTexte());
		 JLabel label5 = this.fenetre.getLabel5();
		 label5.setText(this.model_texte.getTexte());
		 JLabel label6 = this.fenetre.getLabel6();
		 label6.setText(this.model_texte.getTexte());
		 */
	}
	

	public Vue getFenetre() {
		return fenetre;
	}

	public void setFenetre(Vue fenetre) {
		this.fenetre = fenetre;
	}

	public Model getModel_texte() {
		return model_texte;
	}
	public void setModel_texte(Model model_texte) {
		this.model_texte = model_texte;
	}
	
}

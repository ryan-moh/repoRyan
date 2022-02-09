import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.*;
import javax.swing.*;
import javax.swing.JButton;

public class Vue{

	private JFrame maFrame;
	private JTextField texte;
	private JButton bouton;
	private JPanel panneau;
	private JLabelPerso label1;
	private JLabelPerso label2;
	private JLabelPerso label3;
	private JLabelPerso label4;
	private JLabelPerso label5;
	private JLabelPerso label6;





	public void lancerVue() {
		this.maFrame = new JFrame("TestMVC");
		this.panneau = new JPanel();
		this.bouton = new JButton("Ok");
		this.label1 = new JLabelPerso();
		this.label2 = new JLabelPerso();
		this.label3 = new JLabelPerso();
		this.label4 = new JLabelPerso();
		this.label5 = new JLabelPerso();
		this.label6 = new JLabelPerso();


		this.texte = new JTextField("Entrez du texte");

		this.maFrame.setLayout(new GridLayout());

		this.maFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.maFrame.setTitle("Cadre principal"); 
		this.maFrame.setSize(300, 200);
		this.maFrame.setLocation(250,150);

		this.panneau.add(texte);
		this.panneau.add(bouton);
		this.panneau.add(label1);
		this.panneau.add(label2);
		this.panneau.add(label3);
		this.panneau.add(label4);
		this.panneau.add(label5);
		this.panneau.add(label6);

		this.maFrame.getContentPane().add(panneau);
		
		
		this.maFrame.setVisible(true);
		this.maFrame.pack();
	}


	public JTextField getTexte() {
		return texte;
	}


	public void setTexte(JTextField texte) {
		this.texte = texte;
	}


	public JFrame getMaFrame() {
		return maFrame;
	}


	public void setMaFrame(JFrame maFrame) {
		this.maFrame = maFrame;
	}


	public JButton getBouton() {
		return bouton;
	}


	public void setBouton(JButton bouton) {
		this.bouton = bouton;
	}


	public JPanel getPanneau() {
		return panneau;
	}


	public void setPanneau(JPanel panneau) {
		this.panneau = panneau;
	}


	public JLabelPerso getLabel1() {
		return label1;
	}


	public void setLabel1(JLabelPerso label1) {
		this.label1 = label1;
	}


	public JLabelPerso getLabel2() {
		return label2;
	}


	public void setLabel2(JLabelPerso label2) {
		this.label2 = label2;
	}


	public JLabelPerso getLabel3() {
		return label3;
	}


	public void setLabel3(JLabelPerso label3) {
		this.label3 = label3;
	}


	public JLabelPerso getLabel4() {
		return label4;
	}


	public void setLabel4(JLabelPerso label4) {
		this.label4 = label4;
	}


	public JLabelPerso getLabel5() {
		return label5;
	}


	public void setLabel5(JLabelPerso label5) {
		this.label5 = label5;
	}


	public JLabelPerso getLabel6() {
		return label6;
	}


	public void setLabel6(JLabelPerso label6) {
		this.label6 = label6;
	}


}
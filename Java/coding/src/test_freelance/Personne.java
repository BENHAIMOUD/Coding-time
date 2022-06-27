package test_freelance;

import java.util.concurrent.atomic.AtomicInteger;

public class Personne {
	
	private  int id;
	private String nom;
	private String prenom;
	private String mail;
	private String telephone;
	private double salaire;
	

	private static AtomicInteger atomicInteger = new AtomicInteger(0);
	
	
	public Personne() {
		this.id=atomicInteger.incrementAndGet();
		this.nom = "AAA";
		this.prenom = "BBB";
		this.mail = "CCC@cc";
		this.telephone = "TTT";
		this.salaire = 20000;
		
		
	}
	public Personne(String nom, String prenom, String mail, String tel, double salaire) throws Exception {
		this.id=atomicInteger.incrementAndGet();
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.telephone = tel;
		this.salaire=salaire;
	}
	
	
	public void Affiche() {
		System.out.println(this.toString());
	}
	public double calculerSlaire(double salaire) {
		// TODO Auto-generated method stub
		return salaire;
	}
	
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", mail=" + mail + ", telephone=" + telephone
				+ ", salaire=" + salaire + "]";
	}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	

}

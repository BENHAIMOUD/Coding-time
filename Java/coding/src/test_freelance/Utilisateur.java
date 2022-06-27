package test_freelance;


public class Utilisateur extends Personne {
	private String login;
	private String password;
	private String Service;
	private Profile profile = new Profile();
	
	
	
	public Utilisateur(String nom, String prenom, String mail, String tel, double salaire, Profile profile) throws Exception {
		super(nom, prenom, mail,tel,salaire);
		this.profile = profile;
		
	}

	public double calculerSlaire(double salaire){
		if(profile.getLibelle().equals("CA"))
			return salaire+(salaire*0.1);
		else if (profile.getLibelle().equals("CP"))
			return salaire+(salaire*0.4);	
		else
		  return salaire;
	}

	@Override
	public void Affiche() {
		// TODO Auto-generated method stub
		super.Affiche();
		System.out.println("Salaire final : "+calculerSlaire(this.getSalaire()));
	}


}

package test_freelance;

import java.util.ArrayList;

public class Solution {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Profile CP = new Profile(1, "12341", "CP");
		Profile CA = new Profile(2, "12376", "CA");
		Profile M = new Profile(3, "123471", "M");
		Profile JP = new Profile(4, "123991", "JP");
		
		
		Utilisateur user1 = new Utilisateur("jean","biter","jean@jean","0986662662",3000.0, CP);
		Utilisateur user2 = new Utilisateur("jean","biter","jean@jean","0986662662",5000.0, CA);
		Utilisateur user3 = new Utilisateur("jean","biter","jean@jean","0986662662",12000.0,M);
		Utilisateur user4 = new Utilisateur("jean","biter","jean@jean","0986662662",12000.0,JP);
		ArrayList<Utilisateur> utilisateurs = new ArrayList<>();
		
		user1.calculerSlaire(3000);
		user1.Affiche();
	
		

	}

}

package approche.liste;

import java.util.ArrayList;

public class TestVille {
	
	public static void main(String[] args) {
		ArrayList<Ville> villes = new ArrayList();

		Ville nice = new Ville("Nice",343000);
		Ville carcassone = new Ville("Carcassone",47800);
		Ville narbonne = new Ville("Narbonne",53400);
		Ville lyon = new Ville("Lyon",484000);
		Ville foix = new Ville("Foix",9700);
		Ville pau = new Ville("Pau",77200);
		Ville marseille = new Ville("Marseille",850700);
		Ville tarbes = new Ville("Tarbes",40600);
		villes.add(tarbes);
		villes.add(nice);
		villes.add(carcassone);
		villes.add(narbonne);
		villes.add(lyon);
		villes.add(foix);
		villes.add(pau);
		villes.add(marseille);
	int	plusgrosseville=villes.get(0).habitant;
	String nomville = villes.get(0).ville;
		for (int i=0;i<villes.size();i++){
			
		if (villes.get(i).habitant>plusgrosseville){
			plusgrosseville = villes.get(i).habitant;
			nomville = villes.get(i).ville;
		}

		}
		System.out.println("plus grosse ville : " + nomville);
		int	pluspetiteville=villes.get(0).habitant;
		String nompetiteville = villes.get(0).ville;
			for (int i=0;i<villes.size();i++){
				
			if (villes.get(i).habitant<pluspetiteville){
				pluspetiteville = villes.get(i).habitant;
				nompetiteville = villes.get(i).ville;
			}

			}
			System.out.println("plus grosse ville : " + nompetiteville);
	
	
		for (int i=0;i<villes.size();i++){
			
		if (villes.get(i).habitant>100000){
			villes.get(i).setVille(villes.get(i).ville.toUpperCase());
		}

		}
		System.out.println(villes);

}
}

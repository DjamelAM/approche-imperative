package approche.liste;

import java.util.ArrayList;

public class TestListeString {



	public static void main(String[] args) {


		ArrayList<String> liste = new ArrayList<String>();

		liste.add("Nice");
		liste.add("Carcassone");
		liste.add("Narbonne");
		liste.add("Lyon");
		liste.add("Foix");
		liste.add("Pau");
		liste.add("Marseille");
		liste.add("Tarbes");

		int motpluslong = liste.get(0).length();
		String indexmotpluslong = liste.get(0);
		for (int i=0;i<liste.size();i++){


			if (liste.get(i).length()>motpluslong){
				motpluslong = liste.get(i).length();
				indexmotpluslong=liste.get(i);
			}

		}
		System.out.println(indexmotpluslong);

		for(int i=0;i<liste.size();i++){
			liste.set(i, liste.get(i).toUpperCase());

		}
		System.out.println(liste);

	}
}



package approche.liste;

import java.util.ArrayList;

public class TestListeInt {
	



public static void main(String[] args) {

	ArrayList<Integer> liste;

	liste = new ArrayList<Integer>();
	liste.add(-1);
	liste.add(5);
	liste.add(7);
	liste.add(3);
	liste.add(-2);
	liste.add(4);
	liste.add(8);
	liste.add(5);
	
	System.out.println(liste);
	
	int a = liste.get(0);
for(int i=0;i<liste.size();i++){
	if (liste.get(i)>a){
		a = liste.get(i);

	}
}
System.out.println("le plus grand chiffre est : " + a);


for(int i=0;i<liste.size();i++){
	if (liste.get(i)<a){
		a = liste.get(i);
	}
}

System.out.println("le plus petit est : " + a);

for(int i=0;i<liste.size();i++){
	if (liste.get(i)<0){
		liste.add(-(liste.get(i)));
		liste.remove(i);
	}
}
System.out.println(liste);

}
}

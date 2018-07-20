package approche.liste;

public class Ville {
	String ville;
	int habitant;
	public Ville(String ville,int habitant){
		this.ville=ville;
		this.habitant=habitant;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public int getHabitant() {
		return habitant;
	}
	@Override
	public String toString() {
		return "Ville [ville=" + ville + ", habitant=" + habitant + "]";
	}
	public void setHabitant(int habitant) {
		this.habitant = habitant;
	}

	

}

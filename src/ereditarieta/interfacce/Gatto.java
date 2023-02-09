package ereditarieta.interfacce;

public class Gatto extends Mammifero implements Cammina, Corre{
	
	private int vite;
	private String colorePelo;
	
	
	public Gatto(int zampe, String specie, int eta, double peso) {
		super(zampe, specie, eta, peso);
	}

	@Override
	public void mangia() {
		System.out.println("Il gatto sta mangiando");
	}

	@Override
	public void dorme() {
		System.out.println("Il gatto sta dormendo");
	}

	@Override
	public void cresce() {
		System.out.println("Il gatto sta crescendo");
	}
	
	@Override
	public void corre() {
		System.out.println("Il gatto sta correndo");
	}

	@Override
	public void cammina() {
		System.out.println("Il gatto sta camminando");
	}

	public int getVite() {
		return vite;
	}

	public void setVite(int vite) {
		this.vite = vite;
	}

	public String getColorePelo() {
		return colorePelo;
	}

	public void setColorePelo(String colorePelo) {
		this.colorePelo = colorePelo;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Numero vite: " + vite + "\n"
								+ "Colore pelo: " + colorePelo;
	}

}

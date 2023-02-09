package ereditarieta.interfacce;

public abstract class Animale {
	
	private int zampe;
	private String specie;
	private int eta;
	private double peso;
	
	public Animale() {
		
	}
	
	public Animale(int zampe, String specie, int eta, double peso) {
		this.zampe = zampe;
		this.specie = specie;
		this.eta = eta;
		this.peso = peso;
	}
	
	public abstract void mangia();
	
	public abstract void dorme();
	
	public abstract void cresce();
	
	
	public int getZampe() {
		return zampe;
	}

	public void setZampe(int zampe) {
		this.zampe = zampe;
	}

	public String getSpecie() {
		return specie;
	}

	public void setSpecie(String specie) {
		this.specie = specie;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	@Override
	public String toString() {
		return "Numero zampe: " + zampe + "\n"
				+ "Specie: " + specie + "\n"
				+ "Età: " + eta + "\n"
				+ "Peso: " + peso + "\n";
	}

}

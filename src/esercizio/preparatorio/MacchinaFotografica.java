package esercizio.preparatorio;

public class MacchinaFotografica {

	private String marca;
	private String modello;
	private double prezzo;
	
	public MacchinaFotografica() {
		
	}
	
	public MacchinaFotografica(String marca, String modello, double prezzo) {
		this.marca = marca;
		this.modello = modello;
		this.prezzo = prezzo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	@Override
	public String toString() {
		return "Marca: " + marca + "\n"
				+ "Modello: " + modello + "\n"
				+ "Prezzo: " + prezzo;
	}
	
}

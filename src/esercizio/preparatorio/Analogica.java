package esercizio.preparatorio;

public class Analogica extends MacchinaFotografica implements AzioneFotocamera{
	
	public Analogica(String marca, String modello, double prezzo) {
		super(marca, modello, prezzo);
	}
	
	@Override
	public void accendi() {
		AzioneFotocamera.super.accendi();
	}

	@Override
	public void scatta() {
		System.out.println("Hai scattato una foto");
	}
	
	@Override
	public void spegni() {
		AzioneFotocamera.super.spegni();
	}
	

}

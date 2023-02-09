package esercizio.preparatorio;

public class Mirrorless extends MacchinaFotografica implements AzioneFotocamera, AzioneVideo{
	
	public Mirrorless(String marca, String modello, double prezzo) {
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
	public void registraVideo() {
		AzioneVideo.super.registraVideo();
	}
	
	@Override
	public void spegni() {
		AzioneFotocamera.super.spegni();
	}

}

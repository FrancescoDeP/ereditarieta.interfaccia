package esercizio.preparatorio;

public interface AzioneVideo {
	
	public default void registraVideo() {
		System.out.println("Sta registrando un video");
	}

}

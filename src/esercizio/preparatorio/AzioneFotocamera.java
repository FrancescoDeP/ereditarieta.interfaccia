package esercizio.preparatorio;

public interface AzioneFotocamera {
	
	public default void accendi() {
		System.out.println("La fotocamera è accesa");
	}
	
	public void scatta();
	
	
	public default void spegni() {
		System.out.println("La fotocamera è spenta");
	}
	
	

}

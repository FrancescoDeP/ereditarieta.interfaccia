package ereditarieta.interfacce;

public class Serpente extends Rettile implements Striscia{

	public Serpente(int zampe, String specie, int eta, double peso) {
		super(zampe, specie, eta, peso);
	}

	@Override
	public void mangia() {
		System.out.println("Il serpente sta mangiando");
	}

	@Override
	public void dorme() {
		System.out.println("Il serpente sta dormendo");
	}

	@Override
	public void cresce() {
		System.out.println("Il serpente sta crescendo");
	}
	
	@Override
	public void striscia() {
		System.out.println("Il serpente stra strisciando");
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

}

package ereditarieta.interfacce;

public class Coccodrillo extends Rettile implements Cammina, Corre{

	public Coccodrillo(int zampe, String specie, int eta, double peso) {
		super(zampe, specie, eta, peso);
	}

	@Override
	public void mangia() {
		System.out.println("Il coccodrillo sta mangiando");
	}

	@Override
	public void dorme() {
		System.out.println("Il coccodrillo sta dormendo");
	}

	@Override
	public void cresce() {
		System.out.println("Il coccodrillo sta crescendo");
	}
	
	@Override
	public void corre() {
		System.out.println("Il coccodrillo sta correndo");
	}

	@Override
	public void cammina() {
		System.out.println("Il coccodrillo sta camminando");
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

}

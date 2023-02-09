package ereditarieta.interfacce;

public class Canarino extends Volatile implements Cammina, Corre, Vola{
	
	public Canarino(int zampe, String specie, int eta, double peso) {
		super(zampe, specie, eta, peso);
	}

	@Override
	public void mangia() {
		System.out.println("Il canarino sta mangiando");
	}

	@Override
	public void dorme() {
		System.out.println("Il canarino sta dormendo");
	}

	@Override
	public void cresce() {
		System.out.println("Il canarino sta crescendo");
	}
	
	@Override
	public void vola() {
		System.out.println("Il canarino sta volando");
	}

	@Override
	public void corre() {
		System.out.println("Il canarino sta correndo");
	}

	@Override
	public void cammina() {
		System.out.println("Il canarino sta camminando");
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

}

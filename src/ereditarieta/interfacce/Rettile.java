package ereditarieta.interfacce;

public abstract class Rettile extends Animale{
	
	public Rettile(int zampe, String specie, int eta, double peso) {
		super(zampe, specie, eta, peso);
	}

	@Override
	public abstract void mangia();

	@Override
	public abstract void dorme();

	@Override
	public abstract void cresce();

	@Override
	public String toString() {
		return super.toString();
	}
}

package h2;

public class Spielbrett {
private Feld[][] brett;
private int dim;

public Spielbrett(int dim) {
	this.dim=dim;
	this.brett= new Feld [dim][dim];
}
public Feld[][] getBrett() {
	return this.brett;
}
public int getDim() {
	return this.dim;
}

public void setDim(int dim) {
	this.dim=dim;
}
}

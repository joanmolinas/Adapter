package adapter;

public class RectangleComplex implements Draw {
	Punt puntInicial, puntFinal;
	DrawAdapter adapter;
	public RectangleComplex(int xInicial, int yInicial, int xFinal, int yFinal) {
		puntInicial = new Punt(xInicial, yInicial);
		puntFinal = new Punt(xFinal, yFinal);
	}	
	
	public void dibuixar() {
		adapter = new DrawAdapter(puntInicial, puntFinal);
		adapter.dibuixar();
	}
	

}

package adapter;

public class DrawAdapter implements Draw {
	Rectangle rectangle;
	Punt puntInicial, puntFinal;
	int x , y, amplada, alcada;
	
	public DrawAdapter(Punt puntInicial, Punt puntFinal) {
		System.out.println("Creant Adapter");
		x = puntInicial.getX();
		y =  puntInicial.getY();
		alcada = Math.abs(x - puntFinal.getX());
		amplada = Math.abs(y - puntFinal.getY());
	}
	public void dibuixar() {
		
		rectangle = new Rectangle(x, y, amplada, alcada);
		rectangle.dibuixar();
		rectangle.toString();
	}

}

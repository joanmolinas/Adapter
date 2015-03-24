package adapter;

public class Rectangle implements Draw{

	int x, y, amplada, alcada;
	
	public Rectangle(int x, int y, int amplada, int alcada) {
		this.x = x;
		this.y = y;
		this.amplada = amplada;
		this.alcada = alcada;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setAmplada(int amplada) {
		this.amplada = amplada;
	}
	public void setAlcada(int alcada) {
		this.alcada = alcada;
	}
	
	public void dibuixar(){
		System.out.println("Ara dibuixaria x : " + x + " y: " + y + " amplada: " + amplada + " alçada " + alcada);
	}
	
	
	

}

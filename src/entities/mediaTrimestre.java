package entities;

public class mediaTrimestre {
	public String name;
	public double n1;
	public double n2;
	public double n3;
		
	public double mediaPonderada() {
		return n1  + n2  + n3 ;
	}
	
	public double faltou() {
		return 60.0 - mediaPonderada();
	}
}

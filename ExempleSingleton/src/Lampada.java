

public final class Lampada {
	
	private static Lampada INSTANCE = new Lampada();

	
	public static Lampada getIntance(){
		
		return INSTANCE;
	}
	
	public void Ligar(){
		
		System.out.println("Lampada ligada..");
	}
	
	public void Desligar(){
		
		System.out.println("Lampada Desligada..");
	}	
	
	
	
	
	
	

}

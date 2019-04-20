package Pacote1;
import Pacote2.PublicaPacote2;

public class PublicaPacote1 {
	
	PublicaPacote1 a;
	DefaultPacote1 b;
	
	PublicaPacote2 c;
	//DefaultPacote2 d;
	
	public void metodoPP1 (){}
	void metodoDP1(){}
	private void metodoPvP1(){}
	protected void metodoPtP1(){}
	
	public PublicaPacote1(){
		c.metodoPP2 ();
		
		b.metodoDP1();
		b.metodoPDP1();
		b.metodoPtDP1();
	}

}

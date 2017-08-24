package Pacote2;

import Pacote1.PublicaPacote1;

public class PublicaPacote2 {

	PublicaPacote1 a;
	//DefaultPacote1 b;
	
	PublicaPacote2 c;
	DefaultPacote2 d;
	
	public void metodoPP2 (){}
	void metodoDP2(){}
	private void metodoPvP2(){}
	protected void metodoPtP2(){}
	
	public PublicaPacote2(){
		a.metodoPP1();
		
		d.metodoDP2();
		d.metodoPDP2();
		d.metodoPtDP2();
	}
}

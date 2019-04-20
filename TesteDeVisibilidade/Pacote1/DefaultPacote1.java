package Pacote1;

import Pacote2.PublicaPacote2;

class DefaultPacote1 {
	
	PublicaPacote1 a;
	DefaultPacote1 b;
	
	PublicaPacote2 c;
	//DefaultPacote2 d;
	
	public void metodoPDP1 (){}
	void metodoDP1(){}
	private void metodoPvDP1(){}
	protected void metodoPtDP1(){}
	
	public DefaultPacote1() {
		
		a.metodoPP1();
		a.metodoDP1();
		a.metodoPtP1();
		
		c.metodoPP2();
		
	}
	
	
}

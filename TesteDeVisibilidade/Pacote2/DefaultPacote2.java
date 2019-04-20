package Pacote2;

import Pacote1.PublicaPacote1;

class DefaultPacote2 {

	PublicaPacote1 a;
	//DefaultPacote1 b;
	
	PublicaPacote2 c;
	DefaultPacote2 d;
	
	public void metodoPDP2 (){}
	void metodoDP2(){}
	private void metodoPvDP2(){}
	protected void metodoPtDP2(){}
	
	
	public DefaultPacote2() {
		c.metodoDP2();
		c.metodoPP2();
		c.metodoPtP2();
		
		a.metodoPP1();
		
		d.metodoDP2();
		d.metodoPDP2();
		d.metodoPtDP2();
		d.metodoPvDP2();
	}
	
}

<img
  src="https://media.licdn.com/mpr/mpr/shrink_200_200/AAEAAQAAAAAAAAh1AAAAJDlmN2ViMGFhLThkZDEtNDFiMC1hYzI1LTViOWRkMTYzM2VjZg.png"
  width="90"
  align="right"
/>

# Facisa.Programacao-III

Atividades e projetos da disciplina de programação III do curso de graduação em **Sistemas de Informação** pelo Centro Universitário - UniFacisa, Campina Grande - PB.

## Conteúdo Geral

* JAVA.
* Conceitos teóricos e práticos de **Orientação a Objetos**.
* IDE Eclipse e seu funcionamento.
* Estrutura de Dados.

## Listagem de Projetos

### TesteDeVisibilidade

**Testando a visibilidade de classes** : O teste é feito com métodos entre classes *Default* e *Public* analisando assim em qual dos casos é permitido chamar métodos de diferentes origens.
<p align="left">
    <img src="https://lh6.googleusercontent.com/b39HYMWZCa9rc6Y37H-0a-t4rf7BF8BKrC8o0NWQve2RzR-o-W7fc_zhi60KjNsxeKhLQrAFvv-8Elw=w1304-h702"
</p>

### ExempleSingleton

**Implementação Básica de Design Patterns *Singleton*** : O *Singleton* é uma padrão de projeto que otimiza a instância de uma classe tornando-a única e global. A forma implementada no exemplo mostra uma classe que já tem instância criada por ela mesma, com isso não é necessário instanciar em qualquer outro local, precisa-se apenas chamá-la quando precisar.
```
public final class Lampada {
	
	private static Lampada INSTANCE = new Lampada();

	
	public static Lampada getIntance(){
		
		return INSTANCE;
	}
...
```
### ProblemaDoDiamante

** DiamondProblem** : Relatório sobre o *DiamondProblem* envolvendo henraça múltipla em Java. 




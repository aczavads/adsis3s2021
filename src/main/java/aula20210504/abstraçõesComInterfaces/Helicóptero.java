package aula20210504.abstraçõesComInterfaces;

public class Helicóptero implements CoisaQueVoa, CoisaQueCai {

	public void voar() {
		System.out.println("Vuuuuuuuuushhhhhhh!!!!");
	}

	public void cair() {
		System.out.println("Uuuuuuéééééééééééééé´´eáhahahahahh bum!");
	}

}

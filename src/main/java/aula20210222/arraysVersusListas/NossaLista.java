package aula20210222.arraysVersusListas;

public class NossaLista {
	private Object[] elementos = {};
	private int tamanho = 0;
	
	
	public void remover(int posição) {
		Object[] auxiliar = new Object[elementos.length-1];
		for (int i = 0; i < elementos.length; i++) {
			if (i < posição) {
				auxiliar[i] = elementos[i];				
			} else  if (i > posição) {
				auxiliar[i-1] = elementos[i];								
			}
		}		
		elementos = auxiliar;
		tamanho--;
	}
	
	public void adicionar(Object elemento) {
		//System.out.println("Olha, tentando adicionar o elemento na lista: " + elemento);
		Object[] auxiliar = new Object[elementos.length+1];
		for (int i = 0; i < elementos.length; i++) {
			auxiliar[i] = elementos[i];
		}
		auxiliar[auxiliar.length-1] = elemento;
		elementos = auxiliar;
		tamanho++;
	}
	
	public int tamanho() {
		return tamanho;
	}
	
	public Object obter(int posição) {
		return elementos[posição];
	}
	
	public void exibirLista() {
		for (Object elemento : elementos) {
			System.out.println(elemento);
		}
	}

}

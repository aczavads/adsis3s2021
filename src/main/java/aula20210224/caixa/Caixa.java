package aula20210224.caixa;

public class Caixa {
	//declarando um atributo público "conteúdoDaCaixa" do tipo "Object"
	public Object conteúdoDaCaixa;
	
	//método estáCheia que retorna "true" se o conteúdo não for nulo.
	public boolean estáCheia() {
		if (conteúdoDaCaixa != null) {
			return true;
		}
		return false;
	}
	
	//método estáVazia que retorna o contrário (negação) do resultado do método estáCheia
	public boolean estáVazia() {
		return !estáCheia();
	}
	
}

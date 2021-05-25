package aula20210517.repositório;

import java.util.List;

public interface CorRepository {
	
	void salvar(Cor nova);

	void atualizar(Cor nova);
	
	void excluir(Cor cor);
	
	List<Cor> obterTodas();

}

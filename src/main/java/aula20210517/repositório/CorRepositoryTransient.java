package aula20210517.repositório;

import java.util.ArrayList;
import java.util.List;

public class CorRepositoryTransient implements CorRepository {
	private List<Cor> cores = new ArrayList<>();
	
	public void salvar(Cor nova) {
		cores.add(nova);
	}

	public void excluir(Cor cor) {
		cores.remove(cor);
	}
	
	public List<Cor> obterTodas() {
		return cores;
	}
}

package aula20210517.repositório;

import java.util.ArrayList;
import java.util.List;

public class CorRepositoryTransient implements CorRepository {
	private List<Cor> cores = new ArrayList<>();
	
	public void salvar(Cor nova) {
		cores.add(nova);
	}

	public void atualizar(Cor nova) {
		int posiçãoParaRemover = -1;
		for (int i = 0; i < cores.size(); i++) {
			if (cores.get(i).getSigla().equals(nova.getSigla())) {
				posiçãoParaRemover = i;
			}
		}
		if (posiçãoParaRemover != -1) {
			cores.remove(posiçãoParaRemover);
			cores.add(nova);
		}
	}

	
	public void excluir(Cor cor) {
		cores.remove(cor);
	}
	
	public List<Cor> obterTodas() {
		return cores;
	}
}

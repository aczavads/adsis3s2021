package aula20210511.repositório;

import java.util.ArrayList;
import java.util.List;

public class CorRepository {
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

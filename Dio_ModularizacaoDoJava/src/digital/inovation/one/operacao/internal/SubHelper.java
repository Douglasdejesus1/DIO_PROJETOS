package digital.inovation.one.operacao.internal;

import digital.inovation.one.operacao.Operacao;

public class SubHelper implements Operacao{
	@Override
	public int execute(int a, int b) {
		return a-b;
	}

}

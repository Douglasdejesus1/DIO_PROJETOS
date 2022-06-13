package digital.inovation.one.operacao;

import digital.inovation.one.operacao.internal.DivHelper;
import digital.inovation.one.operacao.internal.MultHelper;
import digital.inovation.one.operacao.internal.SubHelper;
import digital.inovation.one.operacao.internal.SunHelper;

public class Calculadora {
	private DivHelper divHelper;
	private MultHelper multHelper;
	private SubHelper subHelper;
	private SunHelper sunHelper;

	public Calculadora() {

		divHelper = new DivHelper();
		multHelper = new MultHelper();
		subHelper = new SubHelper();
		sunHelper = new SunHelper();
	}

	public int sum(int a, int b) {

		return sunHelper.execute(a, b);
	}

	public int sub(int a, int b) {

		return subHelper.execute(a, b);
	}

	public int mult(int a, int b) {

		return multHelper.execute(a, b);
	}

	public int div(int a, int b) {

		return divHelper.execute(a, b);
	}

}

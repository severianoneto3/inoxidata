package calculos;

public class Calculos {

	private static double limiteFinal;
	private static double carregamento;
	private static double tamanho;
	private static double superficie;
	private static double temperatura;
	private static double confiabilidade;
	private static double limiteTeorico;
	private static double resistenciaTracao;
	private static double diametro;
	private static double area = 0;

	public static double getArea() {
		return area;
	}

	public static void setAreaBT(double b, double t) {
			Calculos.area = 0.1 * b * t;
	}
	
	public static void setAreaBH(double b, double h) {
			Calculos.area = 0.05 * b * h;
	}
	
	public static void setAreaBX(double b, double h, double t, double x) {
			Calculos.area = (0.05 * b * x) + (t * (h - x));
	}

	public static double getDiametro() {
		return diametro;
	}

	public static void setDiametro(double diametro) {
		Calculos.diametro = diametro;
	}

	public static void setDiametroArea() {
		Calculos.diametro = Math.sqrt(Calculos.getArea() / 0.0766);
	}

	public static double getLimiteFinal() {
		return limiteFinal;
	}

	public static void setLimiteFinal() {
		Calculos.limiteFinal = Calculos.getCarregamento() * Calculos.getTamanho() * Calculos.getSuperficie()
				* Calculos.getTemperatura() * Calculos.getConfiabilidade() * Calculos.getLimiteTeorico();
	}

	public static double getCarregamento() {
		return carregamento;
	}

	public static void setCarregamento(double carregamento) {
		Calculos.carregamento = carregamento;
	}

	public static double getTamanho() {
		return tamanho;
	}

	public static void setTamanho() {
		if (Calculos.getDiametro() <= 8) {
			Calculos.tamanho = 1;
		} else if (Calculos.getDiametro() > 8 && Calculos.getDiametro() <= 250) {
			Calculos.tamanho = 1.189 * (Math.pow(Calculos.getDiametro(), (-0.097)));
		} else {
			Calculos.tamanho = 0.6;
		}
	}

	public static double getSuperficie() {
		return superficie;
	}

	public static void setSuperficie(double a, double b) {
		Calculos.superficie = a * (Math.pow(Calculos.getResistenciaTracao(), b));
	}

	public static double getTemperatura() {
		return temperatura;
	}

	public static void setTemperatura(double temperatura) {

		if (temperatura <= 450) {
			Calculos.temperatura = 1;
		} else if (temperatura > 450 && temperatura <= 550) {
			Calculos.temperatura = 1 - (0.0058 * (temperatura - 450));
		}

	}

	public static double getConfiabilidade() {
		return confiabilidade;
	}

	public static void setConfiabilidade(double confiabilidade) {
		Calculos.confiabilidade = confiabilidade;
	}

	public static double getLimiteTeorico() {
		return limiteTeorico;
	}

	public static void setLimiteTeorico() {
		if (Calculos.getResistenciaTracao() < 1400) {
			Calculos.limiteTeorico = Calculos.getResistenciaTracao() / 2;
		} else {
			Calculos.limiteTeorico = 700;
		}
	}

	public static double getResistenciaTracao() {
		return resistenciaTracao;
	}

	public static void setResistenciaTracao(double resistenciaTracao) {
		Calculos.resistenciaTracao = resistenciaTracao;
	}

}

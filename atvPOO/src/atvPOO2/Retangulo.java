package atvPOO2;

/**
 * A classe Retangulo representa um retângulo com altura e largura.
 */
public class Retangulo {
	private float altura, largura;

	/**
	 * Cria um retângulo com altura e largura inicializadas como 0.
	 */
	public Retangulo() {
		altura = 0;
		largura = 0;
	}

	/**
	 * Obtém a altura do retângulo.
	 *
	 * @return A altura do retângulo.
	 */
	public float getAltura() {
		return altura;
	}

	/**
	 * Define a altura do retângulo.
	 *
	 * @param alt A altura do retângulo.
	 */
	public void setAltura(float alt) {
		altura = alt;
	}

	/**
	 * Obtém a largura do retângulo.
	 *
	 * @return A largura do retângulo.
	 */
	public float getLargura() {
		return largura;
	}

	/**
	 * Define a largura do retângulo.
	 *
	 * @param larg A largura do retângulo.
	 */
	public void setLargura(float larg) {
		largura = larg;
	}

	/**
	 * Calcula a área do retângulo.
	 *
	 * @return A área do retângulo.
	 */
	public float calculaArea() {
		return altura * largura;
	}

	/**
	 * Calcula o perímetro do retângulo.
	 *
	 * @return O perímetro do retângulo.
	 */
	public float calculaPerimetro() {
		return 2 * altura + 2 * largura;
	}

	/**
	 * Retorna as informações do retângulo no formato: Altura: [altura] Largura:
	 * [largura] Área: [área] Perímetro: [perímetro]
	 *
	 * @return As informações do retângulo formatadas.
	 */
	public String exibe() {
		return "Altura: " + altura + "\nLargura: " + largura + "\nÁrea: " + calculaArea() + "\nPerímetro: "
				+ calculaPerimetro();
	}
}

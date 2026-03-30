
public enum DiaDaSemana {
	SEGUNDA,
	TERÇA,
	QUARTA,
	QUINTA,
	SEXTA,
	SÁBADO,
	DOMINGO;
	
	public DiaDaSemana plusDias(int dias) {
		DiaDaSemana[] valores = DiaDaSemana.values();
		int novoIndice = (this.ordinal() + dias) % valores.length;
		return valores[novoIndice];
	}
}

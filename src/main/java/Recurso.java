
public enum Recurso {
	
	DIRECAO_ELETRICA("DIRECAO_ELETRICA"),
	AR_CONDICIONADO("AR_CONDICIONADO"),	
	FREIO_ABS("FREIO_ABS");
	
	public static final Recurso[] ALL = { DIRECAO_ELETRICA, AR_CONDICIONADO, FREIO_ABS };
	
	private String nome;
	
	private Recurso(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

		
	

}

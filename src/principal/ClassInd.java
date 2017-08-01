package principal;

public enum ClassInd {

	LIVRE("Livre"), 
	DEZ_ANOS("10 Anos"), 
	DOZE_ANOS("12 Anos"),
	QUATORZE_ANOS("14 Anos"),
	DEZESSEIS_ANOS("16 Anos"),
	DEZOITO_ANOS("18 Anos");

	private final String status;
	
	ClassInd(String status) {
		this.status = status;
	}

	public String getValor() {
		return status;
	}
}
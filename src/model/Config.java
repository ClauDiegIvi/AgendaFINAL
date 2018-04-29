package model;

public class Config {
	private int mes;
	private int anio;
	private String idiomaEntrada;
	private String idiomaSalida;
	
	public Config() {}
	
	public Config(int anio, int mes, String idiomaEntrada, String idiomaSalida) {
		super();
		this.anio = anio;
		this.mes = mes;
		this.idiomaEntrada = idiomaEntrada;
		this.idiomaSalida = idiomaSalida;
	}

	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public String getIdiomaEntrada() {
		return idiomaEntrada;
	}
	public void setIdiomaEntrada(String idiomaEntrada) {
		this.idiomaEntrada = idiomaEntrada;
	}
	public String getIdiomaSalida() {
		return idiomaSalida;
	}
	public void setIdiomaSalida(String idiomaSalida) {
		this.idiomaSalida = idiomaSalida;
	}

	@Override
	public String toString() {
		return "Config [mes=" + mes + ", anio=" + anio + ", idiomaEntrada=" + idiomaEntrada + ", idiomaSalida="
				+ idiomaSalida + "]";
	}
}

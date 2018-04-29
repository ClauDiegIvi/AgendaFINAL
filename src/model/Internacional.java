package model;

import java.util.Arrays;

public class Internacional {
	
	private String agenda;
	private String[] dias;
	private String[] letrasInicialDias;
	private String[] meses;
	private String[] formatoFecha;
	private String dueno;
	
	public Internacional() {}

	public Internacional(String agenda, String[] dias, String[] letrasInicialDias, String[] meses,
			String[] formatoFecha, String dueno) {
		super();
		this.agenda = agenda;
		this.dias = dias;
		this.letrasInicialDias = letrasInicialDias;
		this.meses = meses;
		this.formatoFecha = formatoFecha;
		this.dueno = dueno;
	}

	public String getAgenda() {
		return agenda;
	}

	public void setAgenda(String agenda) {
		this.agenda = agenda;
	}

	public String[] getDias() {
		return dias;
	}

	public void setDias(String[] dias) {
		this.dias = dias;
	}

	public String[] getLetrasInicialDias() {
		return letrasInicialDias;
	}

	public void setLetrasInicialDias(String[] letrasInicialDias) {
		this.letrasInicialDias = letrasInicialDias;
	}

	public String[] getMeses() {
		return meses;
	}

	public void setMeses(String[] meses) {
		this.meses = meses;
	}

	public String[] getFormatoFecha() {
		return formatoFecha;
	}

	public void setFormatoFecha(String[] formatoFecha) {
		this.formatoFecha = formatoFecha;
	}

	public String getDueno() {
		return dueno;
	}

	public void setDueno(String dueno) {
		this.dueno = dueno;
	}

	@Override
	public String toString() {
		return "Internacional [agenda=" + agenda + ", dias=" + Arrays.toString(dias) + ", letrasInicialDias="
				+ Arrays.toString(letrasInicialDias) + ", meses=" + Arrays.toString(meses) + ", formatoFecha="
				+ Arrays.toString(formatoFecha) + ", due�o=" + dueno + "]";
	}
}
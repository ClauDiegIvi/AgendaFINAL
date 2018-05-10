package model;

import java.util.Arrays;

public class Internacional {
	
	private String agenda;
	private String[] dias;
	private String[] letrasInicialDias;
	private String[] meses;
	private String[] anios;
	private String hecho,
					closed,
					err;
	
	public Internacional() {}

	public Internacional(String agenda, String[] dias, String[] letrasInicialDias, String[] meses, String[] anios, String hecho, String closed, String err) {
		this.agenda = agenda;
		this.dias = dias;
		this.letrasInicialDias = letrasInicialDias;
		this.meses = meses;
		this.anios = anios;
		this.hecho = hecho;
		this.closed = closed;
		this.err = err;
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

	public String[] getAnios() {
		return anios;
	}

	public void setAnios(String[] anios) {
		this.anios = anios;
	}

	public String getHecho() {
		return hecho;
	}

	public void setHecho(String hecho) {
		this.hecho = hecho;
	}

	public String getClosed() {
		return closed;
	}

	public void setClosed(String closed) {
		this.closed = closed;
	}

	public String getErr() {
		return err;
	}

	public void setErr(String err) {
		this.err = err;
	}

	@Override
	public String toString() {
		return "Internacional{" +
				"agenda='" + agenda + '\'' +
				", dias=" + Arrays.toString(dias) +
				", letrasInicialDias=" + Arrays.toString(letrasInicialDias) +
				", meses=" + Arrays.toString(meses) +
				", anios=" + Arrays.toString(anios) +
				", hecho='" + hecho + '\'' +
				", closed='" + closed + '\'' +
				", err='" + err + '\'' +
				'}';
	}
}
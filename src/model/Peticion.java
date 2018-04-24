package model;

import java.util.Arrays;
import java.util.Date;

public class Peticion {
	
	private String actividad;
	private String nombreSala;
	private Date fechaInicio;
	private Date fechaFin;
	private String[] dias;
	private int[] periodoUno;
	private int[] periodoDos;
	
	public Peticion() {}

	public Peticion(String actividad, String nombreSala, Date fechaInicio, Date fechaFin, String[] dias,
			int[] periodoUno, int[] periodoDos) {
		super();
		this.actividad = actividad;
		this.nombreSala = nombreSala;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.dias = dias;
		this.periodoUno = periodoUno;
		this.periodoDos = periodoDos;
	}

	public String getActividad() {
		return actividad;
	}

	public void setActividad(String actividad) {
		this.actividad = actividad;
	}

	public String getNombreSala() {
		return nombreSala;
	}

	public void setNombreSala(String nombreSala) {
		this.nombreSala = nombreSala;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String[] getDias() {
		return dias;
	}

	public void setDias(String[] dias) {
		this.dias = dias;
	}

	public int[] getPeriodoUno() {
		return periodoUno;
	}

	public void setPeriodoUno(int[] periodoUno) {
		this.periodoUno = periodoUno;
	}

	public int[] getPeriodoDos() {
		return periodoDos;
	}

	public void setPeriodoDos(int[] periodoDos) {
		this.periodoDos = periodoDos;
	}

	@Override
	public String toString() {
		return "Peticion [actividad=" + actividad + ", nombreSala=" + nombreSala + ", fechaInicio=" + fechaInicio
				+ ", fechaFin=" + fechaFin + ", dias=" + Arrays.toString(dias) + ", periodoUno="
				+ Arrays.toString(periodoUno) + ", periodoDos=" + Arrays.toString(periodoDos) + "]";
	}
}

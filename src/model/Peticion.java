package model;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Peticion {
	
	private String actividad;
	private String nombreSala;
	private Date fechaInicio;
	private Date fechaFin;
	private List<Character> dias;
	private List<Integer> periodoUno;
	private List<Integer> periodoDos;
	
	public Peticion() {}

	public Peticion(String actividad, String nombreSala, Date fechaInicio, Date fechaFin, List<Character> dias,
                    List<Integer> periodoUno, List<Integer> periodoDos) {
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

	public List<Character> getDias() {
		return dias;
	}

	public void setDias(List<Character> dias) {
		this.dias = dias;
	}

	public List<Integer> getPeriodoUno() {
		return periodoUno;
	}

	public void setPeriodoUno(List<Integer> periodoUno) {
		this.periodoUno = periodoUno;
	}

	public List<Integer> getPeriodoDos() {
		return periodoDos;
	}

	public void setPeriodoDos(List<Integer> periodoDos) {
		this.periodoDos = periodoDos;
	}

	@Override
	public String toString() {
		return "Peticion [actividad=" + actividad + ", nombreSala=" + nombreSala + ", fechaInicio=" + fechaInicio
				+ ", fechaFin=" + fechaFin + ", dias=" + dias + ", periodoUno="
				+ periodoUno + ", periodoDos=" + periodoDos + "]";
	}
}

package modelo;

import java.util.Objects;

public class Envío {
	
	private String ciudad;
	private boolean origenNacional;
	private String ciudadDestino;
	private boolean destinoNacional;
	private String tipoEnvio;
	private int peso;
	private double precioTotal;
	

	public Envío() {
		this.ciudad="";
		this.origenNacional=true;
		this.ciudadDestino="";
		this.destinoNacional=true;
		this.tipoEnvio="";
		this.peso=0;
				
	}

	protected Envío(String ciudad, boolean origenNacional, String ciudadDestino, boolean destinoNacional,
			String tipoEnvio, int peso) {
	
		this.ciudad = ciudad;
		this.origenNacional = origenNacional;
		this.ciudadDestino = ciudadDestino;
		this.destinoNacional = destinoNacional;
		this.tipoEnvio = tipoEnvio;
		this.peso = peso;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public boolean isOrigenNacional() {
		return origenNacional;
	}

	public void setOrigenNacional(boolean origenNacional) {
		this.origenNacional = origenNacional;
	}

	public String getCiudadDestino() {
		return ciudadDestino;
	}

	public void setCiudadDestino(String ciudadDestino) {
		this.ciudadDestino = ciudadDestino;
	}

	public boolean isDestinoNacional() {
		return destinoNacional;
	}

	public void setDestinoNacional(boolean destinoNacional) {
		this.destinoNacional = destinoNacional;
	}

	public String getTipoEnvio() {
		return tipoEnvio;
	}

	public void setTipoEnvio(String tipoEnvio) {
		this.tipoEnvio = tipoEnvio;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ciudad, ciudadDestino, destinoNacional, origenNacional, peso, tipoEnvio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Envío))
			return false;
		Envío other = (Envío) obj;
		return Objects.equals(ciudad, other.ciudad) && Objects.equals(ciudadDestino, other.ciudadDestino)
				&& destinoNacional == other.destinoNacional && origenNacional == other.origenNacional
				&& peso == other.peso && Objects.equals(tipoEnvio, other.tipoEnvio);
	}
	
	public double calcularImporte() {
					
		return precioTotal;
	}
	

}

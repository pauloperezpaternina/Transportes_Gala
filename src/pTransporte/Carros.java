package pTransporte;

import java.awt.Color;

public class Carros {
	private String placa, marca, version, modelo, id_chofer, combustible;
	private Color color;
	private int id, numpuertas, cilindraje, puestos, valor;
	
	public Carros(String placa, String marca, String version, 
			String modelo, String id_chofer, String combustible, Color color,int id, int numpuertas, int cilindraje, int puestos, int valor) {
		super();
		this.setPlaca(placa);
		this.setMarca(marca);
		this.setVersion(version);
		this.setModelo(modelo);
		this.setColor(color);
		this.setId(id);
		this.setNumpuertas(numpuertas);
		this.setCilindraje(cilindraje);
		this.setPuestos(puestos);
		this.setValor(valor);
		
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumpuertas() {
		return numpuertas;
	}

	public void setNumpuertas(int numpuertas) {
		this.numpuertas = numpuertas;
	}

	public int getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}

	public int getPuestos() {
		return puestos;
	}

	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String getId_chofer() {
		return id_chofer;
	}

	public void setId_chofer(String id_chofer) {
		this.id_chofer = id_chofer;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}
	
}

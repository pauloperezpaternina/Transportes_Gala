package pTransporte;

public class Choferes {
	private String nombres, apellidos, genero, password, email;
	//private datetime fecha_nacim;
	private int cc, telefono; 

	
	public Choferes(String nombres, String apellidos, String genero, String password, String email, int cc,
			int telefono) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.genero = genero;
		this.password = password;
		this.email = email;
		this.cc = cc;
		this.telefono = telefono;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
}

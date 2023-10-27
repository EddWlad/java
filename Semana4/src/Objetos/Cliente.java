package Objetos;

public class Cliente extends Usuario {

	private String nombre;
	private String apellido;
	private String direccion;
	private String telefono;
	private String ci;
	private String correo;
	private boolean estado; // 1: activo, 0 :inactivo

	public void Pagar() {
		System.out.println("Estoy pagando");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCi() {
		return ci;
	}

	public void setCi(String ci) {
		this.ci = ci;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", telefono="
				+ telefono + ", ci=" + ci + ", correo=" + correo + ", estado=" + estado + "]";
	}

	public Cliente(String nombre, String apellido, String direccion, String telefono, String ci, String correo,
			boolean estado) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefono = telefono;
		this.ci = ci;
		this.correo = correo;
		this.estado = estado;
	}

	public Cliente() {

	}

	public Cliente(String nombre) {
		this.nombre = nombre;
	}

}

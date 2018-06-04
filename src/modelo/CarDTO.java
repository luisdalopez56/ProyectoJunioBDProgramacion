package modelo;
//POJO
public class CarDTO {

	private String Matricula;
	private String Marca;
	private String Modelo;
	private String Nombre_Cliente;
	private String Fecha_Entrada;
	
	
	
	public CarDTO(String matricula, String marca, String modelo, String nombre_Cliente, String fecha_Entrada) {
		Matricula = matricula;
		Marca = marca;
		Modelo = modelo;
		Nombre_Cliente = nombre_Cliente;
		Fecha_Entrada = fecha_Entrada;
	}
	
	public String getMatricula() {
		return Matricula;
	}
	public void setMatricula(String matricula) {
		Matricula = matricula;
	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	public String getNombre_Cliente() {
		return Nombre_Cliente;
	}
	public void setNombre_Cliente(String nombre_Cliente) {
		Nombre_Cliente = nombre_Cliente;
	}
	public String getFecha_Entrada() {
		return Fecha_Entrada;
	}
	public void setFecha_Entrada(String fecha_Entrada) {
		Fecha_Entrada = fecha_Entrada;
	}
	
	
}

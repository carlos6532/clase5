package clase5;

public class producto {
	
	// atributos de la clase
	private String nombre;
	private String codigo;
	private float precio;
	
	//crea el contructor
	
	public producto(String nombre, String codigo, float precio) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.precio = precio;
	}
	
	//getter y setter
	public String getnombre() {
		return nombre;
	}
	public void setnombre(String nuevonombre) {
		this.nombre = nuevonombre;
	}
	public String getcodigo() {
		return codigo;
	}
	public void setcodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public void setprecio(float precio) {
		this.precio = precio;
	}

	//otros metodos
	
	public float costoFinal() {
		return this.precio;
		
	}
	
	
}

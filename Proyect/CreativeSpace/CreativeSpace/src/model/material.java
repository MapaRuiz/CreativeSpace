package model;

public class material {
	
	private String nombre;
	private int precio;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}

    public material(){
        
    }

    public material(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "material{" + "nombre=" + nombre + ", precio=" + precio + '}';
    }
    
}
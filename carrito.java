package clase5;

import java.time.LocalDateTime;

public class carrito {
	
	private producto producto1;
    private producto producto2;
    private producto producto3;
    private LocalDateTime fechaCompra;
    
    public carrito(producto producto1, producto producto2, producto producto3, LocalDateTime fechaCompra) {
    	this.producto1 = producto1;
    	this.producto2 = producto2;
    	this.producto3 = producto3;
    	this.fechaCompra = fechaCompra;
    	
    }

	public producto getproducto1() {
		return producto1;
	}

	public void setproducto1(producto producto1) {
		this.producto1 = producto1;
	}

	public producto getproducto2() {
		return producto2;
	}

	public void setproducto2(producto producto2) {
		this.producto2 = producto2;
	}

	public producto getproducto3() {
		return producto3;
	}

	public void setproducto3(producto producto3) {
		this.producto3 = producto3;
	}

	public LocalDateTime getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(LocalDateTime fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
   public float costoFinal() {
	   return (this.producto1.costoFinal() + this.producto2.costoFinal() + this.producto3.costoFinal());
   }
}

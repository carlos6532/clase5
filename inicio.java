package clase5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.List;

public class inicio {

      public static void main(String[] args) {
		String archivoEntrada = "compras.txt";
		
		try {
			List<String> lista = Files.readAllLines(Paths.get(archivoEntrada));
			//String linea1 = lista.get(1); //"40 jabon 123f".split(" ")==[40'jabon,123f]
			String[] datosproducto1 = lista.get(1).split(" ");
			String[] datosproducto2 = lista.get(2).split(" ");
			String[] datosproducto3 = lista.get(3).split(" ");
			
			producto producto1 = new producto(datosproducto1[1], datosproducto1[2], Float.parseFloat(datosproducto1[0]));
			producto producto2 = new producto(datosproducto2[1], datosproducto2[2], Float.parseFloat(datosproducto2[0]));
			producto producto3 = new producto(datosproducto3[1], datosproducto3[2], Float.parseFloat(datosproducto3[0]));
			
			carrito carrito = new carrito(producto1, producto2, producto3, LocalDateTime.parse("2023-01-13T11:12:00"));
			persona persona1 = new persona("fer", "torres", LocalDateTime.parse("1980-03-13T11:12:00"), carrito );
	
			carrito micarrito = persona1.getCarrito();
			float resultado = micarrito.costoFinal();
			System.out.println(resultado);
			
		}catch(IOException e) {
			System.out.println("hubo un error en la operacion" + e);
		}
		
	
      
      
      
      }	
	
	}

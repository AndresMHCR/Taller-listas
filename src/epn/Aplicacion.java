package epn;

public class Aplicacion {

	public static void main(String[] args) {
		ListaEst listaest = new ListaEst();
		
		System.out.println("\nEstudiantes inscritos en la asignatura");
		 listaest.insertar("Sergio","1712365488");
		 listaest.insertar("Andres","1763255484");
		 listaest.insertar("Luis","1712365445");
		 listaest.insertar("Sergio","1712365488");
		 
		 
		 listaest.imprimir();
		 System.out.println("\n");

		 System.out.println("\nlista con Alimentos completados");
		 ListaCom listacom = new ListaCom();
		 listacom.insertar("3", "limon");
		 listacom.insertar("peras");
		 listacom.insertar("5","tomate");
		 listacom.insertar("1", "limon");
		 listacom.insertar("uvas");
		 listacom.insertar("7","manzana");
		 
		
		 listacom.imprimir();
	}

}

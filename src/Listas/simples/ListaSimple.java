package Listas.simples;

/**
 * Lista enlazada simple de numeros enteros.
 * Permite insertar al inicio y recorrer la lista imprimiendo sus valores.
 * @author Jose Alejandro Olvera Lugo
 * @date 15 octubre 2026
 */

public class ListaSimple {
	private Nodo primero;

	// Al crear la lista, esta empieza vacia
	public ListaSimple() {
		this.primero = null;
	}

	// Agrega un nodo nuevo al principio de la lista
	public void insertarInicio(int dato) {
		if (primero == null) {
			// Si la lista esta vacia, el nodo nuevo es el primero
			Nodo nodoNuevo = new Nodo(dato);
			primero = nodoNuevo;
		} else {
			// Primero enlazo el nodo nuevo con el primero actual y luego lo muevo
			Nodo nodoNuevo = new Nodo(dato);
			nodoNuevo.setSig(primero);
			primero = nodoNuevo;
		}
	}

	// Imprime todos los valores de la lista, de principio a fin
	public void recorrer() {
		Nodo actual = primero;
		while (actual != null) {
			System.out.print("valor " + actual.getValor() + " -> ");
			actual = actual.getSig();
		}
		System.out.println("null");
	}

	// Prueba rapida de la lista
	public static void main(String[] args) {
		ListaSimple miLista = new ListaSimple();
		miLista.insertarInicio(2);
		miLista.insertarInicio(3);
		miLista.recorrer();
	}
}
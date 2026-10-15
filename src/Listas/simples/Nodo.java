package Listas.simples;

/**
 * Clase que representa un nodo de la lista simple.
 * Cada nodo guarda un numero entero y la referencia al nodo que sigue.
 * @author Jose Alejandro Olvera Lugo
 * @date 15 octubre 2026
 */

public class Nodo {
	private int info;
	private Nodo proximo;

	// Crea un nodo con el numero recibido y sin nodo siguiente
	public Nodo(int numero) {
		this.info = numero;
		this.proximo = null;
	}

	// Regresa el numero guardado en el nodo
	public int getValor() {
		return info;
	}

	// Cambia el numero guardado en el nodo
	public void setValor(int info) {
		this.info = info;
	}

	// Regresa el nodo al que apunta este nodo
	public Nodo getSig() {
		return proximo;
	}

	// Cambia el nodo al que apunta este nodo
	public void setSig(Nodo proximo) {
		this.proximo = proximo;
	}
}
package test;

public class SelectionSort {
	public static void main(String[] args) {
		int[] vetor =new int[10];
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * vetor.length);
		}
		
		System.out.println("Desordenado");
		System.out.print("[");
		for (int i = 0; i < vetor.length; i++) {
		    System.out.print(vetor[i]);
		    if (i != vetor.length - 1) {
		        System.out.print(", ");
		    }
		}
		System.out.println("]");
		
		// Selection Sort
		int posicaoMenor, aux;
		for(int i = 0; i < vetor.length; i++) {
			posicaoMenor = i;
			for(int j = i+1; j < vetor.length; j++) {
				if(vetor[j] < vetor[posicaoMenor]) {
					posicaoMenor = j;
				}
			}
			aux = vetor[posicaoMenor];
			vetor[posicaoMenor] = vetor[i];
			vetor[i] = aux;
		}
		
		System.out.println("\n\nOrdenado");
		System.out.print("[");
		for (int i = 0; i < vetor.length; i++) {
		    System.out.print(vetor[i]);
		    if (i != vetor.length - 1) {
		        System.out.print(", ");
		    }
		}
		System.out.println("]");
		
	}
}

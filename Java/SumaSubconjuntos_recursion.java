/*
De una lista de enteros verificar si la suma de un subconjunto da un entero K.
Algoritmo O(NK)
*/

public class SumaSubconjuntos_recursion{
    public static void main (String args[]) { 
        int lista[] = {3, 34, 4, 12, 5}; 
        int k = 9; 
        int n = lista.length; 
        if (recursion(lista, n, k) == true) 
            System.out.println("Existe subconjunto que sume " + k); 
        else
            System.out.println("No existe subconjunto que sume " + k); 
    } 

    static boolean recursion(int lista[], int n, int suma) { 
        if (suma == 0) 
            return true; 
        if (n == 0 && suma != 0) 
            return false; 
        if (lista[n-1] > suma) 
            return recursion(lista, n-1, suma); 
        return recursion(lista, n-1, suma) || recursion(lista, n-1, suma - lista[n-1]); 
    } 
}
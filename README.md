# Secuencia-Collatz
Creador: Erick Bustamante Cruz


 La actividad consistió en intentar programar en java el sistema Collatz en donde si el número es par, se divide entre 2, y si el número es impar, se multiplica por 3 y se le suma 1; también, debíamos de hacer de condicionales como if, y bucles for.

 ```java
public class collatz {
    public static void main(String[] args) {
        System.out.println("Sistema para encontrar la conejtura de Collatz");
        System.out.println("Desarrollada por Erick Bustamante Cruz");
        int x=Integer.parseInt(System.console().readLine("Ingrese un número entero positivo: "));
        if (x==1){
            System.out.printf("Secuencia de Collatz: ");
            System.out.print(x + ". ");
        } else if (x>1){
            System.out.printf("Secuencia de Collatz: ");
            System.out.print(x + ", ");
            for (;x!=1;){
                if (x%2==0){
                    x/=2;
                } else {
                    x = x*3 + 1;
                }
                if (x>1){
                    System.out.print(x + ", ");
                } else {
                    System.out.println(x + ". ");
                }
            }
        } else {
            System.out.println("Ese no es un número entero positivo");
        }
    }
}
``` 


<img width="557" height="74" alt="image" src="https://github.com/user-attachments/assets/cf660114-4f17-4adf-be34-b47634b35bd0" />


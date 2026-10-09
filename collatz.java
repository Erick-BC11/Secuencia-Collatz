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
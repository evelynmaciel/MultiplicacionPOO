import java.util.Scanner;

public class MainMultiplicacion {
public static void main(String[] args) {
 Scanner n1 = new Scanner(System.in);
System.out.println("Ingresa un numero: ");

int a = n1.nextInt();
System.out.println("Ingresa el segundo numero: ");
 int b = n1.nextInt();
int r = a * b;
Multiplicacion m1 = new Multiplicacion();
 m1.a=a;
 m1.b=b;
 m1.multiplicar(a, b);

System.out.println("El resultado es :"+ m1.multiplicar(a, b));

}
    
}

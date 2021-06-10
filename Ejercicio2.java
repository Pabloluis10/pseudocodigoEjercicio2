import java.util.*;

public class Ejercicio2{
	public static void main(String[] args){

		Scanner entrada = new Scanner(System.in);
		int num;
		
		System.out.print("Ingrese un número (N): ");
		num = entrada.nextInt();

		System.out.println("Los número desde "+num +" hasta 1 son:");

		for(int i=num; i>0; i--){
			System.out.print("-"+i+"-");
		}
		System.out.println();
	}
}
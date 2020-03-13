import java.util.Scanner;
public class e01{
	static int Min; //Duvidas sobre essa relacao de variaveis estaticas com metodos estaticos
	static int Max;
	public static void main(String[] args){ //Aparentemente o main precisa ser estatico, aí os demais métodos precisam também.
		min();
		max();
		prim(Min,Max);
	}
	public static void min(){ //se removo o 'static', o método min não pode ser refenciado do main (static)
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o valor minimo: ");
		do{
			Min = ler.nextInt();
			if (Min < 10000) System.out.println("Valor deve ser pelo menos 10000");
		}while(Min<10000);
	}
	public static void max(){
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o valor maximo: ");
		do{
		Max = ler.nextInt();
		if (Max < Min) System.out.println("Valor maximo menor que o minimo:\nMax("+Max+") < Min("+Min+")");
		}while(Max < Min && Max > 99999);
	}
	public static void prim(int Min, int Max){
		for (int i= Min; i<=Max;i++){
			boolean p = true;
			int div = 2;
			while (div<i && p)
				if (i%div++==0) p=false;
			if (p) System.out.println("Número "+i+" e primo");
		} 
	}
}

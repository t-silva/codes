import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
class e12{
	public static void exibe(int V[], int N){
	System.out.print("Vetor = [");
	for (int i=0;i<N;i++) 
		System.out.print(i<N-1? +V[i]+"," : V[i]+"]");
	}
	public static void main(String args[]){
		Scanner ler =  new Scanner(System.in);
		int N=0;
		while(N<=0 || N>50){
			System.out.print("Quantos elementos no vetor (Entre 1 e 50): ");
			N = ler.nextInt();

		}
		//int R[] = new int[N];
		ArrayList<Integer> R = new ArrayList<Integer>();
		Random gera = new Random();
		for (int i=0;i<N;i++){
			//R[i] = -10 + gera.nextInt(20);
			R.add(-10+gera.nextInt(20));
		}
		System.out.println("Lista: " +R);
		//exibe(R,N);
		//int x;
		//while(1==1){
		//	System.out.print("\nDigite um valor para eliminar: ");
		//	x = ler.nextInt();
		//	int aux=N;
		//	for (int i=0;i<N-aux;i++){
		//		if(R[i]==x) 
		//			for(;i<N;i++) 
		//				R[i] = R[i+1];
		//	
		//	}
		//	exibe(R,N);
		}

	
	}

//}

#include<stdio.h>
int palindromo(int n){
	int rev=0,aux=n;
	while(n>0){
		rev*=10;
		rev+=n%10;
		n/=10;
	}
	if(rev==aux) return 1;
	else return 0;
}
int main(void){
	int n=0;
	while(n<1){printf("Entre com um número >=1: ");scanf("%d",&n);}
	printf("%d",palindromo(n));
return 0;
}

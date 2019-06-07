#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#define MAX 100 //tamanho maximo do vetor 

void preencher_vetor_aleatorio(float []); //prototipo das funcoes
void exibe_vetor_float(float *);
int aleatorio(int n);


main(){
	float x[MAX];
	srand(time(NULL)); //inicializa gerador
	preencher_vetor_aleatorio(x);
	exibe_vetor_float(x);
	getchar();
	return 0; 
}

void exibe_vetor_float(float v[]){
	int t;
	printf("\nO vetor digitado eh:\n");
	for(t=0;t<MAX;t++){
		printf("\t%4.2f ",v[t]);
		
	}
	
}

void preencher_vetor_aleatorio(float vet[]){ // preenche com valores aleatorios do tipo float
	int i;
	float valor, num;
	for(i=0;i<MAX;++i){
		num = 1 + aleatorio(200); //gera divisor para gerar float 
		
		valor = (1 + (10/num))+aleatorio(10-1); //gera ate 100
		vet [i] = valor;
	}
	
}

int aleatorio(int n){
	return rand()%n;
}
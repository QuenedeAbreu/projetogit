#include <stdio.h>
#include <stdlib.h>
#include <conio.h>

typedef struct{
	char NomeCompleto[80];
	char sexo;
	int ano_nascimento;

}PerfilSaude;
PerfilSaude lerInformacoes();
void calc_idade(PerfilSaude pont);

int main(){
	PerfilSaude saude;
	saude = lerInformacoes();
	

	
	calc_idade(saude);
	
return 0;
}


PerfilSaude lerInformacoes(){
	PerfilSaude saude;
	printf("Informe o seu nome: ");
	scanf("%80[^\n]s",&saude.NomeCompleto);
	
	printf("Informe o seu sexo: ");
	scanf("%s",&saude.sexo);
	
	
	printf("Informe o seu ano de nascimento: ");
	scanf("%d",&saude.ano_nascimento);
	return saude;
}

void calc_idade(PerfilSaude pont){
	int idade;
	
	idade = 2019 - pont.ano_nascimento;
	printf("sua idade é :%d anos",idade);
}

public class Pessoa {
String nome;
double peso;
double altura;
String dataDeNascimento;

public Pessoa(String nome, double peso, double altura, String dataDeNascimento) {
this.nome = nome;
this.peso = peso;
this.altura = altura;
this.dataDeNascimento = dataDeNascimento;
}
public String imc() {
/*
Abaixo de 18,5 Abaixo do Peso
Entre 18,6 e 24,9 Peso Ideal
Entre 25,0 e 29,9 Levemente acima do peso
Entre 30,0 e 34,9 Obesidade Grau I
Entre 35,0 e 39,9 Obesidade Grau II
Acima de 40 Obesidade Grau III (mórbida)
*/
double imc = (peso / (altura * altura));
if (imc <= 18.5) {
return "O IMC é " + imc + " estando Abaixo do Peso Ideal";
} else if (imc <= 24.9) {
return "O IMC é " + imc + " estando no Peso Ideal";
} else if (imc <= 29.9) {
return "O IMC é " + imc + " estando Levemente acima do peso";
} else if (imc <= 34.9) {
return "O IMC é " + imc + " estando em Obesidade Grau I";
} else if (imc <= 39.9) {
return "O IMC é " + imc + " estando em Obesidade Grau II";
} else {
return "O IMC é " + imc + " estando em Obesidade Grau III (mórbida)";
}
}
}

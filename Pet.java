public class Pet {
    String nome;
    String especie;
    int idade;
    double valorServico;

    public Pet(String nome, String especie, int idade, double valorServico){
      this.nome = nome;
      this.especie = especie;
      this.idade = idade;
      this.valorServico = valorServico;
    }

    public void exibirInformacoes(){
      System.out.println("Nome: " + nome );
      System.out.println("Espécie: " + especie);
      System.out.println("Idade: " + idade);
      System.out.println("Valor do Serviço: " + valorServico);
    }

    public void calcularValorComDesconto(){
      System.out.println("Valor do serviço com desconto de 10%: " + (valorServico - valorServico * 0.10));
    }

    public static void main(String[] args) {

        Pet pet1 = new Pet("Thor", "Cachorro", 5, 100.00);
        Pet pet2 = new Pet("Mimi", "Gato", 3, 80.00);
        Pet pet3 = new Pet("Nina", "Cachorro", 2, 120.00);

        pet1.exibirInformacoes();
        pet1.calcularValorComDesconto();

        System.out.println();

        pet2.exibirInformacoes();
        pet2.calcularValorComDesconto();

        System.out.println();

        pet3.exibirInformacoes();
        pet3.calcularValorComDesconto();
    }

}

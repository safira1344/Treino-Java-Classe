public class Cachorro{
    public String nome;
    private int idade;
    public boolean vacinado;
    public String raca;

    public Cachorro(String nome, int idade, boolean vacinado, String raca){  //metodo construtor
        this.nome = nome;   //senao colocar this procura na propria classe
        this.idade = idade;
        this.vacinado = vacinado;
        this.raca = raca;
    }

    public void incrementarIdade(){   //método da classe Cachorro
        this.idade+=7;
    }

    public int getIdade(){
        return this.idade;
    }
}


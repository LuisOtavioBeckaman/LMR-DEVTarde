package RevisaoFPOO.Cadastro;

public class Outros extends Animais {
    //Atributos
    String raca;
    int idade;

    //métodos
    //construtor cheio
    public Outros(String raca, int idade) {
        this.raca = raca;
        this.idade = idade;
    }
    //construtor vazio
     public Outros() {
    }
    
    //gets and sets
    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
}

package unicapfood;

public class Cliente {

    private String nome;
    private int[] cpf;
    private String senha;
    
    
    public Cliente(String nome, int[] cpf, String senha) {
        this.nome = nome;
        this.cpf = new int[11];
        this.senha = senha;
    }

    
}




package unicapfood.Clientes;

public class Cliente {

    private String nome;
    private int[] cpf;
    private String senha;
    
    
    public Cliente(String nome, int[] cpf, String senha) {
        this.nome = nome;
        this.cpf = new int[11];
        this.senha = senha;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public int[] getCpf() {
        return cpf;
    }


    public void setCpf(int[] cpf) {
        this.cpf = cpf;
    }


    public String getSenha() {
        return senha;
    }


    public void setSenha(String senha) {
        this.senha = senha;
    }

    
}




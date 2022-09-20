package unicapfood;

public class Ferramentas {
    // Atributo
    private LSENode primeiro;

    // Métodos públicos
    public boolean isEmpty() { 
        // testa se a lista está vazia
        if (this.primeiro == null) {
            return true;
        } else {
            return false;
        }
    }

    public void inserirCliente(Cliente cliente) { 
        // verifica, usando o "buscar", se o Cliente já é cadastrado.
        LSENode aux = this.primeiro;
        LSENode result = this.buscar(cliente);
        if (result != null){
            System.out.println("O Cliente já está na lista!");
        } else {
            // insere um novo cliente no final de lista
            LSENode novo = new LSENode(cliente);
            if (this.isEmpty() == true) {
                this.primeiro = novo;
            } else {
                while (aux.getProx() != null){
                    aux = aux.getProx();
                }
                aux.setProx(novo);
            }
            System.out.println("Cadastro efetuado!");
        }
    }

    public void inserirPedido(Pedido pedido) { 
        LSENode aux = this.primeiro;
            // insere um novo item no final de lista de pedidos / na comanda
            LSENode novo = new LSENode(pedido);
            if (this.isEmpty() == true) {
                this.primeiro = novo;
            } else {
                while (aux.getProx() != null){
                    aux = aux.getProx();
                }
                aux.setProx(novo);
            }
            System.out.println("Inserção efetuada!");
        }
    }

    public LSENode buscar(Pedido pedido) {
        LSENode aux;
        if (this.isEmpty() == true) {
            return null;
        } else {
            aux = this.primeiro;
            while (aux != null) {
                if (aux.getInfo().compareTo(pedido) == 0) {
                    return aux;
                } else {
                    aux = aux.getProx();
                }
            }
            return null;
        }
    }

    public void removerPrimeiro(){
        LSENode aux = this.primeiro;

        if(this.isEmpty() == true){
            System.out.println("Lista Vazia!");
        } else {
            aux = aux.getProx();
            this.primeiro = aux;
        }
    }

    public void removerUltimo(){
        LSENode aux = this.primeiro;
        LSENode provUltimo = null;

        if(this.isEmpty() == true){
            System.out.println("Lista Vazia!");
        } else {
            while (aux.getProx() != null){
                provUltimo = aux;
                aux = aux.getProx();
            }
            provUltimo.setProx(null);
        }
    }

    public void exibir() {
        // exibe o conteúdo de todos os nós da lista
        LSENode aux;
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!");
        } else {
            aux = this.primeiro;
            while (aux != null) {
                System.out.println(aux.getInfo());
                aux = aux.getProx();
            }
        }
    }

    public void exibirEspecifico(Aluno al){
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!");
        } else if (al.getMatr() != null) {
            System.out.println(al.getMatr() + " " +  al.getNome() + " " + al.getMedia() + " " + al.getFaltas());
        }
        
    }

    public void inserirNovaMedia(String nome, String matr, double media){
        Aluno aluno = new Aluno(matr, nome);
        if (this.isEmpty() == true) {
            System.out.println("Aluno inválido!");
        } else if (matr != null) {
            aluno.setMedia(media);
        }
        System.out.println(aluno.getMedia());
    }

    public void inserirNovasFaltas(Aluno al, int faltas){
        if (this.isEmpty() == true) {
            System.out.println("Aluno inválido!");
        } else if (al.getMatr() != null) {
            al.setFaltas(faltas);
        }
        System.out.println(al.getFaltas());
    }

    public void removerAlunoEspecifico(){
        Aluno proc = new Aluno(matr);
        LSENode atual, anterior;
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!");
        } else if (this.primeiro.getProx() == null) {
            if (proc.compareTo(this.primeiro.getInfo()) == 0) {
                this.primeiro = null;
                System.out.println("Remoção efetuada");
            } else {
                System.out.println("Aluno não encontrado!");
            }
        } else { // lista com mais de um nó
            if (proc.compareTo(this.primeiro.getInfo()) == 0) { // remoção do primeiro
                this.primeiro = this.primeiro.getProx();
                System.out.println("Remoção efetuada");
            } else {
                anterior = null;
                atual = this.primeiro;
                while (atual != null) {
                   if (atual.getInfo().compareTo(proc) != 0 ) {
                    anterior = atual;
                    atual = atual.getProx();
                   }
                   else {
                       break; // achou!!!
                   }
                }
                if (atual == null) {
                    System.out.println("Valor não pertence a lidta!");
                }
                else {
                    anterior.setProx(atual.getProx());
                    System.out.println("Remoção efetuada!");
                }
            }
        }
    }
}
}

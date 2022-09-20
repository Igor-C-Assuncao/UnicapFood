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
        if (result != null) {
            System.out.println("O Cliente já está na lista!");
        } else {
            // insere um novo cliente no final de lista
            LSENode novo = new LSENode(cliente);
            if (this.isEmpty() == true) {
                this.primeiro = novo;
            } else {
                while (aux.getProx() != null) {
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
            while (aux.getProx() != null) {
                aux = aux.getProx();
            }
            aux.setProx(novo);
        }
        System.out.println("Inserção efetuada!");
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

    public LSENode buscar(Cliente cliente) {
        LSENode aux;
        if (this.isEmpty() == true) {
            return null;
        } else {
            aux = this.primeiro;
            while (aux != null) {
                if (aux.getInfo().compareTo(cliente) == 0) {
                    return aux;
                } else {
                    aux = aux.getProx();
                }
            }
            return null;
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

    public void removerAlunoEspecifico() {
        Pedido pd = new Pedido(item);
        LSENode atual, anterior;
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!");
        } else if (this.primeiro.getProx() == null) {
            if (pd.compareTo(this.primeiro.getInfo()) == 0) {
                this.primeiro = null;
                System.out.println("Remoção efetuada");
            } else {
                System.out.println("Aluno não encontrado!");
            }
        } else { // lista com mais de um nó
            if (pd.compareTo(this.primeiro.getInfo()) == 0) { // remoção do primeiro
                this.primeiro = this.primeiro.getProx();
                System.out.println("Remoção efetuada");
            } else {
                anterior = null;
                atual = this.primeiro;
                while (atual != null) {
                    if (atual.getInfo().compareTo(pd) != 0) {
                        anterior = atual;
                        atual = atual.getProx();
                    } else {
                        break; // achou!!!
                    }
                }
                if (atual == null) {
                    System.out.println("Valor não pertence a lidta!");
                } else {
                    anterior.setProx(atual.getProx());
                    System.out.println("Remoção efetuada!");
                }
            }
        }
    }
}
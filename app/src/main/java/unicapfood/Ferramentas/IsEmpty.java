package unicapfood.Ferramentas;


public class IsEmpty {

    

    public static boolean isEmpty() {
        // testa se a lista está vazia
        if (LSENode.primeiro == null) {
            return true;
        } else {
            return false;
        }
    }
    
}

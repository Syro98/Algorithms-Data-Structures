package April18.JavaAux;

public class Driver {

    public static void main(String[] argv) {

    	BST b1 = new BST();
        b1.BST_insert(3);
        b1.BST_insert(12);
        b1.BST_insert(7);
        b1.BST_insert(5);
        b1.BST_insert(1);
        b1.BST_insert(7);
        b1.BST_insert(15);
        b1.BST_insert(1);
        b1.BST_insert(8);
        b1.BST_insert(7);
        b1.BST_insert(12);

    	BST b2 = new BST();
    	
        BinNode root = b2.BST_insert(13);
        if (root!=null){
            BinNode l1 = root.setLeft(new BinNode(5));
            BinNode r1 = root.setRight(new BinNode(20));
            l1.setLeft(new BinNode(3));
            l1.setRight(new BinNode(17));
            r1.setRight(new BinNode(25));
        }


        System.out.println("\t Primo Albero: ");
        b1.BST_print();

        System.out.print("Test BST: ");
        int BSTresult=b1.isBST();
        if (BSTresult == -1){
            System.out.println("Funzione non implementata");     
        }else if (BSTresult == 0){
            System.out.println("Albero non BST");     
        }else{
            System.out.println("Albero BST");     
        } 

        System.out.print("Test Balanced: ");
        int balresult=b1.isBalanced();
        if (balresult == -1){
            System.out.println("Funzione non implementata");     
        }else if (balresult == 0){
            System.out.println("Albero non bilanciato");     
        }else{
            System.out.println("Albero bilanciato");     
        } 

        System.out.println("-------------------");
        System.out.println("\t Secondo Albero: ");
        b2.BST_print();

        System.out.print("Test BST: ");
        BSTresult=b2.isBST();
        if (BSTresult == -1){
            System.out.println("Funzione non implementata");     
        }else if (BSTresult == 0){
            System.out.println("Albero non BST");     
        }else{
            System.out.println("Albero BST");     
        } 

        System.out.print("Test Balanced: ");
        balresult=b2.isBalanced();
        if (balresult == -1){
            System.out.println("Funzione non implementata");     
        }else if (balresult == 0){
            System.out.println("Albero non bilanciato");     
        }else{
            System.out.println("Albero bilanciato");     
        } 


    }
}

public class Node {
    private int nilai;
    private Node next;

    //inisialisasi Node
    public Node (int nilai) {
        this.nilai = nilai;

    }
    
    // setter & getter
}

public class NodeMain {
    public static void main(String[] args) {
        
        //Membuat 2 buah node n1 dan n2
        Node n1 = new Node(5);
        Node n2 = new Node(7);

        //Membuat relasi Node n1 dan n2
        n1.setNext(n2);

        //Menampilkan node n1 dan n2 dengan pointer p
        Node = p n1;
        while(p !=null)
        {
            System.out.printtf ("%d", p.getNilai ());
            p = p.getNext();
        }    
    }
}
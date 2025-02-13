public class NodeMain {
    public static void main (String [] args) {
        
        //Membuat 2 buah node n1 dan n2
        Node n1 = new Node (5);
        Node n2 = new Node (7);

        //Membuat relasi Node n1 dan n2
        n1.seNext(n2);

        ////Menampilkan mode n1 dan n2 dengan Pointer P
        Node p =n1;
        while(p !=null)
        {
            System.out.printf("%d",p.getNilai ());
            p = p.getNext();
        }
    }
}
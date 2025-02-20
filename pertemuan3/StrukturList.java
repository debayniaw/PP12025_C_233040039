package pertemuan3;

public class StrukturList {
    private Node HEAD;

    public StrukturList() {
        this.HEAD = null;
    }

    // Fungsi untuk mengecek apakah list kosong
    public boolean isEmpty() {
        return HEAD == null;
    }

    // Fungsi untuk menambahkan elemen di akhir list (addTail)
    public void addTail(int data) {
    	Node posNode=null, curNode=null;
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } 
        else 
        {
            curNode = HEAD;
            while (curNode != null) {
            	posNode = curNode;
                curNode = curNode.getNext();
            }
            posNode.setNext(newNode);
        }
    }

// Fungsi untuk menambahkan elemen di awal list (addHead)
    public void addHead(int data) {
    Node newNode = new Node(data);
    if (isEmpty()) {
        HEAD = newNode;
    } else {
        newNode.setNext(HEAD);
        HEAD = newNode;
    }
}

// Fungsi untuk menampilkan elemen list
    public void displayElement() {
    Node curNode = HEAD;
    while (curNode != null) {
        System.out.print(curNode.getData() + " ");
        curNode = curNode.getNext();
    }
    System.out.println();
}
}
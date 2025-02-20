package pertemuan3;

public class ListMain {
    public static void main(String[] args) {
        // Tes-1 (Output: 3 2 1)
        StrukturList list1 = new StrukturList();
        list1.addHead(1);
        list1.addHead(2);
        list1.addHead(3);
        System.out.print("Tes-1 (a): ");
        list1.displayElement();

        // Tes-1 (Output: 1 4 5 7)
        StrukturList list2 = new StrukturList();
        list2.addTail(1);
        list2.addTail(4);
        list2.addTail(5);
        list2.addTail(7);
        System.out.print("Tes-1 (b): ");
        list2.displayElement();

        // Tes-2 (Output: 3 4 5)
        StrukturList list3 = new StrukturList();
        list3.addHead(5);
        list3.addHead(4);
        list3.addHead(3);
        System.out.print("Tes-2: ");
        list3.displayElement();

        // Tes-3 (Output: 3 2 1 dan 1 4 5 7)
        StrukturList list4 = new StrukturList();
        list4.addHead(1);
        list4.addHead(2);
        list4.addHead(3);
        System.out.print("Tes-3 (a): ");
        list4.displayElement();

        StrukturList list5 = new StrukturList();
        list5.addTail(1);
        list5.addTail(4);
        list5.addTail(5);
        list5.addTail(7);
        System.out.print("Tes-3 (b): ");
        list5.displayElement();
    }
}
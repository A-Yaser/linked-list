public class Main {
    public static void main(String[] args) {
        LinkedList myList= new LinkedList();
        LinkedList list = new LinkedList();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);

        list.display();
        System.out.println("/////////////");
        list.add(250,1);
        list.delete(300);
        list.display();


    }
}
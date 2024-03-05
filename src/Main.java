public class Main {
    public static void main(String[] args) {
        Stack stack1 = new Stack(10);
        stack1.push(10);
        stack1.push(9);
        stack1.push(8);
        stack1.push(7);
        stack1.pop();
        stack1.display();


        System.out.println(stack1.getTop());
    }
}
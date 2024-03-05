public class Stack {
    int size;
    int mainArr[];
    int top;


    Stack(int size){
        this.size= size;
        top= -1;
        mainArr= new int[this.size];

    }


    void push(int val){


        if(top != size){
            if (top<0){
                top++;
            }
            mainArr[top]= val;
            top ++;
        }
        else {System.out.println("the stack is full");}

    }

    int pop(){
        int temp= mainArr[top];
        if (!isEmpty())
        top--;
        return temp;
    }


    void display(){
        if (!isEmpty()){
            for(int i=0;i<top;i++){
                System.out.println(mainArr[i]);
            }}else {
            System.out.println("the Stack is empty");
        }
    }

    int getTop(){
        return mainArr[top];
    }



    boolean isEmpty(){
        return mainArr.length ==0;
    }

}

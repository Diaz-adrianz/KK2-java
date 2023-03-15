class Stack {
    private final int MAX = 10;
    private int[] stack = new int[MAX];
    private int atas;

    Stack() {
        atas = -1;
    }

    void push (int nilai) {
        if (atas != MAX - 1) 
            stack[++atas] = nilai;
        else 
            System.out.println("Stack penuh...");
    }

    int pop() {
        if (atas >= 0) {
            return stack[atas--];
        }  else {
            System.out.println("Stack masih kosong");
            return 0;
        }
    }
}
public class DemoFinal {
    public static void main(String[] args) {
        Stack stack = new Stack();

        for (int i = 1; i <= 10; i++) {
            stack.push(i*10);
        }

        for (int i = 1; i <=10; i++) {
            System.out.println(stack.pop());
        }
    }
}

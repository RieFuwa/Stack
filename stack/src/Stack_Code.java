import java.util.Scanner;
import java.util.Stack;

class Stack_Code {
    static int top = -1;

    static void Stack_Push(Stack<Integer> stack) {
        top++;
        System.out.println("Push Operation: ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        stack.push(x);
    }


    static void Stack_Pop(Stack<Integer> stack) {


        if (top < 0) {
            System.out.println("There's no any element to pop.");
        } else {
            System.out.println("Pop Operation:");
            Integer y = stack.pop();
            System.out.println(y);
            top--;
        }

    }


    static void Stack_Peek(Stack<Integer> stack) {
        Integer element = stack.peek();
        System.out.println("Element on stack top: " + element);
    }


    static void Stack_Search(Stack<Integer> stack) {
        System.out.println("Search Element : ");

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        Integer pos = stack.search(x);

        if (pos == -1)
            System.out.println("Element not found.");
        else
            System.out.println("Element is found at position: " + pos);
    }


    public static void main(String[] args) throws InterruptedException {
        Stack<Integer> stack = new Stack<Integer>();

        Scanner input = new Scanner(System.in);
        System.out.println("1-) PUSH    ");
        System.out.println("2-) POP     ");
        System.out.println("3-) PEEK    ");
        System.out.println("4-) SEARCH  ");
        System.out.println("5-) EXIT    \n");
        boolean control = true;
        while (control) {
            System.out.println("Choose your operation : ");

            int a = input.nextInt();
            switch (a) {
                case 1:
                    Stack_Push(stack);
                    break;
                case 2:
                    Stack_Pop(stack);
                    break;
                case 3:
                    Stack_Peek(stack);
                    break;
                case 4:
                    Stack_Search(stack);
                    break;
                case 5:
                    System.out.println("Goodbye.. ");
                    Thread.sleep(2000);
                    control = false;
            }
        }
    }
}
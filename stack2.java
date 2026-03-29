import java.util.*;

public class stack2 {

    // Custom Stack using ArrayList
    static class StackCustom {
        private ArrayList<Integer> list = new ArrayList<>();

        // check empty
        public boolean isEmpty() {
            return list.size() == 0;
        }

        // push
        public void push(int data) {
            list.add(data);
        }

        // pop
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // peek
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {

        StackCustom s = new StackCustom();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        System.out.println("Popped: " + s.pop()); // 4
        s.push(5);

        System.out.println("Popped: " + s.pop()); // 5
        s.push(6);

        System.out.println("Stack elements (top to bottom):");

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
package Latihan1;


class Staack {
    private int maxSize;
    private String[] stackName;
    private int top;

    public Staack(int a)
    {
        maxSize = a;
        stackName  = new String[maxSize];
        top = -1;
    }

    public void push (String j)
    {
        stackName[++top] = j;
    }

    public String pop ()
    {
        return stackName[top--];
    }

    public String peek ()
    {
        return stackName[top];
    }

    public boolean isEmpty ()
    {
        return (top == -1);
    }

    public boolean isFull ()
    {
        return (top == maxSize-1);
    }


    public void search(String j) {
        int count = top;
        while (count != -1 && count > 1)
        {
            System.out.println(pop());
            count--;
        }
    }
}

public class ExampleStack {

    public static void main(String[] args) {

        Staack st = new Staack(10);

        st.push("aku");
        st.push("anak");
        st.push("Indonesia");

        System.out.println("Next element: \n" + st.peek());
        st.push("Raya");
        System.out.println(st.pop());
        st.push("!");

        st.search("Raya");


//        System.out.println(st.pop());
//        System.out.println(st.isEmpty());
    }
}
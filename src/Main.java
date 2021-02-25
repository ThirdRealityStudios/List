public class Main
{
    public static void main(String[] args)
    {
        List l = new List();

        l.append("Hello world!");
        l.append(23);

        printAll(l);

        l.remove();
        l.append(8.12312d);

        printAll(l);

        l.remove();
        l.remove();

        // List is empty now..

        System.out.println("> list is empty now <");
        System.out.println();

        l.append(123);
        l.toLast();
        l.insert(89);
        l.insert("test");

        printAll(l);
    }

    public static void printAll(List l)
    {
        for(int i = 0; i < l.size(); i++)
        {
            System.out.println("(" + i + "): " + l.get(i));
        }

        System.out.println();
    }

    public static void printFront(List l)
    {
        System.out.println("Object on front: " + l.front() + " | size = " + l.size());
        System.out.println();
    }
}

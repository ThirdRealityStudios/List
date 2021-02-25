public class Node
{
    private Node next;

    private Object content;

    public Node(Object content)
    {
        this.content = content;
    }

    public void setNext(Node next)
    {
        this.next = next;
    }

    public Node getNext()
    {
        return next;
    }

    public void setContent(Object content)
    {
        this.content = content;
    }

    public Object getContent()
    {
        return content;
    }
}
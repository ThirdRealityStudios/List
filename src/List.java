public class List
{
    private Node first, current, last;

    private int size = 0;

    public boolean isEmpty()
    {
        return first == null;
    }

    public boolean hasAccess()
    {
        return current != null;
    }

    public Object front()
    {
        return last.getContent();
    }

    public void next()
    {
        if(!isEmpty() && hasAccess() && current != last)
        {
            current = current.getNext();
        }
    }

    public void toFirst()
    {
        if(!isEmpty())
        {
            current = first;
        }
    }

    public void toLast()
    {
        if(!isEmpty())
        {
            current = last;
        }
    }

    public Object getObject()
    {
        if(hasAccess())
        {
            return current.getContent();
        }
        else
        {
            return null;
        }
    }

    public void setObject(Object pObject)
    {
        if(hasAccess() && pObject != null)
        {
            current.setContent(pObject);
        }
    }

    public void append(Object pObject)
    {
        if(pObject != null)
        {
            Node toAppend = new Node(pObject);

            if(isEmpty())
            {
                first = toAppend;
                last = toAppend;
            }
            else
            {
                toAppend.setNext(last);
                last = toAppend;
            }

            size++;
        }
    }

    public void insert(Object pObject)
    {
        if(pObject != null)
        {
            if(!isEmpty() && hasAccess())
            {
                Node inserted = new Node(pObject);

                inserted.setNext(current.getNext());
                current.setNext(inserted);

                size++;
            }
            else
            {
                append(pObject);
            }
        }
    }

    public void remove()
    {
        if(!isEmpty())
        {
            last = last.getNext();
        }
        else
        {
            last = null;
        }

        if(hasAccess())
        {
            current = current.getNext();
        }
        else
        {
            current = null;
        }

        if(size > 0)
        {
            size--;
        }
    }

    // Additional features
    public int size()
    {
        return size;
    }

    public Object get(int index)
    {
        Node match = last;

        for(int i = size-1; i > index; i--)
        {
            match = match.getNext();
        }

        return match.getContent();
    }
}
package dsa;

/**
 * Created by Ignacio on 22/02/2017.
 */
public class StackImpl<E>  implements  Stack<E> {

    int size=0;
    E[] elements;

    public StackImpl(int longitud) {
        this.elements= (E[])new Object[longitud];
    }
    public int size() {
        return this.size;
    }

    public void push (E e) throws FullStack  {
        if (this.size==elements.length)
        {
            throw new FullStack();
        }

        elements[this.size++]=e;


    }

    public E pop()  throws EmptyStack {

        if (this.size==0)
        {
            throw new EmptyStack();
        }
        this.size--;
        return elements[this.size];


    }


}

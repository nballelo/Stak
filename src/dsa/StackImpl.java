package dsa;

/**
 * Created by Ignacio on 22/02/2017.
 */
public class StackImpl<E> implements Stack<E>
{
    int size=0;
    E[] data;
    public int size(){
        return size;
    }

    public E pop() {

        return data[size--];
    }

    public void push (E e){
            data[size++]=e;
    }
}

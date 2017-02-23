package dsa;

import java.util.EmptyStackException;

/**
 * Created by Ignacio on 22/02/2017.
 */
public interface Stack<E> {
   public int size();
   public E pop()throws EmptyStack;
   public void push(E e) throws FullStack;
}

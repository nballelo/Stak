package dsa;

public class Main {

    public static void main(String[] args){
	Stack<Integer> a =new StackImpl<>(7);
	int z;
    try{
        a.push(5);
        a.push(5);
        a.push(5);
        a.push(5);
        a.push(5);
        a.push(5);
        a.push(5);
        a.push(5);
        System.out.println(a.pop());
        System.out.println(a.pop());
        System.out.println(a.pop());
        System.out.println(a.pop());
        System.out.println(a.pop());
        System.out.println(a.pop());
        System.out.println(a.pop());
        System.out.println(a.pop());
    }
    catch (FullStack e)
    {
        System.out.println(e.getMessage());
    }
    catch (EmptyStack e){
        System.out.println(e.getMessage());
    }
    }

}

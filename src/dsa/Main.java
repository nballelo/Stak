package dsa;

public class Main {

    public static void main(String[] args) throws FullStack,EmptyStack{
	Stack<Integer> a =new StackImpl<>(10);
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
        z=a.pop();
        System.out.println(z);
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

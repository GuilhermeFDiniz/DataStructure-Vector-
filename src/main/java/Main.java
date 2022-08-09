public class Main {

    public static void main(String[] args) {
        ImplementingVector test = new ImplementingVector();
        test.addObject(new GenericObjects("Test6"));
        test.addObject(new GenericObjects("Test2"));
        test.addObject(new GenericObjects("Test1"));
        test.addObject(new GenericObjects("Test5"));
        test.addObject(new GenericObjects("Test3"));
        test.addObject(new GenericObjects("Test3"));
        test.removeObject(2);
        test.addObject(2,new GenericObjects("TestNovo"));
        System.out.println(test.objectLength());
        System.out.println(test.toString());
    }

}

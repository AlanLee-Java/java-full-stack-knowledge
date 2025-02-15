package alanlee.lambda;

public class TestIMyInterface {

    public static void main(String[] args) {
        IMyInterface iMyInterface = () -> System.out.println("I like study");
        iMyInterface.study();
    }

}
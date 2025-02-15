package alanlee.defaultmethod;

public interface A {

    default void foo() {
        System.out.println("Calling A.foo()");
    }

}
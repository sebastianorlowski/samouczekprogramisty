package pl.orlowski.sebastian.samouczekjava.a18trywithresources;

public class MyOwnContextManager implements AutoCloseable {

    public MyOwnContextManager() {
        System.out.println("Something");
    }

    public void doSomething() {
        System.out.println("Working...");
    }

    public void close() {
        System.out.println("Closing...");
    }

}

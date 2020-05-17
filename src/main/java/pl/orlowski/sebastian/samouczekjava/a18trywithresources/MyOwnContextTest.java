package pl.orlowski.sebastian.samouczekjava.a18trywithresources;

import java.io.IOException;

public class MyOwnContextTest {
    public static void main(String[] args) {
        try (MyOwnContextManager myOwnContextManager = new MyOwnContextManager()) {
            myOwnContextManager.doSomething();
        }
    }
}

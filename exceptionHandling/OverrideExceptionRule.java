package exceptionHandling;

import java.io.IOException;

public class OverrideExceptionRule {

}

class Parent {
    void method() throws Exception {}
}
class Child extends Parent {
    @Override
    void method() throws IOException {} // Valid or not?
}
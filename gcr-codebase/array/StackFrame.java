// package gcr-codebase.java;

public class StackFrame {
    void m1() {
        int x=20;
        System.err.println("m1");
        m2();
    }
    void m2() {
        int x=10;
        
        
    }
    static void m4() {
        System.out.println("m4");
    }
    static void m3() {
        System.out.println("m3");
        m4();
    }
    
    public static void main(String[] args) {
        int x=40;
        System.err.println("X");    3
        StackFrame obj = new StackFrame();
        // .methodA();
        obj.m1();
        m3();
    }
}

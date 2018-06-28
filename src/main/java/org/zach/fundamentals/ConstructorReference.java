package org.zach.fundamentals;

public class ConstructorReference {
    public static void main(String[] args) {
        MyClassArrayCreator mcArray = MyClass[]::new;

        // length of a is 4
        MyClass[] a = mcArray.func(4);

        for (int i = 0; i < 4; i++)
            a[i] = new MyClass(i);

        for (int i = 0; i < 4; i++)
            System.out.println(a[i]);




        MyClassArrayFactory<Thread> factory = Thread[]::new;
        Thread[] thrds = factory.func(5); // contains 5 threads
    }
}

interface MyClassArrayCreator {
    MyClass[] func(int n);
}

class MyClass {
    private int size;

    MyClass(int n) {
        size = n;
    }
}



interface MyClassArrayFactory<T> {
    T[] func(int n);
}
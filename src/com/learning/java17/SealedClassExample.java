package com.learning.java17;

public sealed abstract class SealedClassExample permits SubFinalClass, SubNonSealedClass {
    public abstract void sayHello();
}

//Must be final, sealed or non-sealed
//if sealed then must define permit
final class SubFinalClass extends SealedClassExample {

    @Override
    public void sayHello() {
        System.out.println("Hello Final");
    }
}

non-sealed class SubNonSealedClass extends SealedClassExample {

    @Override
    public void sayHello() {
        System.out.println("Hello Non-Sealed");
    }
}


class Main {
    public static void main(String[] args) {
        SealedClassExample sealedClassExample = getInstance();

        if (sealedClassExample instanceof SubNonSealedClass subNonSealedClass) {
            subNonSealedClass.sayHello();
        } else if (sealedClassExample instanceof SubFinalClass subFinalClass) {
            subFinalClass.sayHello();
        } else {
            System.out.println("Unknown");
        }
    }

    private static SealedClassExample getInstance() {
        return new SubFinalClass();
    }
}

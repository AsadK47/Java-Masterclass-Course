public class Test {
    public static void main(String[] args) {
        // https://www.w3schools.com/java/java_data_types.asp
        // 8 primitive data types

        // Section 1
        char char1 = 'C';
        char char2 = 138;
        char char3 = "C";

        boolean boolean1 = true;
        boolean boolean2 = false;
        boolean boolean3 = 1;

        // **************************************************************************************************************

        // Section 2 - Numeric primitives
        byte byte1 = 127;
        byte byte2 = -128;
        byte byte3 = 200;

        short short1 = 32767;
        short short2 = -32_768;
        short short3 = 50_000;

        int int1 = 5;
        int int2 = 50000000000;

        long long1 = 1233L;

        float float1 = 12.5F;

        double double1 = 12.566637228;

        double i = Math.PI;

        // **************************************************************************************************************

        // Section 3 - Literal value flavours
        /**
         * Integer literal values come in four flavors: binary, decimal, octal, and hexadecimal:
         * ■ Binary number system—A base-2 system, which uses only 2 digits, 0 and 1.
         *
         * ■ Octal number system—A base-8 system, which uses digits 0 through 7 (a total of 8 digits).
         * Here the decimal number 8 is represented as octal 10, decimal 9 as 11, and so on.
         *
         * ■ Decimal number system—The base-10 number system that you use every day. It’s
         * based on 10 digits, from 0 through 9 (a total of 10 digits).
         *
         * ■ Hexadecimal number system—A base-16 system, which uses digits 0 through 9 and
         * the letters A through F (a total of 16 digits and letters). Here the number 10 is represented as A or a,
         * 11 as B or b, 12 as C or c, 13 as D or d, 14 as E or e, and 15 as F or f.
         */

        // **************************************************************************************************************

        // Section 4 - Numbers can be written with an underscore so for example...
        int num = 45000;
        int num2 = 45_000;
        int num3 = 4_5000;
        int num4 = _45000;
        int num5 = 45_000_;
        long num6 = 45_000_L;

        // **************************************************************************************************************

        // Section 5 - Mini test on literal flavour type (Luckily the IDE does the work)
        long var1 = 0_100_267_760;
        long var2 = 0_ x_4_13;
        long var3 = 0bx10_BA_75;
        long var4 = 0b_10000_10_11;
        long var5 = 0xa10_AG_75;
        long var6 = 0x1_0000_10;
        long var7 = 100__12_12;

        // **************************************************************************************************************

        // Section 6 - Scientific Notation
        double inclination1 = 120.1762;
        double inclination2 = 1.201762e2;

        /**
         *  120.1762 is same as 1.201762e2 (the latter is expressed in scientific notation)
         */

        // **************************************************************************************************************

        // Section 7 - Unicode
        // Unicode is a computing industry standard for the consistent encoding, representation, and
        // handling of text expressed in most of the world's writing systems.

        char c1 = 122;
        char c2 = '\u0122';

        // **************************************************************************************************************

        // Section 8 - Mini test on primitive types (Again IDE does the work here
        int myInt = 7;
        bool result = true;
        if (result == true) {
            do
                System.out.println(myInt);
            while (myInt > 10);
        }

        // **************************************************************************************************************

        // Section 9 Object Reference Variables
        class Person{}
        Person person = new Person();

        /**
         * When the statement shown in figure 2.10 executes, three things happen:
         * ■ A new Person object is created.
         * ■ A variable named person is created in the stack with an empty (null) value.
         * ■ The variable person is assigned the memory address value where the object
         * is located.
         */

        Person person2; // A leash not attached to a dog is a reference object variable with a null value.
        new Person(); // A dog without a leash is a Java object that’s not referred to by any object reference variable.
        // Just as an unleashed dog might be picked up by animal control, an object that
        // isn’t referred to by a reference variable is liable to be garbage collected (removed
        // from memory by the JVM).

        Person person3 = new Person();
        Person person4 = new Person();
        Person person5 = new Person();

        // Several leashes may be tethered to a single dog. Similarly, a Java object may be
        // referenced by multiple object reference variables.

        // **************************************************************************************************************

        // Section 10 - Assignment Operators
        /**
         * The assignment operators that you need to know for the exam are =, +=, -=, *=, and /=.
         *
         * a -= b is equal to a = a – b
         * a += b is equal to a = a + b
         * a *= b is equal to a = a * b
         * a /= b is equal to a = a / b
         * a %= b is equal to a = a % b
         */

        Math.ceil(1.6666);

        // **************************************************************************************************************

        // Section 11 - Unary Increment and Decrement Operators
        // ++a and a++
        // --a and a--

        // Increments before the variable will increase or decrease before being used and increments or decrements after
        // will only be used after, but that is to say as soon as the variable is used and not after a statement is completed

        // **************************************************************************************************************

        // Section 12 - Relational Operators
        /**
         * These relational operators can be divided into two categories:
         * ■ Comparing greater (>, >=) and lesser values (<, <=)
         * ■ Comparing values for equality (==) and inequality (!=)
         *
         * Can't compare incomparable values such as integers and booleans
         * Important to learn if you don't already know how they work
         * Look into operator precedence PAGE 124 of the book if unfamiliar but it's the same as Mathematics
         */

        int a = 10;
        int b = 20;
        System.out.println(a > 20 && b > 10); // false && true = false

        System.out.println(a > 20 || b > 10); // false && true = true

        System.out.println(! (b > 10)); // !true = false

        System.out.println(! (a > 20)); // !false = true

        // **************************************************************************************************************

        // Section 13 - Wrapper classes - fairly lengthy (slightly complex) topic

        /**
         * Creating objects of the wrapper classes
         * You can create objects of all the wrapper classes in multiple ways:
         * ■ Assignment—By assigning a primitive to a wrapper class variable (autoboxing)
         * ■ Constructor—By using wrapper class constructors
         * ■ Static methods—By calling static method of wrapper classes, like, valueOf()
         */


        Integer integer = 5;
        int int7 = 5;
        Integer.valueOf(int7);



        Long.parseLong("12.34");
        Byte.parseByte("1234");
        Boolean.parseBoolean("true");
        Boolean.parseBoolean("TrUe");
        Boolean.parseBoolean("fffff");

        Long l = new Long(4);

        /**
         * Autoboxing and unboxing
         * Autoboxing is the automatic conversion of a primitive data type to an object of the corresponding
         * wrapper class (you box the primitive value). Unboxing is the reverse process (you unbox the primitive value),
         * as shown in figure 2.19.
         */

    }

}

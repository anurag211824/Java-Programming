class D_Instance_And_Static_Variables{
    int a = 10; // Instance variable: each object gets its own copy
    static int b = 20; // Static variable: shared among all objects

    public static void main(String args[]) {
        // Creating first object
        D_Instance_And_Static_Variables obj1 = new D_Instance_And_Static_Variables();
        System.out.println(obj1.a); // Output: 10
        System.out.println(obj1.b); // Output: 20

        // Modifying values
        obj1.a = 1000; // Changes only for obj1
        obj1.b = 2000; // Changes for all objects (static variable)

        System.out.println(obj1.a); // Output: 1000
        System.out.println(obj1.b); // Output: 2000

        // Creating second object
        D_Instance_And_Static_Variables obj2 = new D_Instance_And_Static_Variables();
        System.out.println(obj2.a); // Output: 10 (Instance variable remains unchanged)
        System.out.println(obj2.b); // Output: 2000 (Static variable retains modified value)
    }
}

/*
 * Important Takeaways:
 * 1. Instance variables (like a) are unique to each object.
 * 2. Static variables (like b) are shared among all objects.
 * 3. Modifying an instance variable affects only that particular object.
 * 4. Modifying a static variable affects all objects of the class.
 */
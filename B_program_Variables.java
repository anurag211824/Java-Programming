public class B_program_Variables {
  // Instance variable
  int instanceVar = 10;

  // Static variable
  static int staticVar = 20;

  // Method 1: Demonstrates access to variables
  void method1() {
      // Local variable
      int localVar = 30;

      // Accessing variables
      System.out.println("Instance Variable: " + instanceVar); // Valid
      System.out.println("Static Variable: " + staticVar);     // Valid
      System.out.println("Local Variable: " + localVar);       // Valid
  }

  // Method 2: Demonstrates scope of variables
  void method2() {
      // Trying to access local variable 'localVar' from method1()
      // System.out.println(localVar); // ERROR: localVar is out of scope

      // Accessing instance and static variables
      System.out.println("Instance Variable (from method2): " + instanceVar); // Valid
      System.out.println("Static Variable (from method2): " + staticVar);     // Valid
  }

  // Static method: Demonstrates access to static and instance variables
  static void method3() {
      // System.out.println(instanceVar); // ERROR: Cannot access instance variable directly
      B_program_Variables obj = new B_program_Variables(); // Create object to access instance variable
      System.out.println("Instance Variable (via object): " + obj.instanceVar); // Valid
      System.out.println("Static Variable: " + staticVar);                       // Valid
  }

  public static void main(String[] args) {
      B_program_Variables obj = new B_program_Variables(); // Creating object of class Demo

      // Calling methods
      obj.method1(); // Calls method1()
      obj.method2(); // Calls method2()

      // Calling static method directly
      method3();
  }
}

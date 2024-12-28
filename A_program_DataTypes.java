
public class A_program_DataTypes {
    public static void main(String[] args) {

        // In Java, the valueOf method is used to convert a primitive data type to its
        // corresponding wrapper class object.
        // This method is part of the wrapper classes (like Boolean, Character, Byte,
        // Short, Integer, Long, Float, and Double)
        // and provides a way to wrap the primitive value into an object.

        // 1. Boolean Data Type
        boolean boolValue = true; // or false
        Boolean boolWrapper = Boolean.valueOf(boolValue);
        System.out.println("Boolean Value: " + boolValue + " | Wrapper: " + boolWrapper);

        // 2. Character Data Type
        char charValue = 'A';
        Character charWrapper = Character.valueOf(charValue);
        System.out.println("Character Value: " + charValue + " | Wrapper: " + charWrapper);

        // 3. Byte Data Type
        byte byteValue = 127; // Range: -128 to 127
        Byte byteWrapper = Byte.valueOf(byteValue);
        System.out.println("Byte Value: " + byteValue + " | Wrapper: " + byteWrapper);

        // 4. Short Data Type
        short shortValue = 32767; // Range: -32,768 to 32,767
        Short shortWrapper = Short.valueOf(shortValue);
        System.out.println("Short Value: " + shortValue + " | Wrapper: " + shortWrapper);

        // 5. Integer Data Type
        int intValue = 2147483647; // Range: -2,147,483,648 to 2,147,483,647
        Integer intWrapper = Integer.valueOf(intValue);
        System.out.println("Integer Value: " + intValue + " | Wrapper: " + intWrapper);

        // 6. Long Data Type
        long longValue = 9223372036854775807L; // Range: -2^63 to 2^63 - 1
        Long longWrapper = Long.valueOf(longValue);
        System.out.println("Long Value: " + longValue + " | Wrapper: " + longWrapper);

        // 7. Float Data Type
        float floatValue = 3.4028235E38f; // Range: -3.4E38 to 3.4E38
        Float floatWrapper = Float.valueOf(floatValue);
        System.out.println("Float Value: " + floatValue + " | Wrapper: " + floatWrapper);

        // 8. Double Data Type
        double doubleValue = 1.7E308; // Range: -1.7E308 to 1.7E308
        Double doubleWrapper = Double.valueOf(doubleValue);
        System.out.println("Double Value: " + doubleValue + " | Wrapper: " + doubleWrapper);

        // Demonstrating some non-primitive data types as well

        // String (Non-Primitive)
        String stringValue = "Hello, World!";
        System.out.println("String Value: " + stringValue);

        // Array (Non-Primitive)
        int[] intArray = { 1, 2, 3, 4, 5 };
        System.out.print("Array Values: ");
        for (int num : intArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

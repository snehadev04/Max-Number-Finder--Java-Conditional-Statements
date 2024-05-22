// This program demonstrates conditional statements in Java.
class cond {
    public static void main(String[] args) {
        int x = 123;
        int y = 345;
        int z = 678;
        if (x > y && x > z) {  // Check if x is greater than y and z
            System.out.println(x);  // Print the value of x
            System.out.println("hello");  // Print "hello"
        } else if (y > z) {  // If x is not the greatest, check if y is greater than z
            System.out.println(y);  // Print the value of y
            System.out.println("Thank You");  // Print "Thank You"
        } else {
            System.out.println("Bye");  // If neither x nor y is the greatest, print "Bye"
        }
    }
}



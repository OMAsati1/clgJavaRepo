public class asg3 {
    
        // Global variable
        static int globalCount = 0;
    
        public static void main(String[] args) {
            globalCount++; // Modify the global variable
            System.out.println("Global count: " + globalCount);
            anotherFunction();
        }
    
        static void anotherFunction() {
            globalCount += 10; // Access the global variable
            System.out.println("Updated global count: " + globalCount);
        }
    
    // Output:
    // Global count: 1
    // Updated global count: 11
      
}

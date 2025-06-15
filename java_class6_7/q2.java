package JAVA.java_class6_7;
    
     class q2 {
        public static void main(String[] args) {
            int a = 10; 
            int b = 0; 
    
            try {
                int result = a / b;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException caught: Division by zero is not allowed.");
            } finally {
                System.out.println("This is the finally block, and it always executes.");
            }
        }
    }
    

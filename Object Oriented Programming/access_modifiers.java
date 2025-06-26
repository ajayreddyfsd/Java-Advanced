public class AccessExample {
    // Instance variables with different access modifiers
    public String publicVar = "Public Variable";
    private String privateVar = "Private Variable";
    protected String protectedVar = "Protected Variable";
    String defaultVar = "Default (Package-Private) Variable";  // no modifier
    
    // Public method (accessible everywhere)
    public void publicMethod() {
        System.out.println("Public method");
    }
    
    // Private method (accessible only inside this class)
    private void privateMethod() {
        System.out.println("Private method");
    }
    
    // Protected method (accessible in same package & subclasses)
    protected void protectedMethod() {
        System.out.println("Protected method");
    }
    
    // Default method (package-private) accessible within package only
    void defaultMethod() {
        System.out.println("Default (package-private) method");
    }
    
    // Method to test private access inside the class
    public void testPrivate() {
        System.out.println(privateVar);
        privateMethod();
    }
}

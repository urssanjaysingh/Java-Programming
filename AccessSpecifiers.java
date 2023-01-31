/* Package means folder in Java. */

/* Access Specifier helps a developer to restricts the flow of data. 
 * 1. public - Only one class in a file can be public. That filename and class name should be same.
 *           - No restriction at all.
 * 2. default - A top level class can be either public or default. It can't be private or protected.
 *            - Not accessible outside the package. No restriction within the package.
 * 3. private - Any class or data members can be declared private. 
 *            - Private members are accessed only be the members of the same class.
 * 4. protected - Accessible only through inheritance.
 *              - The members which are marked as protected will be accessible only inside the child class.           
*/

class Father { // default specifier
    String home = "Mannat";
}

public class AccessSpecifiers { // public specifier
    public static void main(String[] args) {
        
        Father f = new Father();
        System.out.println(f.home);
    }
}

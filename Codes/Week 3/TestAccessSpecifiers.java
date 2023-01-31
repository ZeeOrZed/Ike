
// Zuhair Farhan, 27100
// Week 3 (31-01-23), TestAccessSpecifiers Class

public class TestAccessSpecifiers
{
    public static void main(String[] args)
    {
        AccessSpecifiers test_object = new AccessSpecifiers();

        // test_object.privateVar : Can not access privateVar
        // test_object.privateMethod() : Can not access privateMethod()

        int test_protected = test_object.protectedVar; // Can access protectedVar
        test_object.protectedMethod(); // Can access protectMethod

        int test_default = test_object.defaultVar; // Can access defaultVar
        test_object.defaultMethod(); // Cann access defaultMethod

        int test_public = test_object.publicVar; // Can access publicVar
        test_object.publicMethod(); // Cann access publicMethod
    }
}

package Day2.AccessModifier;

public class ParentClass {
    protected int protectedVariable=10;
    protected void protectedMethod(){
        System.out.println("This is a protected method");
    }
    final void printMessage(){
        System.out.println("This is a final method");
    }
}

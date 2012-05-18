public class JavaObject {
    public void sayHello() {
        System.out.println("Hi from Java!");
    }

    public static void main(String [] args) {
        JavaObject javaObject = new JavaObject();
        ScalaObject scalaObject = new ScalaObject();
        javaObject.sayHello();
        scalaObject.sayHello();
    }
}

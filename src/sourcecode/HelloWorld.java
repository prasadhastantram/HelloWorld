

public class HelloWorld {
    public String sayHello() {
        return "Hello world!";
    }
    public static void main(String[] args) {
        HelloWorld helloWorldObject = new HelloWorld();
        System.out.println(helloWorldObject.sayHello());
    }
}


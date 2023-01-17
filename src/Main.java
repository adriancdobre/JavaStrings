public class Main {
    public static void main(String[] args) {
        printInformation("");
        printInformation("Ionut");
        printInformation("\t   \n");

        String helloWorld = "Hello World";
        System.out.printf("index of r = %d %n", helloWorld.indexOf('r'));
        System.out.printf("index of World = %d %n", helloWorld.indexOf("World"));

        System.out.printf("index of l = %d %n", helloWorld.indexOf('l'));
        System.out.printf("index of r = %d %n", helloWorld.lastIndexOf('l'));

        System.out.printf("index of r = %d %n", helloWorld.lastIndexOf('l', 3));
        System.out.printf("index of r = %d %n", helloWorld.lastIndexOf('l',8));

        String helloWorldLower = helloWorld.toLowerCase();
        if(helloWorld.equals(helloWorldLower)){
            System.out.println("Values match exactly");
        }
        if(helloWorld.equalsIgnoreCase(helloWorldLower)){
            System.out.println("Values match ignoring case");
        }
        if(helloWorld.startsWith("Hello")){
            System.out.println("Strings Starts with Hello");
        }
        if(helloWorld.endsWith("World")){
            System.out.println("Strings ends with Hello");
        }
        if(helloWorld.contains("Hello")){
            System.out.println("Strings contains Hello");
        }
        if (helloWorld.contentEquals("Hello World"))
            System.out.println("Values match exactly");



    }

    public static void printInformation(String string){
        int length = string.length();

        if(string.isEmpty()){
            System.out.println("String is empty");
            return;
        }
        if(string.isBlank()){
            System.out.println("String is blank");

        }
        System.out.printf("Length = %d %n", length);
        System.out.printf("First char = %c %n", string.charAt(4));
    }
}

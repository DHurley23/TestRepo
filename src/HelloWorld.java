public class HelloWorld {

    public static void main(String[] args){
        System.out.println("Hello World");
        boolean result = divisibleByNine(100);
        System.out.println(result);
    }

    public static Boolean divisibleByNine(int numToBeChecked){
        int result = numToBeChecked - 9;
        boolean output = false;
        System.out.println(result);
        if (result > 0){
            output = divisibleByNine(result);
        }
        return result == 0 || output;

    }
}

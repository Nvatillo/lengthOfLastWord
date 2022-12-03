public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(lengthOfLastWord("Hello World"));
    }

    public static int lengthOfLastWord(String s) {

        if(s.isEmpty()){
            return 0;
        }

        String[] array = s.split(" ");
        String response = array[array.length-1];
        return response.length();
    }
}
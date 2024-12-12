//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String greeting = "Hello Waldo!";

        int greetLength = greeting.length();
//        int likes = 4024;
//        int dislikes = 4024;

//        double total = MathUtils.ratio(likes, dislikes);
//        System.out.println(total);
        for (int i=0; i<greetLength; i++) {
            System.out.print(greeting.charAt(i));
        }
    }
}
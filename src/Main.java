//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int amount = 300;
        int plus = 1_100;
        int bonus;
        if (plus > 1000) {
            bonus = plus / 100;
        } else {
            bonus = 0;
        }

        System.out.println(bonus);
        System.out.println(amount + plus + bonus);
    }
}
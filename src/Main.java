import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> cars = new Stack<>();
        cars.push("Audi");
        cars.push("Toyota");
        cars.push("Mers");
        cars.push("Hunday");
        cars.push("Honda");
        String a = cars.pop();
        System.out.println(a);
        System.out.println("-------------------------");
        int i = cars.search("Honda");
        System.out.println(i);

    }
}

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CustomArrayList<String> strings = new CustomArrayList<>();

        strings.add("hi");
        strings.add("hello");
        strings.add("dude");

        for (Object obj : strings.getAll()) {
            System.out.println(obj);
        }

        strings.remove(1);

        System.out.println("after remove");
        for (Object obj : strings.getAll()) {
            System.out.println(obj);
        }
    }
}
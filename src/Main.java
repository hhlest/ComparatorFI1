import java.util.*;

public class Main {
    public static void main(String[] args) {
        Cat c1 = new Cat("b", 5);
        Cat c2 = new Cat("kant", 2);
        Cat c3 = new Cat("marvel", 4);
        Cat c4 = new Cat("do", 1);
        List<Cat> cats = new ArrayList<>(List.of(c1, c2, c3, c4));
        System.out.println(cats);

        Comparator<Cat> c = new CatNameLengthComparator();
        cats.sort(c);
        System.out.println(cats);
    }

    public static class CatNameLengthComparator implements Comparator<Cat> {
        @Override
        public int compare(Cat o1, Cat o2) {
            return Integer.compare(o1.getName().length(), o2.getName().length());
        }
    }
}

import halmaz.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> intSet = new Set<>();
        intSet.add(3);
        intSet.add(2);
        intSet.add(0);
        intSet.add(7);
        intSet.add(4);

        Set<Integer> intSet2 = new Set<>();
        intSet2.add(0);
        intSet2.add(2);
        intSet2.add(4);
        intSet2.add(7);
        intSet2.add(4);
        intSet2.add(2);

        System.out.println("Méret: " + intSet.getSize());
        System.out.println(intSet);

        System.out.println(intSet.intersect(intSet2));
    }
}
public class run {
    public static void main(String[] args) {
        Container c1 = new Container();
        c1.addBox(new Box(10.0));
        c1.addBox(new Box(5.0));
        c1.addBox(new Box(3.0));

        Container c2 = new Container();
        c2.addBox(new Box(8.0));
        c2.addBox(new Box(4.0));

        System.out.println("Total weight of c1: " + c1.getTotalWeight());
        System.out.println("Total weight of c2: " + c2.getTotalWeight());

        System.out.println("Comparing containers by weight:");
        System.out.println("c1 compareTo c2: " + c1.compareTo(c2));

        System.out.println("Comparing containers by box count:");
        ContainerCountComparator comparator = new ContainerCountComparator();
        System.out.println("c1 compare c2: " + comparator.compare(c1, c2));

        System.out.println("Iterating over boxes in c1:");
        for (Box box : c1) {
            System.out.println("Box weight: " + box.getWeight());
        }
    }
}

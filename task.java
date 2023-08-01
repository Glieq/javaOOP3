import java.util.*;

class Box {
    private double weight;

    public Box(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
}

class Container implements Comparable<Container>, Iterable<Box> {
    private List<Box> boxes;

    public Container() {
        boxes = new ArrayList<>();
    }

    public void addBox(Box box) {
        boxes.add(box);
    }

    public double getTotalWeight() {
        double totalWeight = 0.0;
        for (Box box : boxes) {
            totalWeight += box.getWeight();
        }
        return totalWeight;
    }

    @Override
    public int compareTo(Container otherContainer) {
        return Double.compare(this.getTotalWeight(), otherContainer.getTotalWeight());
    }

    @Override
    public Iterator<Box> iterator() {
        return boxes.iterator();
    }
}

class ContainerCountComparator implements Comparator<Container> {
    @Override
    public int compare(Container container1, Container container2) {
        return Integer.compare(container1.boxes.size(), container2.boxes.size());
    }
}
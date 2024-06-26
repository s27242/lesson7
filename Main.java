import java.util.*;

public class Main {
    public static int readNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter positive integer: ");
        int num = scanner.nextInt();
        try {
            if (num < 0) {
                System.out.println("Number can't be negative");
                throw new NegativeNumberException();
            }
        }
        catch (NegativeNumberException e) {
            return 0;
        }
        return num;
    }

    public static void fillArray(int[] array, int value, int i) {
        array[i] = value;
    }

    public static void main(String[] args) {
//        1
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", 2010));
        cars.add(new Car("Audi", 2001));
        cars.add(new Car("Mercedes", 2020));
        cars.add(new Car("Ford", 2002));
        cars.add(new Car("Honda", 2003));
        cars.add(new Car("Audi", 2004));
        cars.add(new Car("Mercedes", 2005));
        cars.add(new Car("Ford", 2006));
        cars.add(new Car("Honda", 2007));
        cars.add(new Car("Audi", 2008));
        Collections.sort(cars);
        for (Car car : cars) {
            System.out.println("Model: " + car.getModel() + " Year: " + car.getYear());
        }

//        2
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(UUID.randomUUID(), "apple"));
        items.add(new Item(UUID.randomUUID(), "orange"));
        items.add(new Item(UUID.randomUUID(), "pear"));
        items.add(new Item(UUID.randomUUID(), "grape"));
        items.add(new Item(UUID.randomUUID(), "pineapple"));
        items.add(new Item(UUID.randomUUID(), "cherry"));
        items.add(new Item(UUID.randomUUID(), "watermelon"));
        items.add(new Item(UUID.randomUUID(), "lemon"));
        items.add(new Item(UUID.randomUUID(), "lemon"));
        items.add(new Item(UUID.randomUUID(), "lemon"));
        items.get(0).show();
        items.get(1).show();
        items.get(2).show();
        items.get(3).show();
        items.get(4).show();
        HashMap<UUID, String> itemsMap = new HashMap<>();
        for (Item item : items) {
            itemsMap.put(item.getId(), item.getName());
        }
        for (Map.Entry<UUID, String> entry : itemsMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " Name: " + entry.getValue());
        }

//        3
        List<Item> subItems = items.subList(0, 5);
        HashSet<Item> setItems = new HashSet<>(subItems);

//        4
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            int number = readNumber();
            fillArray(arr, number, i);
        }
    }
}

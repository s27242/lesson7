public class Car implements Comparable<Car> {
    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public int compareTo(Car car) {
        return this.year - car.year;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
    }
}

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(exclude = {"model", "color", "year", "price", "stock"})
@lombok.ToString
class CarWithLombok {
    private String model;
    private String brand;
    private String color;
    private int year;
    private int price;
    private int stock;
}

class Main {
    public static void main(String[] args) {
        CarWithLombok car1 = new CarWithLombok("GLE", "Mercedes", "white", 2020, 350000, 5);
        CarWithLombok car2 = new CarWithLombok("GLC", "Mercedes", "black", 2023, 200000, 3);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car1.getColor());
        System.out.println("Equals: " + car1.equals(car2));
        System.out.println("HashCode car1: " + car1.hashCode());
        System.out.println("HashCode car2: " + car2.hashCode());
    }
}
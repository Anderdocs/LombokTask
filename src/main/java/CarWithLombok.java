import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString(exclude = "quantity")
@EqualsAndHashCode(of = "brand")
public class CarWithLombok {
    private String model;
    private String brand;
    private int year;
    private int price;
    private String color;
    private int quantity;
}
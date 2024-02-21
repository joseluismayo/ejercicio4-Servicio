import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        TrabajoPintura tp1 = new TrabajoPintura("Antonio", LocalDate.of(2022,9,10), "Seguros Martinez", 20, 4);
        System.out.println(tp1.detalleServicio());
    }
}
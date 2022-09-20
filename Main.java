
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(productFormatter("  12  Hola como 12   estas     ", "01/01/2021"));
    }

    private static String productFormatter (String productName, String date){

        productName = productName
                .trim()
                .replaceAll("[^A-Za-z]+", "-")
                .toUpperCase();

        return productName + " -> " + date;
    }
}


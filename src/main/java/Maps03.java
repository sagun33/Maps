import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Maps03 {
    public static void main(String[] args) {
        /*Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map
        bulunmaktadır. Ürün sayılarını artan sırada yazdırınız.*/
                Map<String, Integer> product = new HashMap<>();
        product.put("Laptop", 82);
        product.put("TV", 53);
        product.put("Refrigerator", 12);
        product.put("Music System", 87);
        product.put("Mobile Phone", 53);

        Object[] urunSayisi=product.values().toArray();
        Arrays.sort(urunSayisi);
        System.out.println(Arrays.toString(urunSayisi));

    }
}

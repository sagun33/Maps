import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Maps01 {
    public static void main(String[] args) {
        /*Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map
        bulunmaktadır. Toplam ürün sayısını bulmak için kodu yazınız.*/
        Map<String, Integer> product = new HashMap<>();
        product.put("Laptop", 12);
        product.put("TV", 53);
        product.put("Refrigerator", 12);
        product.put("Music System", 87);

       Collection<Integer> urunSayisi =product.values();
       int sum=0;
        for (Integer w:urunSayisi) {
            sum+=w;

        }
        System.out.println(sum);
    }
}

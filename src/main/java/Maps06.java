import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Maps06 {
    public static void main(String[] args) {
        /*Bir String’ deki kelimelerin kaç defa tekrarlandığını ifade eden kod yazınız.
        (Büyük/küçük harfe duyarlı değil)*/

        String s = "Apex is easy. Type codes to learn apex. To earn money learn apex.";

        String a=s.replaceAll("\\p{Punct}","").toLowerCase();
        String[] words=a.split(" ");
        Map<String,Integer> gorunum=new HashMap<>();

        for (String w:words) {
            Integer gorunumSayisi=gorunum.get(w);
            if (gorunumSayisi==null){
                gorunum.put(w,1);
            }else{
                gorunum.put(w,gorunumSayisi+1);
            }

        } System.out.println(gorunum);

        Collection<Integer>l=gorunum.values();
        int counter=0;
        for (Integer w:l) {

            if (w>1){
                counter++;

            }

        }
        System.out.println(counter);

String v="salih fatma senih selma selma esma salih esma,mahmut arife gunay.,k";
        //Belirli bir listede tekrarlanan öğelerin sayısı nasıl kontrol edilir?

        String g=v.replaceAll("\\p{Punct}","");
        String [] word=g.split(" ");

        Map<String,Integer>kelimeler=new HashMap<>();
        for (String w:word) {

            Integer kelimeSayisi=kelimeler.get(w);
            if (kelimeSayisi==null){
                kelimeler.put(w,1);
            }else {
                kelimeler.put(w,kelimeSayisi+1);
            }


        }
        System.out.println(kelimeler);

Collection<Integer>sayi=kelimeler.values();
int counter1=0;
        for (Integer w:sayi) {
            if (w>1){
                counter1++;
            }

        } System.out.println(counter1);

    }
}

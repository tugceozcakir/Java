import java.util.LinkedHashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {

        int[] dizi = {20, 20, 500, 10, 500, 20, 10, 20, 5};

         // LinkedHashMap preserves elements in the order they were added.
        Map<Integer, Integer> frekanslar = new LinkedHashMap<>();

        // Diziyi dolaşarak frekansları hesaplıyoruz.
        for (int eleman : dizi) {
            if (frekanslar.containsKey(eleman)) {
                // Eğer eleman zaten frekanslar haritasında varsa, frekansı bir artırıyoruz.
                frekanslar.put(eleman, frekanslar.get(eleman) + 1);
            } else {
                // Eğer eleman yoksa, yeni bir frekans başlatıyoruz.
                frekanslar.put(eleman, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : frekanslar.entrySet()) {
            int eleman = entry.getKey();
            int frekans = entry.getValue();
            System.out.println(eleman + " sayısı " + frekans + " kere tekrar edildi.");
        }
    }
}

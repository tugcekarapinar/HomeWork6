import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] kelimeDizisi = {"kalem", "elalem", "kelam", "kelime", "saksı"};

        List<String> arananKelimeler = new ArrayList<>();

        for (String kelime:kelimeDizisi){
            char[] harfDizisi = kelime.toCharArray();
            List<Character> benzersizHarfListesi = new ArrayList<>();

            for (int i=0; i<harfDizisi.length; i++) {
                char harf = harfDizisi [i];
                boolean benzerlik = benzersizHarfListesi.contains(harf);
                
                if (benzerlik){
                    arananKelimeler.add(kelime);
                    break;
                }
                else {
                    benzersizHarfListesi.add(harf);
                }
            }
            if (arananKelimeler.size() == 2) {
                break;
            }
        }
        System.out.println(arananKelimeler);
    }
}
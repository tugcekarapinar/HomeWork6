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
        System.out.print("Aranan Kelimeler = ");
        System.out.println(arananKelimeler);
        System.out.print("Oluşturulan Yeni Kelime = ");
        System.out.println(CreateRandomString(arananKelimeler.get(0), arananKelimeler.get(1)));
    }

    public static String CreateRandomString(String str1, String str2) {
        String newString = "";
        List<Character> benzersizHarfListesi = new ArrayList<>();
        char[] harfDizisi1 = str1.toCharArray();
        char[] harfDizisi2 = str2.toCharArray();
        for (char harf:harfDizisi1){
            boolean benzerlik = benzersizHarfListesi.contains(harf);
            if (!benzerlik){
                benzersizHarfListesi.add(harf);
            }
        }
        for (int i = 0; i < harfDizisi2.length; i++) {
            boolean benzerlik = benzersizHarfListesi.contains(harfDizisi2 [i]);
            if (!benzerlik){
                benzersizHarfListesi.add(harfDizisi2 [i]);
            }
        }
        for (char harf: benzersizHarfListesi){
            newString += harf;
        }
        return newString;
    }
}
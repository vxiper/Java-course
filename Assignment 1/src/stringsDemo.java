package src;

public class stringsDemo {
    public static void main(String[] args) {
        String mesaj = "Bugün Hava Çok Güzel.";
        System.out.println(mesaj);

        /*
        System.out.println("Elaman sayısı = " + mesaj.length());
        System.out.println("5. Eleman : " + mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yaşasın!!!"));
        System.out.println(mesaj.startsWith("G")); // false
        System.out.println(mesaj.endsWith(".")); // true
        char [] karakterler = new char[5] ;
        mesaj.getChars(0, 5, karakterler, 0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("av"));
        System.out.println(mesaj.lastIndexOf("e"));  
        */
        
        // System.out.println(mesaj.replace(' ', '-'));

        String newMessage = mesaj.replace(' ', '-');
        System.out.println(newMessage);
        System.out.println(mesaj.substring(2, 5)); // Gün ü vericek
        for (String word : mesaj.split(" ")) {
        System.out.println(word);
        }

        System.out.println(mesaj.toLowerCase()); // hepsi küçük harfle yazılır
        System.out.println(mesaj.toUpperCase()); // hepsi büyük harfle yazılır
        System.out.println(mesaj.trim()); // her kelimenin ilk harfi büyük yazılır

    }
}

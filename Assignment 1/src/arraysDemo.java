package src;

public class arraysDemo {
    public static void main(String[] args) {
        String[] ogrenciler= new String[4];
		ogrenciler[0] = "Engin";
		ogrenciler[1] = "Salih";
		ogrenciler[2] = "Derin";
		ogrenciler[3] = "Ahmet";
		
		
		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		
        // veya

		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}
    }
}

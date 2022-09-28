package src.Methods2;

public class Main {
    public static void main(String[] args) {
		// String mesaj="bugün hava çok güzel";
		String yeniMesaj=sehirVer();
		System.out.println(yeniMesaj);
		
		int genelToplam = topla2(5,6,9,8,7,5,4,3,2,1);
		System.out.println(genelToplam);
	}
	
	public static void ekle() {
		System.out.println("Eklendi.");
	}
	
	public static void sil() {
		System.out.println("silindi");
	}
	
	public static void guncelle() {
		System.out.println("güncellendi");
	}
	
	public static int getir() {
		return 5;
	}
	
	public static String sehirVer() {
		return "Ankara";
	}
	
	public static int topla(int sayi1, int sayi2) {
		return sayi1+sayi2;
	}
	
	public static int topla2(int... sayilar) {
		int toplam =0;
		for(int sayi : sayilar) {
			toplam+=sayi;
		}
		return toplam;
	}

}

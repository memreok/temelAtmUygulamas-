package deneme;

import java.util.Scanner;

public class deneme {

	public static void main(String[] args) {
		// kullanıcı adı sifre gir
		// kullanıcı adı : memo
		// sifre:123
		// iban:1234567890
		// kullanıcı adı: kadir
		// sifre: 456
		// iban: 0987654321
		// 1 --> bakiye göruntule
		// 2 --> para cek
		// 3 --> para yatır
		// 4 --> para gonder
		// q cıkıs

		Scanner scanner=new Scanner(System.in);
		
		String icerik = "1--> Bakiye görüntüleme \n"
				+ "2--> Para çekme \n"
				+ "3--> Para yatrıma \n"
				+ "4--> Para Gönderme \n"
				+ "q--> Çıkış";
		
		String kullanici_memo_ad = "memo";
		String kullanici_memo_sifre = "123";
		String kullanici_memo_iban = "1234567890";
		int kullanici_memo_bakiye = 1000;

		String kullanici_kadir_ad = "kadir";
		String kullanici_kadir_sifre = "456";
		String kullanici_kadir_iban = "0987654321";
		int kullanici_kadir_bakiye = 2000;

		System.out.println("Barü ATM ye hoşgeldiniz!");
		System.out.print("Kullanıcı adınızı giriniz: ");
		String girilen_kullanici_adi = scanner.nextLine();
		System.out.print("Şifrenizi giriniz: ");
		String girilen_kullanici_sifre=scanner.nextLine();
		
		if (girilen_kullanici_adi.equals(kullanici_memo_ad)&&girilen_kullanici_sifre.equals(kullanici_memo_sifre)) {
			//memo
			System.out.println("Hoşgeldin Mehmet!");
			System.out.println(icerik);
			System.out.print("Seçiminizi giriniz: ");
			String kullanici_secim= scanner.nextLine();
			
			//islem
			
			switch (kullanici_secim) {
			case "1":
				// bakiye görüntüle
				
				System.out.println("Bakiyeniz: "+kullanici_memo_bakiye);
				break;
			case "2":
				// para çek
				
				System.out.print("Çekmek istediğiniz tutarı giriniz: ");
				int cekilecek_tutar= scanner.nextInt();
				if (cekilecek_tutar>kullanici_memo_bakiye) {
					System.out.println("Bakiye yetersiz! Bakiyeniz: "+kullanici_memo_bakiye);
				}else {
					kullanici_memo_bakiye-=cekilecek_tutar;
					System.out.println("İşlem Başarılı! Bakiyeniz: "+kullanici_memo_bakiye);
				}
					
				break;
			case "3":
				// para yatır
				
				System.out.print("Yatırmak istediğiniz tutarı giriniz: ");
				int yatirilacak_tutar= scanner.nextInt();
				kullanici_memo_bakiye+=yatirilacak_tutar;
				System.out.println("İşlem başarılı! Bakiyeniz: "+kullanici_memo_bakiye);
				
				break;
			case "4":
				// para gönder
				
				System.out.print("Yatırılacak kişinin ibanını giriniz: ");
				String girilen_iban = scanner.nextLine();
				if (girilen_iban.equals(kullanici_kadir_iban)) {
					System.out.print("Göndermek istediğiniz tutarı giriniz: ");
					int gonderilecek_tutar=scanner.nextInt();
					if (gonderilecek_tutar>kullanici_memo_bakiye) {
						System.out.println("Bakiye yetersiz!");
						
					}else {
						kullanici_kadir_bakiye+=gonderilecek_tutar;
						kullanici_memo_bakiye-=gonderilecek_tutar;
						System.out.println("İşlem başarılı!");
						System.out.println("Kalan Bakiyeniz: "+kullanici_memo_bakiye);
//						System.out.println("Kadir'in bakiyesi: "+kullanici_kadir_bakiye);
					}
				}else {
					System.out.println("Geçersiz veya yanlış iban!");
				}
				
				break;
			case "q":
				// cıkış
				
				System.out.println("Çıkış yapıldı!");
				
				break;				
			default:
				System.out.println("Geçersiz Giriş!!");
				break;
			}
			
			
			
		}else if(girilen_kullanici_adi.equals(kullanici_kadir_ad)&&girilen_kullanici_sifre.equals(kullanici_kadir_sifre)) {
			//kadir
			System.out.println("Hoşgeldin Kadir!");
			System.out.println(icerik);
			System.out.print("Seçiminizi giriniz: ");
			String kullanici_secim= scanner.nextLine();
			
			// islem
			
			switch (kullanici_secim) {
			case "1":
				// bakiye görüntüle
				
				System.out.println("Bakiyeniz: "+kullanici_kadir_bakiye);
				break;
			case "2":
				// para çek
				
				System.out.print("Çekmek istediğiniz tutarı giriniz: ");
				int cekilecek_tutar= scanner.nextInt();
				if (cekilecek_tutar>kullanici_kadir_bakiye) {
					System.out.println("Bakiye yetersiz! Bakiyeniz: "+kullanici_kadir_bakiye);
				}else {
					kullanici_kadir_bakiye-=cekilecek_tutar;
					System.out.println("İşlem Başarılı! Bakiyeniz: "+kullanici_kadir_bakiye);
				}
				
				
				break;
			case "3":
				// para yatır
				
				System.out.print("Yatırmak istediğiniz tutarı giriniz: ");
				int yatirilacak_tutar= scanner.nextInt();
				kullanici_kadir_bakiye+=yatirilacak_tutar;
				System.out.println("İşlem başarılı! Bakiyeniz: "+kullanici_kadir_bakiye);
				
				
				break;
			case "4":
				// para gönder
				
				System.out.print("Yatırılacak kişinin ibanını giriniz: ");
				String girilen_iban = scanner.nextLine();
				if (girilen_iban.equals(kullanici_memo_iban)) {
					System.out.print("Göndermek istediğiniz tutarı giriniz: ");
					int gonderilecek_tutar=scanner.nextInt();
					if (gonderilecek_tutar>kullanici_kadir_bakiye) {
						System.out.println("Bakiye yetersiz!");
						
					}else {
						kullanici_memo_bakiye+=gonderilecek_tutar;
						kullanici_kadir_bakiye-=gonderilecek_tutar;
						System.out.println("İşlem başarılı!");
						System.out.println("Kalanbakiyeniz: "+kullanici_kadir_bakiye);
						System.out.println("Mehmet' in bakiyesi: "+kullanici_memo_bakiye);
						
					}
				}else {
					System.out.println("Geçersiz veya yanlış iban!");
				}
				
				break;
				
			case "q":
				// cıkış
				System.out.println("Çıkış yapıldı!");

				break;				
			default:
				System.out.println("Geçersiz Giriş!!");
				break;
			}
			
		}else {
			System.out.println("Kullanıcı adı veya şifre hatalı!");
		}
		
	}

}

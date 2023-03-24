package day02_MyfirstProgram.src.day12_SwitchCase;

import java.util.Scanner;

public class Homework_4_Otel {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen motelimizi tanımak için 1, 2 ve 3 şeklinde bir kat numarası girin ve oda adı seçin.");
        System.out.println("1. kat : Resepsion, Güvenlik ve Oda hizmetleri için 1'i\n" +
                "2. kat : Yemekhane, Dinlenme Salonu, Room 1 ve Room 2 için 2'yi\n" +
                "3. kat : Room 3, Room 4, Room 5 ve Room 6 için 3'ü tuşlayınız:");
        int kat = scan.nextInt();

        switch (kat) {
            case 1:
                System.out.println("Resepsion için 1'i\n" +
                        "Güvenlik için 2'yi\n" +
                        "Oda hizmetleri için 3'ü tuşlayınız:");
                int kat1 = scan.nextInt();
                switch (kat1) {
                    case 1:
                        System.out.println("Resepsion: Tüm işlemleriniz için bekleriz.");
                        break;
                    case 2:
                        System.out.println("Güvenlik: Profesyonel bir hizmettir.");
                        break;
                    case 3:
                        System.out.println("Oda hizmetleri: Temizlik ve taşıma hizmetleri için 101 dahili hattan ulaşabilirsiniz.");
                        break;
                    default:
                        System.out.println("Hatalı giriş.");


                }break;
            case 2:
                System.out.println("Yemekhane için 1'i\n" +
                        "Dinlenme Salonu için 2'yi\n" +
                        "Room 1 ve Room 2 için 3'ü tuşlayınız:");
                int kat2 = scan.nextInt();
                switch (kat2) {
                    case 1:
                        System.out.println("Yemekhane:\n" +"Kahvaltı 08-11\n" +"Öğle yemeği 12-15\n" +"Akşam yemeği 18-21");
                        break;
                    case 2:
                        System.out.println("Dinlenme Salonu: 24 saat çay servisi ile hizmetinizdedir.");
                        break;
                    case 3:
                        System.out.println("Room1 ve Room 2: Ekonomik oda");
                        break;
                    default:
                        System.out.println("Hatalı giriş.");

                }break;
            case 3:
                System.out.println("Room 3 ve Room 4 için 1'i\n"+ "Room 5 ve Room 6 için 2'yi tuşlayınız:");
                int kat3 = scan.nextInt();
                switch (kat3) {
                    case 1:
                        System.out.println("Room3 ve Room 4: Standart oda");
                        break;
                    case 2:
                        System.out.println("Room 5 veRoom 6: Özel oda");
                        break;
                    default:
                        System.out.println("Hatalı giriş.");

                }
        }


    }
}

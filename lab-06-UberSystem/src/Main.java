import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        // ArrayList oluşturma
        ArrayList<Ride> rides = new ArrayList<>();

        // Her türden en az bir nesne oluşturma ve listeye ekleme
        EconomyRide ecoRide = new EconomyRide("Ahmet Yılmaz", "Kadıköy", "Beşiktaş", 10.5, 25, 5.0, 2.0);
        PremiumRide premRide = new PremiumRide("Ayşe Demir", "Bostancı", "Maslak", 20.0, 40, 8.0, 15.0, 1.5);
        SharedRide sharedRide = new SharedRide("Mehmet Kaya", "Taksim", "Levent", 12.0, 30, 4.0, 1.5, 3);

        // Hatalı değerler girerek uyarıları test etmek isterseniz aşağıdaki satırların yorumunu kaldırabilirsiniz:
        // SharedRide errorTest = new SharedRide("Test", "A", "B", 5.0, 10, 3.0, 1.0, 5);
        // PremiumRide errorTest2 = new PremiumRide("Test2", "A", "B", -5.0, 10, 3.0, 5.0, 4.0);

        rides.add(ecoRide);
        rides.add(premRide);
        rides.add(sharedRide);

        // 9) Döngü ile detayları ve ücretleri yazdırma
        System.out.println("----- SÜRÜŞ DETAYLARI VE ÜCRETLER -----");
        for (Ride ride : rides) {
            System.out.println(ride.toString());
            // Ücreti virgülden sonra 2 basamak olacak şekilde yazdırıyoruz
            System.out.printf("Toplam Ücret: %.2f TL\n", ride.calculateFare());
            System.out.println("---------------------------------------");
        }
    }
}
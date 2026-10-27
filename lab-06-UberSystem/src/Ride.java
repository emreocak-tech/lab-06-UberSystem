class Ride {
    // 2) Private (özel) nitelikler
    private String passengerName;
    private String pickup;
    private String destination;
    private double distanceKm;
    private int durationMin;
    private double pricePerKm;

    // 3) Constructor (Yapıcı Metot)
    public Ride(String passengerName, String pickup, String destination, double distanceKm, int durationMin, double pricePerKm) {
        this.passengerName = passengerName;
        this.pickup = pickup;
        this.destination = destination;

        // Pozitiflik kontrolleri (Uyarı verip 1'e ayarlama)
        if (distanceKm <= 0) {
            System.out.println("Uyarı: Mesafe pozitif olmalıdır. 1 olarak ayarlandı.");
            this.distanceKm = 1;
        } else {
            this.distanceKm = distanceKm;
        }

        if (durationMin <= 0) {
            System.out.println("Uyarı: Süre pozitif olmalıdır. 1 olarak ayarlandı.");
            this.durationMin = 1;
        } else {
            this.durationMin = durationMin;
        }

        if (pricePerKm <= 0) {
            System.out.println("Uyarı: Km başı fiyat pozitif olmalıdır. 1 olarak ayarlandı.");
            this.pricePerKm = 1;
        } else {
            this.pricePerKm = pricePerKm;
        }
    }

    // 2) Tüm nitelikler için getter metotları
    public String getPassengerName() { return passengerName; }
    public String getPickup() { return pickup; }
    public String getDestination() { return destination; }
    public double getDistanceKm() { return distanceKm; }
    public int getDurationMin() { return durationMin; }
    public double getPricePerKm() { return pricePerKm; }

    // 4) Temel ücret hesaplama
    public double calculateFare() {
        return distanceKm * pricePerKm;
    }

    // 4) toString metodu
    @Override
    public String toString() {
        return "Yolcu: " + passengerName +
                ", Nereden: " + pickup +
                ", Nereye: " + destination +
                ", Mesafe: " + distanceKm + " km, " +
                "Süre: " + durationMin + " dk, " +
                "Km Fiyatı: " + pricePerKm + " TL";
    }
}
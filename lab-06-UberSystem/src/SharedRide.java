class SharedRide extends EconomyRide {
    private int passengerCount;

    public SharedRide(String passengerName, String pickup, String destination, double distanceKm, int durationMin, double pricePerKm, double pricePerMinute, int passengerCount) {
        super(passengerName, pickup, destination, distanceKm, durationMin, pricePerKm, pricePerMinute);

        // 7) Yolcu sayısı kontrolü (1-4 arası)
        if (passengerCount < 1 || passengerCount > 4) {
            System.out.println("Uyarı: Yolcu sayısı 1 ile 4 arasında olmalıdır. 1 olarak ayarlandı.");
            this.passengerCount = 1;
        } else {
            this.passengerCount = passengerCount;
        }
    }

    public int getPassengerCount() { return passengerCount; }

    // 7) Ücret hesaplama ezme (override) işlemi
    @Override
    public double calculateFare() {
        // EconomyRide'ın hesapladığı ücret (minimum 50 TL kuralı dahil)
        double economyFare = super.calculateFare();

        // Yolcu başına düşen ücret + %10 servis bedeli
        double farePerPassenger = economyFare / passengerCount;
        return farePerPassenger * 1.10;
    }

    // 8) toString ezme işlemi
    @Override
    public String toString() {
        return super.toString() + ", Yolcu Sayısı: " + passengerCount;
    }
}

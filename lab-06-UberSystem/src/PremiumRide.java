class PremiumRide extends Ride {
    private double comfortFee;
    private double surgeMultiplier;

    public PremiumRide(String passengerName, String pickup, String destination, double distanceKm, int durationMin, double pricePerKm, double comfortFee, double surgeMultiplier) {
        super(passengerName, pickup, destination, distanceKm, durationMin, pricePerKm);
        this.comfortFee = comfortFee;

        // 6) Çarpan kontrolü (1.0 - 3.0 arası)
        if (surgeMultiplier < 1.0 || surgeMultiplier > 3.0) {
            System.out.println("Uyarı: Talep çarpanı 1.0 ile 3.0 arasında olmalıdır. 1.0 olarak ayarlandı.");
            this.surgeMultiplier = 1.0;
        } else {
            this.surgeMultiplier = surgeMultiplier;
        }
    }

    public double getComfortFee() { return comfortFee; }
    public double getSurgeMultiplier() { return surgeMultiplier; }

    // 6) Ücret hesaplama ezme (override) işlemi
    @Override
    public double calculateFare() {
        double baseFare = super.calculateFare();
        return (baseFare + comfortFee) * surgeMultiplier;
    }

    // 8) toString ezme işlemi
    @Override
    public String toString() {
        return super.toString() + ", Konfor Ücreti: " + comfortFee + " TL, Çarpan: " + surgeMultiplier;
    }
}

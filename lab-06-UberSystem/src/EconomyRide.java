class EconomyRide extends Ride {
    private double pricePerMinute;

    public EconomyRide(String passengerName, String pickup, String destination, double distanceKm, int durationMin, double pricePerKm, double pricePerMinute) {
        super(passengerName, pickup, destination, distanceKm, durationMin, pricePerKm);
        this.pricePerMinute = pricePerMinute;
    }

    public double getPricePerMinute() { return pricePerMinute; }

    // 5) Ücret hesaplama ezme (override) işlemi
    @Override
    public double calculateFare() {
        double baseFare = super.calculateFare();
        double timeCharge = getDurationMin() * pricePerMinute;
        double totalFare = baseFare + timeCharge;

        // Minimum 50 TL kuralı
        if (totalFare < 50.0) {
            return 50.0;
        }
        return totalFare;
    }

    // 8) toString ezme işlemi
    @Override
    public String toString() {
        return super.toString() + ", Dakika Fiyatı: " + pricePerMinute + " TL";
    }
}

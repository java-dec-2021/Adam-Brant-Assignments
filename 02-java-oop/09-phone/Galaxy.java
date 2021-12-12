public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        // your code here
        return "Galaxy "+ this.getVersion() + "says " + this.getRingtone();
    }
    @Override
    public String unlock() {
        // your code here
        return "Unlocking via fingerprint";
    }
    @Override
    public void displayInfo() {
        // your code here
        System.out.print("Galaxy" + this.getVersion() + "from" + this.getCarrier());
    }
}
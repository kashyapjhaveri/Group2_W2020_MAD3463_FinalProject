package Group2_W2020_MAD3463_FinalProject;

public class Bus extends Vehicle
{
    private String typeOfBus;
    private boolean isAccessibilityAvailable;
    private boolean isWifiAvailable;

    public String getTypeOfBus() {
        return typeOfBus;
    }

    public void setTypeOfBus(String typeOfBus) {
        this.typeOfBus = typeOfBus;
    }

    public boolean isAccessibilityAvailable() {
        return isAccessibilityAvailable;
    }

    public void setAccessibilityAvailable(boolean accessibilityAvailable) {
        isAccessibilityAvailable = accessibilityAvailable;
    }

    public boolean isWifiAvailable() {
        return isWifiAvailable;
    }

    public void setWifiAvailable(boolean wifiAvailable) {
        isWifiAvailable = wifiAvailable;
    }

    @Override
    public void print() {

    }
}

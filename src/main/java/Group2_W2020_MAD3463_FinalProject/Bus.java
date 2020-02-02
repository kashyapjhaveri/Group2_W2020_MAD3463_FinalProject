package Group2_W2020_MAD3463_FinalProject;

public class Bus extends  Vehical{
    private String typeOfBus;
    private Boolean isAccessibilityAvailable;
    private Boolean isWifiAvailable;

    public String getTypeOfBus() {
        return typeOfBus;
    }

    public void setTypeOfBus(String typeOfBus) {
        this.typeOfBus = typeOfBus;

    }
    public Boolean getAccessibilityAvailable() {
        return isAccessibilityAvailable;
    }

    public void setAccessibilityAvailable(Boolean accessibilityAvailable) {
        isAccessibilityAvailable = accessibilityAvailable;
    }
    public Boolean getWifiAvailable() {
        return isWifiAvailable;
    }

    public void setWifiAvailable(Boolean wifiAvailable) {
        isWifiAvailable = wifiAvailable;
    }

    @Override
    public void print() {

    }
}



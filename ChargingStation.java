import java.util.ArrayList;
import java.util.List;

public class ChargingStation {
    private String stationId;
    private String name;
    private String location;
    private List<Slot> slots;
    private String chargerType;

    public ChargingStation(String stationId, String name, String location, String chargerType, int slotCount) {
        this.stationId = stationId;
        this.name = name;
        this.location = location;
        this.chargerType = chargerType;
        this.slots = new ArrayList<>();
        for (int i = 0; i < slotCount; i++) {
            slots.add(new Slot(i + 1));
        }
    }

    public String getStationId() {
        return stationId;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getChargerType() {
        return chargerType;
    }

    public List<Slot> getSlots() {
        return slots;
    }

    public Slot getAvailableSlot() {
        for (Slot slot : slots) {
            if (!slot.isBooked()) {
                return slot;
            }
        }
        return null; // No available slot
    }

    @Override
    public String toString() {
        return "Station: " + name + " (" + location + ") - " + chargerType;
    }
}

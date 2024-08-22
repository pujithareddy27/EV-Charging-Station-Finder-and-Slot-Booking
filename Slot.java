public class Slot {
    private int slotId;
    private boolean booked;

    public Slot(int slotId) {
        this.slotId = slotId;
        this.booked = false;
    }

    public int getSlotId() {
        return slotId;
    }

    public boolean isBooked() {
        return booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }

    @Override
    public String toString() {
        return "Slot " + slotId + " (Booked: " + booked + ")";
    }
}

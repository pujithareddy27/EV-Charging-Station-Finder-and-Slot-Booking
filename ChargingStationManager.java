import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ChargingStationManager {
    private List<ChargingStation> stations;

    public ChargingStationManager() {
        this.stations = new ArrayList<>();
    }

    public void addStation(ChargingStation station) {
        stations.add(station);
    }

    public List<ChargingStation> filterByLocation(String location) {
        return stations.stream()
                       .filter(station -> station.getLocation().equalsIgnoreCase(location))
                       .collect(Collectors.toList());
    }

    public List<ChargingStation> filterByChargerType(String chargerType) {
        return stations.stream()
                       .filter(station -> station.getChargerType().equalsIgnoreCase(chargerType))
                       .collect(Collectors.toList());
    }

    public List<ChargingStation> getAllStations() {
        return stations;
    }
}

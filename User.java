public class User {
    private String userId;
    private String name;
    private String vehicleInfo;

    public User(String userId, String name, String vehicleInfo) {
        this.userId = userId;
        this.name = name;
        this.vehicleInfo = vehicleInfo;
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getVehicleInfo() {
        return vehicleInfo;
    }

    @Override
    public String toString() {
        return "User: " + name + " (" + vehicleInfo + ")";
    }
}

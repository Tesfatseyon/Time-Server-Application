package server;

public class ClientInfo {
    private final String name;
    private final String ip;
    private final String zone;

    public ClientInfo(String name, String ip, String zone) {
        this.name = name;
        this.ip = ip;
        this.zone = zone;
    }

    public String getName() { return name; }
    public String getIp() { return ip; }
    public String getZone() { return zone; }
}
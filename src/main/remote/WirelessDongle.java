package remote;

/**
 * A wireless dongle for a remote, allowing it to connect wirelessly to devices.
 * It can be used as an action in the remote.
 */
public class WirelessDongle extends Action {
    /**
     * The device to connect to.
     */
    private String deviceName;

    /**
     * Creates a wireless dongle object with the specified device name.
     *
     * @param deviceName the name of the device to connect to
     */
    public WirelessDongle(String deviceName) {
        super("Connect to " + deviceName);
        this.deviceName = deviceName;
    }

    /**
     * Performs the action of connecting to the device.
     *
     * @return true if the connection is successful, false otherwise
     */
    @Override
    public boolean performAction() {
        // Perform the wireless connection logic here
        System.out.println("Connecting to " + deviceName + " wirelessly...");
        // Return true if the connection is successful, false otherwise
        return true;
    }
}

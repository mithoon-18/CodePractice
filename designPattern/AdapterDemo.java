package designPattern;

interface Socket230V {
    void plugIn();
}

// Adaptee (existing device with different interface)
class Socket110VDevice {
    void plugIn110V() {
        System.out.println("Device plugged into 110V socket.");
    }
}

// Adapter (makes 110V device work in 230V socket)
class SocketAdapter implements Socket230V {
    private Socket110VDevice device;

    public SocketAdapter(Socket110VDevice device) {
        this.device = device;
    }

    @Override
    public void plugIn() {
        System.out.println("Using adapter to convert 230V to 110V...");
        device.plugIn110V();
    }
}

// Client
public class AdapterDemo {
    public static void main(String[] args) {
        // You have a 110V device
        Socket110VDevice usDevice = new Socket110VDevice();

        // You use an adapter to plug it into a 230V socket
        Socket230V adapter = new SocketAdapter(usDevice);
        adapter.plugIn();
    }
}
import java.net.DatagramPacket;
import java.net.InetAddress;


public class DataGramePacketOperator {

	public DatagramPacket createResponseDataGramePacket(DatagramPacket packet, byte[] buf){
        InetAddress address = packet.getAddress();
        int port = packet.getPort();
        return new DatagramPacket(buf, buf.length, address, port);
	}
}

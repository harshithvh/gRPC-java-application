package data;

import com.grpcTrainbooking.proto.Receipt;
import java.util.HashMap;
import java.util.Map;

public class TicketData {
    private static final TicketData instance = new TicketData();

    public Map<String, Receipt> userInfo = new HashMap<>();
    public boolean[] seatAvailabilityA = new boolean[10];
    public boolean[] seatAvailabilityB = new boolean[10];

    private TicketData() {
        // Private constructor to prevent instantiation
    }

    public static TicketData getInstance() {
        return instance;
    }

    public Map<String, Receipt> getUserInfo() {
        return userInfo;
    }

    public boolean[] getSeatAvailabilityA() {
        return seatAvailabilityA;
    }

    public boolean[] getSeatAvailabilityB() {
        return seatAvailabilityB;
    }
}

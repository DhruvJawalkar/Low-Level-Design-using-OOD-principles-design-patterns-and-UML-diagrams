package amazon_online_shopping_system.shipments;

import amazon_online_shopping_system.enums.ShipmentStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Shipment {
    private String shipmentNumber;
    private Date shipmentDate;
    private Date estimatedArrival;
    private String shipmentMethod;

    private List<ShipmentLog> shipmentLogs;

    public Shipment(String shipmentNumber, Date shipmentDate, String shipmentMethod){
        this.shipmentNumber = shipmentNumber;
        this.shipmentDate = shipmentDate;
        this.shipmentMethod = shipmentMethod;

        this.shipmentLogs = new ArrayList<>();

        ShipmentLog log = new ShipmentLog(shipmentNumber, new Date(), ShipmentStatus.SHIPPED);
        this.shipmentLogs.add(log);
    }

    public boolean addShipmentLog(ShipmentLog shipmentLog) {
        this.shipmentLogs.add(shipmentLog);
        return true;
    }

    public String getShipmentNumber() {
        return shipmentNumber;
    }

    public Date getShipmentDate() {
        return shipmentDate;
    }

    public Date getEstimatedArrival() {
        return estimatedArrival;
    }

    public String getShipmentMethod() {
        return shipmentMethod;
    }

    public List<ShipmentLog> getShipmentLogs() {
        return shipmentLogs;
    }
}



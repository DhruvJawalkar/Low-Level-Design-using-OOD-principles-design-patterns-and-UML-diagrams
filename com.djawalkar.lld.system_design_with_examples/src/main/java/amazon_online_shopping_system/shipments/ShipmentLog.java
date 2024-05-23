package amazon_online_shopping_system.shipments;

import amazon_online_shopping_system.enums.ShipmentStatus;

import java.util.Date;

public class ShipmentLog {
    private String shipmentNumber;
    private Date creationDate;
    private ShipmentStatus status;

    public ShipmentLog(String shipmentNumber, Date creationDate, ShipmentStatus status){
        this.shipmentNumber = shipmentNumber;
        this.creationDate = creationDate;
        this.status = status;
    }

    public String getShipmentNumber() {
        return shipmentNumber;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public ShipmentStatus getStatus() {
        return status;
    }
}

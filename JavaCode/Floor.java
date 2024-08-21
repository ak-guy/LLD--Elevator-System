import Buttons.ButtonDispatcher.ExternalButtonDispatcher;
import Enums.Direction;

public class Floor {
    String floorID;
    int floorNumber;
    ExternalButtonDispatcher externalButtonDispatcher;

    Floor(String floorID, int floorNumber) {
        this.floorID = floorID;
        this.floorNumber = floorNumber;
        externalButtonDispatcher = new ExternalButtonDispatcher();
    }

    public void pressButton(Direction direction) {
        externalButtonDispatcher.submitExternalRequest(floorNumber, direction);
    }

}
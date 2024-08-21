package ElevatorCar;

import ElevatorDisplay.Display;
import Enums.ElevatorState;
import Buttons.InternalButton;
import Enums.Direction;
import ElevatorDoor.Door;

public class Elevator {
    String elevatorID;
    Display elevatorDisplay;
    InternalButton internalButton;
    ElevatorState elevatorState;
    int currentFloor;
    Direction direction;
    Door elevatorDoor;

    public Elevator(String elevatorID) {
        this.elevatorID = elevatorID;
        this.elevatorDisplay = new Display();
        this.internalButton = new InternalButton();
        elevatorState = ElevatorState.IDLE;
        currentFloor = 0;
        this.direction = Direction.UP;
        this.elevatorDoor = new Door();
    }

    public void showDisplay() {
        this.elevatorDisplay.showDisplay();
    }

    public void setDisplay() {
        this.elevatorDisplay.setDisplay(currentFloor, direction);
    }

    public void pressButton(int destinationFloor) {
        this.internalButton.pressButton(destinationFloor, this);
    }

    public boolean moveElevatorCar(Direction direction, int destinationFloor) {
        // car movement logic
        return false;
    }

}

package ElevatorCar;

import java.util.PriorityQueue;

import Enums.Direction;

import java.util.ArrayList;
import java.util.List;

/*
 * to mimic LOOK approach we will use priority queue
 */

public class ElevatorController {
    PriorityQueue<Integer> goingUpPriorityQueue;
    PriorityQueue<Integer> goingDownPriorityQueue;
    Elevator elevatorCar;
    List<Integer> toHoldRequest;

    public ElevatorController(Elevator elevator) {
        this.goingUpPriorityQueue = new PriorityQueue<>();
        this.goingDownPriorityQueue = new PriorityQueue<>((a,b) -> b-a); // max priority queue
        this.elevatorCar = elevator;
        this.toHoldRequest = new ArrayList<>();
    }

    public void handleExternalRequest(int floorNumber, Direction direction) {
        // logic
    }

    public void handleInternalRequest(int floorNumber, Elevator elevator) {
        // logic
    }

    public void moveElevator(Elevator elevator) {
        // logic
    }

}

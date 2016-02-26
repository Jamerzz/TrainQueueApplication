/**
 * Author(s): Group 13
 * Assignment: Lab 3 - TrainQueue Application
 *
 * Description: Station class holds a queue of passenger
 * objects that board the train after the necessary
 * passengers have already departed the train. Trains
 * pass through the station and add / remove passengers accordingly.
 */
public class Station {

    private QueueOfPassengers passengers; // passenger objects held in a queue (line) for boarding the train
    private Integer stationNumber; // the station's location (number)

    public Station(Integer stationNumber) {
        //default constructor without any passengers assigned
        this.stationNumber = stationNumber;
    }

    /**
     * Constructor for the Station object, of which assigns
     * it's corresponding number (location) and the passenger
     * objects that will be initially waiting to board the next train.
     * @param passengers Queue of passenger objects waiting to board a train
     * @param stationNumber Station's corresponding number (location)
     */
    public Station(QueueOfPassengers passengers, Integer stationNumber) {
        this.passengers = passengers;
        this.stationNumber = stationNumber;
    }

    /**
     * Getter method for the Station's queue of passenger objects
     * @return Queue of passengers
     */
    public QueueOfPassengers getQueueOfPassengers() {
        return this.passengers;
    }

}

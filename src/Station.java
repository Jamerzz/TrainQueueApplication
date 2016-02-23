/**
 * Group 13
 */
public class Station {

    private QueueOfPassengers passengers;
    private Integer stationNumber;

    public Station(Integer stationNumber) {
        this.stationNumber = stationNumber;
    }

    public Station(QueueOfPassengers passengers, Integer stationNumber) {
        this.passengers = passengers;
        this.stationNumber = stationNumber;
    }

    public QueueOfPassengers getQueueOfPassengers() {
        return this.passengers;
    }

    public void setPassengers(QueueOfPassengers passengers) {
        this.passengers = passengers;
    }

    public Integer getStationNumber() {
        return this.stationNumber;
    }

    public void setStationNumber(Integer stationNumber) {
        this.stationNumber = stationNumber;
    }
}

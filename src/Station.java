/**
 * Created by Guri on 2/17/16.
 */
public class Station {

    private QueueOfPassengers passengers;
    private Integer stationNumber;

    public Station(Integer stationNumber) {
        //default constructor
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

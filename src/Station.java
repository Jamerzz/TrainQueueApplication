/**
 * Created by Guri on 2/17/16.
 */
public class Station {

    private QueueOfPassengers passengers;
    private Integer stationNumber;

    public Station(Integer stationNumber) {
        this.passengers = new QueueOfPassengers(generatePassengers());
        this.stationNumber = stationNumber;
    }

    public Passenger[] generatePassengers() {

        Passenger[] passengers = new Passenger[10];
        passengers[0] = new Passenger(1,5);
        passengers[1] = new Passenger(1,6);
        passengers[2] = new Passenger(2,3);
        passengers[3] = new Passenger(1,8);
        passengers[4] = new Passenger(4,8);
        passengers[5] = new Passenger(3,5);
        passengers[6] = new Passenger(2,4);
        passengers[7] = new Passenger(6,7);
        passengers[8] = new Passenger(3,8);
        passengers[9] = new Passenger(1,2);

        return passengers;
    }

    public QueueOfPassengers getQueueOfPassengers() {
        return this.passengers;
    }

    public Integer getStationNumber() {
        return this.stationNumber;
    }

}

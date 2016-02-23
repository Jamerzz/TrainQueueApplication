/**
 * Group 13
 */
public class Train {

    private TrainRoute route;
    private Integer currentStation;
    private Integer nextStation;

    private Integer capacity;

    Passenger[] passengerArray = new Passenger[20];

    public Train()
    {
        currentStation = 0;
        capacity = passengerArray.length;
    }

    public Train(TrainRoute route)
    {
        this.currentStation = route.getRouteList().get(0);
        this.nextStation = route.getRouteList().get(1);
        this.capacity = passengerArray.length;
        this.route = route;

    }

    // get/set current station methods
    public Integer getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(Integer currentStation) {
        this.currentStation = currentStation;
    }

    // get/set next station methods
    public Integer getNextStation() {
        return nextStation;
    }

    public void setNextStation(int nextStation) {
        this.nextStation = nextStation;
    }

    // get/set route
    public TrainRoute getTrainRoute() {
        return route;
    }

    public void setTrainRoute(TrainRoute route) {
        this.route = route;
    }

    public void addPassenger(Passenger newPassenger)
    {
        if (capacity > 0)
        {
            passengerArray[capacity - 1] = newPassenger;
            capacity--;
        }
    }

    public void removePassenger(int passenger)
    {
        passengerArray[passenger] = null;
        capacity++;
    }

    public Integer numberOfPassengers()
    {
        int counter = 0;
        for (int i = 0; i < passengerArray.length - 1; i++) {
            if (passengerArray[i] != null) {
                counter++;
            }
        }
        return counter;
    }


}

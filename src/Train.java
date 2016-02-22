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

    public void setNextStation(Integer nextStation) {
        this.nextStation = nextStation;
    }

    // get/set route
    public TrainRoute getRoute() {
        return route;
    }

    public void setRoute(TrainRoute route) {
        this.route = route;
    }

    public void addPassenger(Passenger newPassenger)
    {
        if (newPassenger.getStartingStation() == currentStation)
        {
            passengerArray[capacity] = newPassenger;
            capacity--;
        }
    }

    public void removePassenger(Passenger currentPassenger)
    {
        for (int i = 0; i < passengerArray.length; i++) {
            if (passengerArray[i].equals(currentPassenger)) {
                passengerArray[i]  = null;
                capacity++;
            }
        }
    }

    public Integer numberOfPassengers()
    {
        return passengerArray.length;
    }


}

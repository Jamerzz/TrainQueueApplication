/**
 * Group 13
 */
public class Train {

    private TrainRoute route;
    private Integer currentStation;
    private Integer nextStation;
    Passenger[] passengerArray = new Passenger[50];

    public Train(TrainRoute route)
    {
        this.route = route;
        currentStation = 0;
    }

    public void addPassenger(Passenger newPassenger)
    {
        if (newPassenger.getStartingStation() == currentStation)
        {
            passengerArray[numberOfPassengers()]=newPassenger;
        }
    }

    public void removePassenger(Passenger currentPassenger)
    {
        if (currentPassenger.getEndingStation() == currentStation)
        {
            //will add stuff for this
        }
    }

    public int numberOfPassengers()
    {
        return passengerArray.length;
    }
}

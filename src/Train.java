/**
 * Group 13
 */
public class Train {

    private Object trainRoute;
    private String currentStation;
    private String nextStation;
    Passenger[] passengerArray = new Passenger[50];

    public Train()
    {
        trainRoute = 1;
        currentStation = "0";
    }

    public Train(Object newRoute)
    {
        trainRoute = newRoute;
        currentStation = "0";
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

        }
    }

    public int numberOfPassengers()
    {
        return passengerArray.length;
    }
}

/**
 * Group 13
 */
public class Passenger {

    private String startingStation;
    private String endingStation;

    public Passenger(){
        startingStation ="1";
        endingStation ="2";
    }

    public Passenger(String newStart, String newEnd)
    {
        startingStation = newStart;
        endingStation = newEnd;
    }

    public void setStartingStation(String newStart)
    {
        startingStation = newStart;
    }

    public void setEndingStation(String newEnd)
    {
        endingStation = newEnd;
    }

    public String getStartingStation()
    {
        return startingStation;
    }

    public String getEndingStation()
    {
        return endingStation;
    }
}

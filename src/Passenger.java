/**
 * Group 13
 */
public class Passenger {

    private Integer startingStation;
    private Integer endingStation;

    public Passenger(Integer startingStation, Integer endingStation)
    {
        this.startingStation = startingStation;
        this.endingStation = endingStation;
    }

    public Integer getStartingStation()
    {
        return startingStation;
    }

    public Integer getEndingStation()
    {
        return endingStation;
    }
}

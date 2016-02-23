/**
 * Group 13
 */
public class Passenger {

    private Integer startingStation;
    private Integer endingStation;

    public Passenger(int startingStation, int endingStation) {
        this.startingStation = startingStation;
        this.endingStation= endingStation;
    }

    public Integer getStartingStation()
    {
        return startingStation;
    }

    public Integer getEndingStation()
    {
        return endingStation;
    }

    public void setEndingStation(Integer endingStation) {
        this.endingStation = endingStation;
    }

    public void setStartingStation(Integer startingStation) {
        this.startingStation = startingStation;
    }
}

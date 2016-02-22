/**
 * Group 13
 */
public class Passenger {

    private Integer startingStation;
    private Integer endingStation;
    public String name;

    public Passenger() {
        //default constructor
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

/**
 * Author(s): Group 13
 * Assignment: Lab 3 - TrainQueue Application
 *
 * Description: Passenger Class provides underlying functionality
 * for each passenger object, of which will be
 * added and removed from trains / stations throughout
 * the execution of the application.
 */
public class Passenger {

    private Integer startingStation; //station the passenger starts at
    private Integer endingStation; //station the passenger exits the train at

    /**
     * Constructor for the Passenger object. Each passenger is
     * assigned both a starting and ending station for use
     * with the application.
     * @param startingStation Station the passenger starts at
     * @param endingStation Station the passenger exits at
     */
    public Passenger(int startingStation, int endingStation) {
        this.startingStation = startingStation;
        this.endingStation= endingStation;
    }

    /**
     * Getter method for startingStation
     * @return Passenger's starting station
     */
    public Integer getStartingStation()
    {
        return startingStation;
    }

    /**
     * Getter method for endingStation
     * @return Passenger's ending station
     */
    public Integer getEndingStation()
    {
        return endingStation;
    }
}

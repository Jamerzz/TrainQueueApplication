/**
 * Author(s): Group 13
 * Assignment: Lab 3 - TrainQueue Application
 *
 * Description: Train class holds passenger objects
 * for each iteration of the application (moving
 * from 1 station to the next). Trains are responsible
 * for adding and removing passengers accordingly
 * at each stop in the application.
 */
public class Train {

    private TrainRoute route; //Route for the train to follow
    private Integer currentStation; //Train's current station
    private Integer nextStation; //Next station in the route for the train

    private Integer remainingSeats; //Number of seats left for passengers trying to get on train

    Passenger[] passengerArray = new Passenger[20]; //Containment of passenger objects on the train with capacity (20)

    public Train() {
        //default constructor
        currentStation = 0;
        remainingSeats = passengerArray.length;
    }

    /**
     * Constructor for the Train object, sets the route,
     * next & current stations and the remaining number of seats
     * for passengers attempting to get onto the train at each station.
     * @param route The route for the train to follow during the simulation.
     */
    public Train(TrainRoute route) {
        this.currentStation = route.getRouteList().get(0);
        this.nextStation = route.getRouteList().get(1);
        this.remainingSeats = passengerArray.length;
        this.route = route;

    }

    /**
     * Getter method for the current station
     * @return Current location (station) of the train.
     */
    public Integer getCurrentStation() {
        return currentStation;
    }

    /**
     * Setter method for the current station
     * @param currentStation Current location (station) of the train.
     */
    public void setCurrentStation(Integer currentStation) {
        this.currentStation = currentStation;
    }

    /**
     * Getter method for the next station
     * @return The next station for the train to travel to.
     */
    public Integer getNextStation() {
        return nextStation;
    }

    /**
     * Stter method for the next station
     * @param nextStation The next station for the train to travel to.
     */
    public void setNextStation(int nextStation) {
        this.nextStation = nextStation;
    }

    /**
     * Getter method for the train's route
     * @return The train's overall route.
     */
    public TrainRoute getTrainRoute() {
        return route;
    }

    /**
     * Adds new passenger objects to the train at a given station.
     * @param newPassenger The passenger object to be added to the train.
     */
    public void addPassenger(Passenger newPassenger)
    {
        if (remainingSeats > 0) //make sure there is space on the train for the passenger
        {
            passengerArray[remainingSeats - 1] = newPassenger;
            remainingSeats--;
        }
    }

    /**
     * Removes passenger objects from the train at a given station
     * @param passenger The desired passenger to be removed from the train.
     */
    public void removePassenger(int passenger)
    {
        passengerArray[passenger] = null;
        remainingSeats++;
    }

    /**
     * Getter method for remaining seats on the Train.
     * @return Number of remaining seats.
     */
    public Integer getRemainingSeats() {
        return remainingSeats;
    }

    /**
     * Setter method for remaining seats on the train.
     * @param remainingSeats Desired number of remaining seats to be set.
     */
    public void setRemainingSeats(Integer remainingSeats) {
        this.remainingSeats = remainingSeats;
    }

    /**
     * Determines how many passenger objects are actually on the train at
     * a given time.
     * @return Number of passengers on the train.
     */
    public Integer numberOfPassengers()
    {
        return 20 - remainingSeats;
    }


}

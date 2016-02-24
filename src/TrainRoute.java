import java.sql.Array;
import java.util.ArrayList;

/**
 * Author(s): Group 13
 * Assignment: Lab 3 - TrainQueue Application
 *
 * Description: TrainRoute class holds the route
 * for a given train, comprised of integers that
 * correspond to specific stations.
 */
public class TrainRoute {

    private ArrayList<Integer> route; //Trains actual route of stations to stop at

    /**
     * Constructor for the TrainRoute object.
     * Actual route is set in the constructor.
     * @param route
     */
    public TrainRoute(ArrayList<Integer> route) {
        this.route = route;
    }

    /**
     * Getter method for the TrainRoute's route
     * @return The route ArrayList of integers (stations)
     */
    public ArrayList<Integer> getRouteList() {
        return this.route;
    }

}

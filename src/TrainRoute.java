import java.sql.Array;
import java.util.ArrayList;

/**
 * Group 13
 */
public class TrainRoute {

    private ArrayList<Integer> route;

    public TrainRoute(ArrayList<Integer> route) {
        this.route = route;
    }

    public ArrayList<Integer> getRouteList() {
        return this.route;
    }

    public void setRouteList(ArrayList<Integer> route) {
        this.route = route;
    }

}

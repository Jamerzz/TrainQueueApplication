/**
 * Group 13
 */
public class TrainRoute {

    private Station[] route;

    public TrainRoute(Integer numberOfStations, Station[] route) {
        this.route = route;
        for (int i = 0; i < numberOfStations; i++) {
            route[i] = new Station(i+1);
        }
    }

    public Station[] getRoute() {
        return this.route;
    }
}

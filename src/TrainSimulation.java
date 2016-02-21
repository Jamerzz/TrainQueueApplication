/**
 * Created by Guri on 2/17/16.
 */
public class TrainSimulation {

    public static void main(String[] args) {
        //Test Case 1:

        int stationCount = 5;
        TrainRoute route1 = new TrainRoute(stationCount, new Station[stationCount]);
        Train t1 = new Train(route1);
        t1.setCurrentStation(route1.getRoute()[0].getStationNumber());
    }

}

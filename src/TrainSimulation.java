import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

/**
 * Group 13
 */
public class TrainSimulation {

    private static ArrayList<Station> stations = new ArrayList<>();
    private static ArrayList<Train> trains;
    private static int runCounter = 1;

    public static void main(String[] args) {
        //Test Case 1:
        initializeSimulation();
        runSimulation();
        runSimulation();
        runSimulation();
        runSimulation();
    }

    public static void initializeSimulation() {

        final int[] trainStations = {1, 2, 3, 4, 5};

        //Initialize all stations
        for (int trainStation : trainStations) {
            ArrayList<Passenger> stationPassengers = new ArrayList<>();
            QueueOfPassengers queueOfPassengers = new QueueOfPassengers(stationPassengers);
            Station station = new Station(queueOfPassengers, trainStation - 1);
            stations.add(station);
        }

        //Initialize all passengers and enqueue to starting stations
        for (int i = 0; i < 200; i++) {
            int startingStation = new Random().nextInt(trainStations.length - 1 + 1) + 1;
            int endingStation = new Random().nextInt(trainStations.length - 1 + 1) + 1;
            Passenger passenger = new Passenger(startingStation, endingStation);

            QueueOfPassengers stationPassengers = stations.get(passenger.getStartingStation() - 1).getQueueOfPassengers();
            stationPassengers.getArrayQueue().enqueue(passenger);
        }

        //Initialize all trains
        final Train train1 = new Train(new TrainRoute(new ArrayList<>(Arrays.asList(5, 2, 3, 4))));
        final Train train2 = new Train(new TrainRoute(new ArrayList<>(Arrays.asList(1, 3, 5, 2))));
        final Train train3 = new Train(new TrainRoute(new ArrayList<>(Arrays.asList(4, 1, 2, 5))));
        final Train train4 = new Train(new TrainRoute(new ArrayList<>(Arrays.asList(2, 3, 4, 1))));
        final Train train5 = new Train(new TrainRoute(new ArrayList<>(Arrays.asList(3, 4, 5, 2))));
        trains = new ArrayList<Train>() {{
            add(train1);
            add(train2);
            add(train3);
            add(train4);
            add(train5);
        }};

        //Display initialization
        System.out.println("--------- Initialization --------");
        System.out.println("Train 1 is docked at Station: " + train1.getCurrentStation());
        System.out.println("Train 2 is docked at Station: " + train2.getCurrentStation());
        System.out.println("Train 3 is docked at Station: " + train3.getCurrentStation());
        System.out.println("Train 4 is docked at Station: " + train4.getCurrentStation());
        System.out.println("Train 5 is docked at Station: " + train5.getCurrentStation());

    }

    public static void runSimulation() {

        System.out.println("-------- Run " + runCounter + " --------");
        int trainCounter = 0;
        for (Train train: trains) {

            QueueOfPassengers departingPassengers = stations.get(train.getCurrentStation() - 1).getQueueOfPassengers();
            int passengersBoarded = 0;
            for (int i = 0; i < departingPassengers.getArrayQueue().getNumberOfEntries(); i++) {
                Passenger currentPassenger = (Passenger) departingPassengers.getArrayQueue().getFront();
                if (train.getTrainRoute().getRouteList().contains(currentPassenger.getEndingStation())) {
                    train.addPassenger((Passenger) departingPassengers.getArrayQueue().dequeue());
                    passengersBoarded++;
                }
            }

            int passengersRemoved = 0;
            int counter = train.passengerArray.length - 1;
            while (train.passengerArray[counter] != null) {
                if (train.passengerArray[counter].getEndingStation().equals(train.getCurrentStation())) {
                    train.removePassenger(counter);
                    passengersRemoved++;
                }
                counter--;
            }

            System.out.println("Train " + (trainCounter + 1) + " is docked at Station: " + trains.get(trainCounter).getCurrentStation() + "  | Passengers Aboard: " + trains.get(trainCounter).numberOfPassengers() + " | Passengers Removed: " + passengersRemoved + " | Passengers Boarded: " + passengersBoarded);
            int nextStationIndex = train.getTrainRoute().getRouteList().indexOf(train.getCurrentStation());
            train.setCurrentStation(train.getNextStation());
            train.setNextStation(nextStationIndex + 1);
            trainCounter++;

        }

        runCounter++;

    }
}
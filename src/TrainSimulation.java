import java.util.*;

/**
 * Author(s): Group 13
 * Assignment: Lab 3 - TrainQueue Application
 *
 * Description: Program that simulates trains
 * picking and up and leaving passengers at stations
 * using a circular queue structure and nature.
 */
public class TrainSimulation {

    private static ArrayList<Station> stations = new ArrayList<>();
    private static ArrayList<Train> trains;
    private static ArrayList<Integer> trainStations = new ArrayList<Integer>() {{
        add(1);
        add(2);
        add(3);
        add(4);
        add(5);
    }};
    private static int runCounter = 1;
    private static final Integer generatedPassengers = 250;

    public static void main(String[] args) {

        initializeSimulation();
        runSimulation();
        runSimulation();
        runSimulation();
        runSimulation();
        runSimulation();
        runSimulation();
        runSimulation();
        runSimulation();
        runSimulation();
        runSimulation();
        runSimulation();
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
        for (int i = 0; i < generatedPassengers; i++) {
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

            int passengersRemoved = 0;
            for (int i = 0; i < train.passengerArray.length; i++) {
                if (train.passengerArray[i] != null && train.passengerArray[i].getEndingStation().equals(train.getCurrentStation())) {
                    train.removePassenger(i);
                    passengersRemoved++;
                }
            }

            QueueOfPassengers departingPassengers = stations.get(train.getCurrentStation() - 1).getQueueOfPassengers();
            int passengersBoarded = 0;
            while (train.getRemainingSeats() != 0 && !departingPassengers.getArrayQueue().isEmpty()) {
                    train.addPassenger((Passenger) departingPassengers.getArrayQueue().dequeue());
                    passengersBoarded++;
             }

        System.out.println("Train " + (trainCounter + 1) + " is docked at Station: " + trains.get(trainCounter).getCurrentStation() + "  | Passengers Aboard: " + trains.get(trainCounter).numberOfPassengers() + " | Passengers Removed: " + passengersRemoved + " | Passengers Boarded: " + passengersBoarded);

        if (!train.getCurrentStation().equals(5)) {
            train.setCurrentStation(train.getCurrentStation() + 1);
                train.setNextStation(train.getCurrentStation() + 1);
            }
            else {
                train.setCurrentStation(1);
                train.setNextStation(2);
            }
            trainCounter++;

        }

        runCounter++;

    }
}
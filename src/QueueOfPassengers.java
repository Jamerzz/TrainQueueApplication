import java.util.ArrayList;

/**
 * Author(s): Group 13
 * Assignment: Lab 3 - TrainQueue Application
 *
 * Description: Class QueueOfPassengers creates an ArrayQueue of Passenger
 * objects to be used by each Station object for the
 * Train Simulation Application
 */
public class QueueOfPassengers {

    private ArrayQueue queue; //ArrayQueue for queue of Passenger Objects.


    /**
     * Default constructor for QueueOfPassengers Object. Fills the
     * Queue with the initial collection of Passenger Objects to
     * be used by a Station.
     * @param passengers Collection of Passenger Objects for initial queue.
     */
    public QueueOfPassengers(ArrayList<Passenger> passengers) {
        queue = new ArrayQueue(); //queue to contain passengers at station
        for (Passenger p : passengers) {
            // add each of the passengers to initial queue
            queue.enqueue(p);
        }
    }

    /**
     * Getter method for the queue of passengers.
     * @return Queue containing each of the passenger objects.
     */
    public ArrayQueue getArrayQueue() {
        return queue;
    }



}

/**
 * Author: James Salvatore
 *
 * Class QueueOfPassengers creates an ArrayQueue of Passenger
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
    public QueueOfPassengers(Passenger[] passengers) {
        queue = new ArrayQueue(); //queue to contain passengers at station
        for (Passenger p : passengers) {
            // add each of the passengers to initial queue
            queue.enqueue(p);
        }
    }

}

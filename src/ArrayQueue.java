import java.util.Arrays;

/**
 * Author: James Salvatore
 *
 * ArrayQueue Class is an ADT for a Queue, implemented
 * using a Circular Array. QueueInterface is implemented in
 * order to provide core methods of a Queue for the ADT.
 */
public class ArrayQueue<T> implements QueueInterface {


    private T[] queue; //Array representing the "Queue"
    private int frontIndex; //Front of the Circular Array
    private int backIndex; //Back of Circular Array
    private int entries; //Current number of entries in queue

    private static final int defaultCapacity = 50;

    public ArrayQueue() {
        //default constructor
        this(defaultCapacity);
    }

    /**
     * Constructor for ArrayQueue Object. Sets the initial
     * capicty of the Array and the associated frontIndex,
     * backIndex and entries.
     * @param initialCapacity
     */
    public ArrayQueue(int initialCapacity) {
        @SuppressWarnings("unchecked")
        T[] tempQueue =  (T[]) new Object[initialCapacity + 1];//+1 for the empty space to track isEmpty
        queue = tempQueue;
        frontIndex = 0;
        backIndex = initialCapacity;
        entries = 0;
    }

    /**
     * Adds a new entry to the back of this queue.
     *
     * @param newEntry An object to be added.
     */
    @Override
    public void enqueue(Object newEntry) {
        ensureCapacity();
        backIndex = (backIndex + 1) % queue.length;
        queue[backIndex] = (T)newEntry;
        entries++;
    }

    /**
     * Removes and returns the entry at the front of this queue.
     *
     * @return The object at the front of the queue.
     * @throws EmptyQueueException if the queue is empty before the operation.
     */
    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new EmptyQueueException("Queue is empty.");
        }
        else {
            T currFront = queue[frontIndex];
            queue[frontIndex] = null;
            frontIndex = (frontIndex + 1) % queue.length;
            entries--;
            return currFront;
        }
    }

    /**
     * Retrieves the entry at the front of this queue.
     *
     * @return The object at the front of the queue.
     * @throws EmptyQueueException if the queue is empty.
     */
    @Override
    public T getFront() {
        if (isEmpty()) {
            throw new EmptyQueueException("Queue is empty.");
        }
        else {
            return queue[frontIndex];
        }
    }

    /**
     * Detects whether this queue is empty.
     *
     * @return True if the queue is empty, or false otherwise.
     */
    @Override
    public boolean isEmpty() {
        boolean empty = false;
        if (frontIndex == (backIndex + 1) % queue.length) {
            empty = true;
        }
        return empty;
    }

    /**
     * Removes all entries from this queue.
     */
    @Override
    public void clear() {
        Arrays.fill(queue, null);
        entries = 0;
    }

    /**
     * Increases Array size if adding a new element will fill
     * the last remaining space in the Array.
     */
    private void ensureCapacity() {
        if (frontIndex == ((backIndex + 2) % queue.length)) {
            // if queue array is about to be full, need to increase it's size (2x).
            T[] currQueue = queue;
            int currSize = queue.length;
            int newSize = 2 * currSize;

            //checkCapacity(newSize);//not necessary for this implementation

            @SuppressWarnings("unchecked")
            T[] tempQueue = (T[]) new Object[newSize];
            queue = tempQueue;
            for (int index = 0; index < currSize - 1; index++) {
                // fill new array with old contents
                queue[index] = currQueue[frontIndex];
                frontIndex = (frontIndex + 1) % currSize;
            }
            frontIndex = 0;
            backIndex = currSize - 2;
        }
    }

    /**
     * Provides printable version of the ArrayQueue for each
     * of its containing elements.
     * @return String containing a viewable form of each element in Array
     */
    @Override
    public String toString() {
        String queueString = "";

        for (int i = 0; i < queue.length; i++) {
            if (queue[i] == null) {
                queueString += "empty" + " ";
            }
            else {
                queueString += queue[i] + " ";
            }
        }
        return queueString;
    }

    /**
     * Provides the number of entries that are currently in
     * the Array (NOT the size of the Array itself).
     * @return Number of entries in Array
     */
    public Integer getNumberOfEntries() {
        return this.entries;
    }
}

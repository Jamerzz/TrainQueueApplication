/**
 * Author: James Salvatore
 * Class QueueTestSuite demonstrates functionality for each
 * of the methods from the ArrayQueue class.
 */
public class QueueTestSuite {

    /**
     * Runs the two provided test methods.
     * @param args
     */
    public static void main(String[] args) {
        //test1();//works
        //test2();//work
    }

    /**
     * Tests the following methods of the
     * ArrayQueue class: (ArrayQueue(), isEmpty(), enqueue(),
     * dequeue(), getNumberOfEntries).
     */
    public static void test1() {
        ArrayQueue cool = new ArrayQueue(0);
        System.out.println("Queue Initialized, is queue empty: " + cool.isEmpty() + "\n");//works
        cool.enqueue("James");
        System.out.println("Added James\nQueue: " + cool);
        System.out.println("Entries: " + cool.getNumberOfEntries() + "\n");
        System.out.println("is queue empty: " + cool.isEmpty() + "\n");//works
        cool.enqueue("Bob");
        System.out.println("Added Bob\nQueue: " + cool);
        System.out.println("Entries: " + cool.getNumberOfEntries() + "\n");
        cool.enqueue("Alex");
        System.out.println("Added Alex\nQueue: " + cool);
        System.out.println("Entries: " + cool.getNumberOfEntries() + "\n");
        cool.enqueue("Emily");
        System.out.println("Added Emily\nQueue: " + cool);
        System.out.println("Entries: " + cool.getNumberOfEntries() + "\n");
        System.out.println("Beginning Dequeue Process...\n");
        cool.dequeue();
        System.out.println("Queue: " + cool);
        System.out.println("Entries: " + cool.getNumberOfEntries() + "\n");
        cool.dequeue();
        System.out.println("Queue: " + cool);
        System.out.println("Entries: " + cool.getNumberOfEntries() + "\n");
        cool.dequeue();
        System.out.println("Queue: " + cool);
        System.out.println("Entries: " + cool.getNumberOfEntries() + "\n");
        cool.dequeue();
        System.out.println("Queue: " + cool);
        System.out.println("Entries: " + cool.getNumberOfEntries() + "\n");
    }

    /**
     * Tests the additional ArrayQueue methods: (clear(), getFront()).
     */
    public static void test2() {
        ArrayQueue cool = new ArrayQueue(0);
        System.out.println("Queue Initialized, is queue empty: " + cool.isEmpty() + "\n");//works
        cool.enqueue("Joe");
        System.out.println("Added Joe\nQueue: " + cool);
        System.out.println("Entries: " + cool.getNumberOfEntries() + "\n");
        System.out.println("is queue empty: " + cool.isEmpty() + "\n");//works
        cool.enqueue("Rob");
        System.out.println("Added Rob\nQueue: " + cool);
        System.out.println("Entries: " + cool.getNumberOfEntries() + "\n");
        System.out.println("Front of the Queue: " + cool.getFront() + "\n");
        System.out.println("Clearing the Queue...\n");
        cool.clear();
        System.out.println("Queue: " + cool + "\n");
        System.out.println("Entries: " + cool.getNumberOfEntries());

    }
}

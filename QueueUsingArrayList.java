import java.util.ArrayList;

public class QueueUsingArrayList {
    public static void main(String args[]){
        ArrayList<Integer> queue = new ArrayList<>();

        //Enqueue
        queue.add(10);
        queue.add(20);
        queue.add(30);

        //Current State of queue
        System.out.println("current Queue status : "+queue);

        //dequeue
        System.out.println("de-queuing item"+queue.get(0));
        queue.remove(0);

        //Current State of queue
        System.out.println("current Queue status : "+queue);

        //Get current size of queue
        System.out.println("Queue Size is: "+ queue.size());

        //Get Front of the queue
        System.out.println("Front of the queue: "+ queue.get(0));







    }
}

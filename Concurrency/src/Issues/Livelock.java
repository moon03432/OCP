package Issues;

/**
 * Created by moon on 30/11/2016.
 *
 * Livelock occurs when two or more threads are conceptually blocked forever,
 * although they are each still active and trying to complete their task.
 * Livelock is a special case of resource starvation in which two or more threads
 * actively try to acquire a set of locks, are unable to do so, and restart part of the process.
 *
 * Livelock is often a result of two threads trying to resolve a deadlock.
 * Returning to our fox example, imagine that Foxy and Tails are both holding their food and water resources,
 * respectively. They each realize that they cannot finish their meal in this state,
 * so they both let go of their food and water, run to opposite side of the environment,
 * and pick up the other resource. Now Foxy has the water, Tails has the food, and neither is able to finish their meal!
 *
 * If Foxy and Tails continue this process forever, it is referred to as livelock.
 * Both Foxy and Tails are active, running back and forth across their area, but
 * neither is able to finish their meal. Foxy and Tails are executing a form of failed deadlock recovery.
 * Each fox notices that they are potentially entering a deadlock state and responds by releasing all of
 * its locked resources. Unfortunately, the lock and unlock process is cyclical,
 * and the two foxes are conceptually deadlocked.
 *
 * In practice, livelock is often very difficult issue to detect.
 * Threads in a livelock state appear active and able to respond to requests,
 * even when they are in fact stuck in an endless cycle.
 */
public interface Livelock {
}

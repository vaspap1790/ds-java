package com.example.dsjava.creational.singleton;

/**
 * Should be used when a class must have a one and only single instance of a variable
 * Lets you access the instance from anywhere in the app
 * Guarantees only one instance of this class will be available at any point in time
 * Faster access and retrieval, reduce possibility of exceptions due to many instances
 * Use case: Database instance
 */
public class Singleton {

    /**
     * Edge case: Because of the Double-checked locking idiom, an instance that is being initialized by Thread A
     * can be accessed from Thread B. This would crash the app as the instance is not null but yet partially initialized
     * Volatile keyword avoids this edge case - enforces to read the instance from the main memory
     */
    private static volatile Singleton instance;
    private final String data;

    private Singleton(String data){
        this.data = data;
    }

    public static Singleton getInstance(String data){
        // Retrieve the instance only one time from the main memory - improves performance as much as 40%
        Singleton result = instance;

        /**
         * Double-checked locking idiom
         * Avoids overhead of the synchronization if instance is created.
         * Without the idiom, even if the instance was created,
         * every thread has to wait for their turn to acquire the lock and use the instance.
         * We do want the created instance to be used by many threads.
         * We don't want to create more than one instance because of multi-threading.
         * So, we limit synchronization only to the rare case of creating the instance.
         */
        if (result == null){
           // Avoids two threads accessing this code at the same time and returning two different instances
           synchronized (Singleton.class){
               // Retrieve the instance only one time from the main memory - improves performance as much as 40%
               result = instance;
               // We have to check for null within synchronized block to be thread safe
               if (result == null){
                   instance = result = new Singleton(data);
               }
           }
       }
       return result;
    }

    public String getData() {
        return data;
    }
}

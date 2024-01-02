package tests;

import java.util.HashSet;
import java.util.Set;

/*
Reflection, Interfaces and Basic Recursion
Recursion occurs when something is defined in terms of itself.

For example the famous Fibonacci sequence is defined recursively like this:

F(n) = F(n-1) + F(n-2)
where:
F(0) = 0, F(1) = 1.

Recursion is a very useful way to solve problems in computer science and write algorithms in a compact and elegant way.
In this exercise we will use Recursion  and Java Reflection to solve the problem of "Finding all Implemented Interfaces of a class".
 */

public class ReflectionInterfacesAndBasicRecursion {
    /**
     * Returns all the interfaces that the current input class implements.
     * Note: If the input is an interface itself, the method returns all the interfaces the
     * input interface extends.
     */
    public static Set<Class<?>> findAllImplementedInterfaces(Class<?> input) {
        Set<Class<?>> allImplementedInterfaces = new HashSet<>();

        Class<?>[] inputInterfaces = input.getInterfaces();

        for (Class<?> currentInterface : inputInterfaces) {
            allImplementedInterfaces.add(currentInterface);

            // Check if current interface has interfaces to add.
            Set<Class<?>> locallyImplementedInterfaces = findAllImplementedInterfaces(currentInterface);

            for(Class<?> currentLocallyInterface : locallyImplementedInterfaces) {
                allImplementedInterfaces.add(currentLocallyInterface);
            }


        }

        return allImplementedInterfaces;
    }
}

package exercises;

import java.awt.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ApiGatewayAndWildcards {

    public ApiGatewayAndWildcards() {
    }

    public void runner() throws ClassNotFoundException {
        Class<String> stringClass = String.class;

        Map<String, Integer> hashMapObject = new HashMap<String, Integer>();

        Class<?> hashMapClass = hashMapObject.getClass();

        Class<?> squareClass = Class.forName("exercises.ApiGatewayAndWildcards$Square");

        var circleObject = new Drawable() {
            @Override
            public int getNumberOfCorners() {
                return 0;
            }
        };

        //printClassInfo(stringClass, hashMapClass, squareClass);
        printClassInfo(Collection.class, boolean.class, int[][].class, Color.class, circleObject.getClass());
    }

    private static void printClassInfo(Class<?> ...classes) {
        for (Class<?> clazz: classes) {
            System.out.printf(
                    "Class name: %s | Class package name: %s%n",
                    clazz.getSimpleName(),
                    clazz.getPackageName()
            );

            Class<?> [] implementedInterfaces = clazz.getInterfaces();

            for (Class<?> implementedInterface: implementedInterfaces) {

                System.out.printf(
                        "Class %s implements : %s\n",
                        clazz.getSimpleName(),
                        implementedInterface.getSimpleName()
                );
            }

            System.out.println("Is array: " + clazz.isArray());
            System.out.println("Is primitive: " + clazz.isPrimitive());
            System.out.println("Is enum: " + clazz.isEnum());
            System.out.println("Is interface: " + clazz.isInterface());
            System.out.println("Is anonymous: " + clazz.isAnonymousClass());

            System.out.println();
            System.out.println();
        }
    }

    private static class Square implements Drawable {

        @Override
        public int getNumberOfCorners() {
            return 4;
        }
    }

    private static interface Drawable {
        int getNumberOfCorners();
    }

    private enum Color {
        BLUE, RED, GREEN
    }
}

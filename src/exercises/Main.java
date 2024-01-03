package exercises;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
        ApiGatewayAndWildcards apiGatewayAndWildcards = new ApiGatewayAndWildcards();
        //apiGatewayAndWildcards.runner();

        ConstructorClass constructorClass = new ConstructorClass();
        //constructorClass.runner();

    }

    public static void initConfiguration() throws NoSuchMethodException {
        Constructor<ServerConfiguration> constructor = ServerConfiguration.class.getDeclaredConstructor(int.class, String.class);

        constructor.setAccessible(true);
        constructor.newInstance(8080, "Server is online");
    }


}
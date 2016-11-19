
package tmp.test;

import java.util.function.Supplier;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App {

    Supplier func;

    private static <T> T test(final boolean noArg, final Class<T> classOfT, final Supplier<T> supp) {
        System.out.println("===");
        final Gson gson = new Gson();

        System.out.println(String.format("Create an object %s a no-arg constructor.", noArg ? "with" : "without"));
        final T objectToSerialize = supp.get();

        System.out.println("Serialze the object to JSON using Gson.");
        final String jsonTs = gson.toJson(objectToSerialize);

        System.out.println("Deserialze the object to JSON using Gson.");
        final T objectDeserialized = gson.fromJson(jsonTs, classOfT);

        System.out.println("Finished");
        System.out.println("===");

        return objectDeserialized;
    }

    public static void main(final String[] args) {
        final ObjectWithNoArgConstructor with = test(true, ObjectWithNoArgConstructor.class,
                () -> new ObjectWithNoArgConstructor());
        System.out.println(with.tt);

        final ObjectWithoutNoArgConstructor without = test(true, ObjectWithoutNoArgConstructor.class,
                () -> new ObjectWithoutNoArgConstructor(5));
        System.out.println(without.tt);
    }
}

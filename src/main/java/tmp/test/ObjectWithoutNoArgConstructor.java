
package tmp.test;

public class ObjectWithoutNoArgConstructor {

    public transient TestTransient tt = new TestTransient();

    public ObjectWithoutNoArgConstructor(final int i) {
        System.out.println(String.format("Constructor: %s", getClass().getSimpleName()));
    }

}

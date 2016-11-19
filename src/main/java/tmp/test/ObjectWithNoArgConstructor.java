
package tmp.test;

public class ObjectWithNoArgConstructor {

    public transient TestTransient tt = new TestTransient();

    public ObjectWithNoArgConstructor() {
        System.out.println(String.format("Constructor: %s", getClass().getSimpleName()));
    }

}

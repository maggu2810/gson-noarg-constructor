Demonstrate the difference between the presence and no presence of a no-arg constructor using (de)serialization using Gson.

Requirements
* Java 1.8
* Maven


Test
* Build: `mvn clean install`
* Run: `java -jar target/test-*-jar-with-dependencies.jar`

```text
===
Create an object with a no-arg constructor.
Constructor: TestTransient
Constructor: ObjectWithNoArgConstructor
Serialze the object to JSON using Gson.
Deserialze the object to JSON using Gson.
Constructor: TestTransient
Constructor: ObjectWithNoArgConstructor
Finished
===
tmp.test.TestTransient@722c41f4
===
Create an object with a no-arg constructor.
Constructor: TestTransient
Constructor: ObjectWithoutNoArgConstructor
Serialze the object to JSON using Gson.
Deserialze the object to JSON using Gson.
Finished
===
null
```
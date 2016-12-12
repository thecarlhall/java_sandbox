# Linked List of Strings

A linked list allows adding and removing nodes dynamically from a collection.
The order of the data should match the order in which it is added to the list.
The list should make available some way to traverse the data contained.

## TODO
* Finish the implementations of StringLinkedListImpl and StringLinkedNodeImpl.
  Each should implement an interface.  You will need to add any variables or
  methods necessary.
* Add tests for removing nodes with an index that is out of bounds.
* Get all tests passing.

## Setup
* Install Maven
```bash
curl -o ~/maven.tar.gz http://apache.mirrors.tds.net/maven/maven-3/3.3.9/binaries/apache-maven-3.3.9-bin.tar.gz
mkdir -p ~/dev
cd ~/dev
tar zxf ~/maven.tar.gz
# Add ~/maven-3.3.9/bin to PATH in ~/.bashrc
mvn -v
```

## Testing your solution
Run Maven's test phase
```bash
mvn test
```

You can remove all build artifacts using the clean phase.
```bash
mvn clean
```

Phases can be combined
```bash
# Compile the code but don't run tests
mvn clean compile
```

## References
[Linked list reference](https://en.wikipedia.org/wiki/Linked_list)

[Apache Maven](https://maven.apache.org/)

[Maven Lifecycle Phases](https://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html)

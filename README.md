# Manipulating XML in Java using Jackson

This repository contains the code from this [blogpost](https://stackabuse.com/serialize-and-deserialize-xml-in-java-with-jackson/) on [StackAbuse](https://stackabuse.com/). Modified by me to test things out. Thanks to the original author.

## Getting Started

### Running the Application

1. Clone the repository
```
$ git clone https://github.com/martin-12345/java-xml.git
```

2. Check into the cloned repository
```
$ cd java-xml
```

3. Install the dependencies and package the application
```
$ mvn package
```

4. Run the main method  in App.java at the command line like this or in your IDE
```
$ java -jar target/XMLDeserialise.jar
```

### Discussion
Start by examining the sample XML in to_deserialize.xml, this represented by the class ResponseData.java in which you will see fields representing the main parts of the XML Document, ApplicaionArea and DataArea. We have
Java classes for these. The Vehicles section in the XML is a collection of Vehicle elements, this is 
reproduced in the DataArea with List<Vehicle> and the annotations direct the mapping. 

Examining the JsonProperty annotations should make it clear what is mapped to what.

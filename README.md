CreateSRG
=========

### Building
You can build with Ant or Maven; they are mutually compatible.
The ant build script is very simple but requires you manually retrieve dependencies.
The maven build automatically downloads dependencies from the central repository.
Both place the resulting jars in `target/`.

##### Ant
- Download the necessary jars, listed in `lib/dependencies.txt`
- Run `ant`

##### Maven
- Run `mvn package`

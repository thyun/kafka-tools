# Kafka UpdateOffsetsInZK by topic & partition

# Build
- sbt compile
- sbt run
- sbt package

# Run
- sbt "runMain example.UpdateOffsetsInZK latest" consumer.properties mytopic 1
- sbt "runMain example.Hello"

# Install
- Copy kafka-tools_2.10-0.1.0-SNAPSHOT.jar to $KAFKA_HOME/libs

# Usage
- USAGE: example.UpdateOffsetsInZK [earliest | latest] consumer.properties topic [partition]
- (ex) bin/kafka-run-class.sh example.UpdateOffsetsInZK latest consumer.properties mytopic
- (ex) bin/kafka-run-class.sh example.UpdateOffsetsInZK latest consumer.properties mytopic 1

# springkafka

1. You need to download kafka from https://kafka.apache.org/downloads
2. Extract the tgz file and put it in a folder of your desire
3. Go to the folder where you put the kafka
4. Run the Zookeeper: 
   - For Windows:
     .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
   - For Linux/MacOS:
     ./bin/zookeeper-server.start.sh ./config/zookeeper.properties
5. Run the Kafka server:
   - For Windows:
     .\bin\windows\kafka-server-start.bat .\config\server.properties
   - For Linux/MacOS:
     ./bin/kafka-server-start.sh ./config/server.properties
6. Create a topic:
   - For Windows:
     .\bin\windows\kafka-topics.bat --create --zookeper localhost:2181 --replication-factor 1 --partition 1 --topic test
   - For Linux/MacOS:
     ./bin/kafka-topics.sh --create --zookeper localhost:2181 --replication-factor 1 --partition 1 --topic test
7. Check if the topic has been created:
   - For Windows:
     .\bin\windows\kafka-topics.bat --list --zookeeper localhost:2181
   - For Linux/MacOS:
     ./bin/kafka-topics.sh --list --zookeeper localhost:2181
8. Run the SpringBoot kafka
9. Open web browser and put this in the URL: http://localhost:8080/kafka/publish/Tom
10. It should show in the consumer 
    offset = xx key = key value = {"firstName":"Tom","lastName":"Tom"}

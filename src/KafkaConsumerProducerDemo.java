public class KafkaConsumerProducerDemo implements KafkaProperties
{
  public static void main(String[] args)
  {
    Producer producerThread = new Producer(KafkaProperties.topic,"C:\\kafka\\kafkatemp\\kafka\\topic1");
    producerThread.start();

    Consumer consumerThread = new Consumer(KafkaProperties.topic);
    consumerThread.start();
    
  }
}

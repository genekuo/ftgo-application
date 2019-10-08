package net.chrisrichardson.ftgo.cqrs.orderhistory.main;

import io.eventuate.tram.consumer.common.spring.TramConsumerCommonConfiguration;
import io.eventuate.tram.consumer.kafka.spring.EventuateTramKafkaMessageConsumerConfiguration;
import io.eventuate.tram.messaging.common.spring.TramMessagingCommonAutoConfiguration;
import net.chrisrichardson.eventstore.examples.customersandorders.commonswagger.CommonSwaggerConfiguration;
import net.chrisrichardson.ftgo.cqrs.orderhistory.messaging.OrderHistoryServiceMessagingConfiguration;
import net.chrisrichardson.ftgo.cqrs.orderhistory.web.OrderHistoryWebConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({OrderHistoryWebConfiguration.class,
        OrderHistoryServiceMessagingConfiguration.class,
        CommonSwaggerConfiguration.class,
        TramConsumerCommonConfiguration.class,
        EventuateTramKafkaMessageConsumerConfiguration.class,
        TramMessagingCommonAutoConfiguration.class})
public class OrderHistoryServiceMain {

  public static void main(String[] args) {
    SpringApplication.run(OrderHistoryServiceMain.class, args);
  }
}

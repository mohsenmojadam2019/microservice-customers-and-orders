package net.chrisrichardson.eventstore.examples.customersandorders.views.orderhistory;

import io.eventuate.util.spring.swagger.CommonSwaggerConfiguration;
import net.chrisrichardson.eventstore.examples.customersandorders.ordershistoryviewservice.domain.OrderHistoryViewMongoConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@EnableAutoConfiguration(exclude = CommonSwaggerConfiguration.class)
@Import(OrderHistoryViewMongoConfiguration.class)
public class OrderHistoryViewServiceTestConfiguration {
}

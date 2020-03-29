/**
 * 
 */
package com.anupam.rabbitmq.listener;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.listener.MessageListenerContainer;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Anupam Sharma
 *
 */
@Configuration
public class RabbitMQConfig {
	@Value("${rabbitmq.queue}")
	String queueName;

	@Value("${spring.rabbitmq.username}")
	String username;

	@Value("${spring.rabbitmq.password}")
	private String password;

	@Value("${rabbitmq.exchangeName}")
	private String exchangeName;

	@Value("${rabbitmq.routingkey}")
	private String routingKey;

	@Bean
	DirectExchange exchange() {
		return new DirectExchange(exchangeName);
	}

	@Bean
	Queue directQueue() {
		return new Queue(queueName, false);
	}

	@Bean
	MessageListenerContainer messageListenerContainer(ConnectionFactory connectionFactory,MessageListenerAdapter listenerAdapter) {
		SimpleMessageListenerContainer simpleMessageListenerContainer = new SimpleMessageListenerContainer();
		simpleMessageListenerContainer.setConnectionFactory(connectionFactory);
		simpleMessageListenerContainer.setQueueNames(queueName);
		simpleMessageListenerContainer.setMessageListener(listenerAdapter);
		return simpleMessageListenerContainer;

	}

	@Bean
	MessageListenerAdapter listenerAdapter(RabbitMQListner receiver) {
		return new MessageListenerAdapter(receiver, "receiveMessage");
	}
}

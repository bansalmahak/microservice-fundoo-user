package com.bridgeit.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisClientConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericToStringSerializer;

@Configuration
@EnableCaching
public class RedisConfiguration extends CachingConfigurerSupport {

	@Value("${spring.redis.host}")

	private String REDIS_HOSTNAME;

	@Value("${spring.redis.port}")

	private int REDIS_PORT;

	@Bean
	protected JedisConnectionFactory jedisConnectionFactory() {

        RedisStandaloneConfiguration configuration = new RedisStandaloneConfiguration(REDIS_HOSTNAME, REDIS_PORT);

        JedisClientConfiguration jedisClientConfiguration = JedisClientConfiguration.builder().usePooling().build();

        JedisConnectionFactory factory = new JedisConnectionFactory(configuration,jedisClientConfiguration);

        factory.afterPropertiesSet();

        return factory;

	}

	@Bean

	public RedisTemplate<String, Object> redisTemplate() {
		final RedisTemplate<String, Object> template = new RedisTemplate<String, Object>();
		template.setConnectionFactory(jedisConnectionFactory());
		template.setValueSerializer(new GenericToStringSerializer<Object>(Object.class));
		return template;

	}

}

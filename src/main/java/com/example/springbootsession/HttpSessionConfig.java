package com.example.springbootsession;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializer;


/**
 * Redisに格納するセッション情報をJson形式にシリアライズする
 * @author keigomagami
 *
 */
@Configuration
public class HttpSessionConfig {

	@Bean
	public RedisSerializer<Object> springSessionDefaultRedisSerializer(){
		return new GenericJackson2JsonRedisSerializer();
	}
}

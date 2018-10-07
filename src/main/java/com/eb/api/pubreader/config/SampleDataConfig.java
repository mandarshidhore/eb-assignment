package com.eb.api.pubreader.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import com.eb.api.pubreader.util.SampleDataReader;

@Configuration
public class SampleDataConfig {

	@Bean
	@Conditional(SampleDataCondition.class)
	public SampleDataReader dummyDB() {
		return new SampleDataReader();
	}

}

package com.eb.api.pubreader.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import com.eb.api.pubreader.dao.OtherBackend;
import com.eb.api.pubreader.dao.SampleDataReader;

@Configuration
public class AppConfig {
	@Bean
	@Conditional(SampleDataCondition.class)
	public SampleDataReader dummyDB() {
		return new SampleDataReader();
	}

	@Bean
	@Conditional(OtherBackendCondition.class)
	public OtherBackend otherDB() {
		return new OtherBackend();
	}
}

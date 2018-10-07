/*package com.eb.api.pubreader.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import com.eb.api.pubreader.dao.OtherBackend;

@Configuration
public class OtherBackendConfig {

	@Bean
	@Conditional(OtherBackendCondition.class)
	public OtherBackend otherDB() {
		return new OtherBackend();
	}

}
*/
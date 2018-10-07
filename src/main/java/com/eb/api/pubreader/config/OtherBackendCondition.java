package com.eb.api.pubreader.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class OtherBackendCondition implements Condition {

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		String dsType = System.getenv("dsType");
		return ("OtherBackend".equalsIgnoreCase(dsType));
	}

}

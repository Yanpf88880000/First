package com.abc.configuration;

import org.springframework.boot.autoconfigure.dao.PersistenceExceptionTranslationAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Order(Ordered.HIGHEST_PRECEDENCE)
@Configuration
@EnableTransactionManagement(proxyTargetClass = true)
@EnableJpaRepositories(basePackages = "com.abc.repository")
@EntityScan (basePackages = "com.abc.entity")
public class JpaConfiguration {
    @Bean
    PersistenceExceptionTranslationAutoConfiguration persistenceExceptionTranslationAutoConfiguration(){
        return new PersistenceExceptionTranslationAutoConfiguration();
    }
}


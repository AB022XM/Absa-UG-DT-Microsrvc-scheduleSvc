package ug.co.absa.microsrvc.schedule.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tech.jhipster.config.JHipsterConstants;

@Configuration
@EnableJpaRepositories({ "ug.co.absa.microsrvc.schedule.repository" })
@EnableJpaAuditing(auditorAwareRef = "springSecurityAuditorAware")
@EnableTransactionManagement
@EnableElasticsearchRepositories("ug.co.absa.microsrvc.schedule.repository.search")
public class DatabaseConfiguration {}

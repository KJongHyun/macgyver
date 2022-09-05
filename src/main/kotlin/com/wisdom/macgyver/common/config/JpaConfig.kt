package com.wisdom.macgyver.common.config

import com.zaxxer.hikari.HikariDataSource
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaAuditing
import javax.sql.DataSource

@EnableJpaAuditing
@Configuration
class JpaConfig {

    @Bean
    fun dataSource(
        @Value("\${data.username}") username: String,
        @Value("\${data.password}") password: String,
        @Value("\${data.url}") url: String
    ): DataSource {
        return HikariDataSource().apply {
            this.driverClassName = "com.mysql.cj.jdbc.Driver"
            this.username = username
            this.password = password
            this.jdbcUrl = url
        }
    }
}
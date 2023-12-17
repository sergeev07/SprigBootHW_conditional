package ru.netology.springboothw_conditional.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.springboothw_conditional.systemProfile.ProductionProfile;
import ru.netology.springboothw_conditional.systemProfile.SystemProfile;
import ru.netology.springboothw_conditional.systemProfile.DevProfile;


@Configuration
public class JavaConfig {
    @Bean()
    @ConditionalOnProperty(value = "netology.profile.dev", havingValue = "true")
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean()
    @ConditionalOnProperty(value = "netology.profile.dev", havingValue = "false", matchIfMissing = false)
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}

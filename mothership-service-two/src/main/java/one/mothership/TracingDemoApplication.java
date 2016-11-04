package one.mothership;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.sleuth.Sampler;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class TracingDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TracingDemoApplication.class, args);
    }

    @Bean
    public Sampler defaultSampler() {
        return new AlwaysSampler();
    }
}

package chat.candleloong.starter.knife4j.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "speed.charge.openapi")
public class OpenApiProperties {

    private String title;

    private String description;

}

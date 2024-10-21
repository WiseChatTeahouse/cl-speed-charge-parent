package chat.candleloong.starter.knife4j.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomUtils;
import org.springdoc.core.customizers.GlobalOpenApiCustomizer;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@AutoConfiguration
@EnableConfigurationProperties(OpenApiProperties.class)
//@ConditionalOnProperty(name = "speed.charge.openapi.enable", havingValue = "true")
public class OpenApiAutoConfig {

    @Resource
    private OpenApiProperties openApiProperties;

    @Bean
    public GlobalOpenApiCustomizer orderGlobalOpenApiCustomizer() {
        // TODO:暂时先这么配吧 后面再改
        return openApi -> {
            if (openApi.getTags() != null) {
                openApi.getTags().forEach(tag -> {
                    Map<String, Object> map = new HashMap<>();
                    map.put("x-order", RandomUtils.nextInt(0, 100));
                    tag.setExtensions(map);
                });
            }
            if (openApi.getPaths() != null) {
                openApi.addExtension("x-test123", "333");
                openApi.getPaths().addExtension("x-abb", RandomUtils.nextInt(0, 100));
            }

        };
    }

    @Bean
    public OpenAPI customOpenAPI() {
        // TODO:暂时先这么配吧 后面再改
        return new OpenAPI()
                .info(new Info().contact(new Contact().name("Siberia.Hu").email("wisechatteahouse@gmail.com"))
                        .title(openApiProperties.getTitle())
                        .version("1.0.0")
                        .description(openApiProperties.getDescription())
                        .termsOfService("http://www.wisechat.chat")
                        .license(new License().name("Apache 2.0")
                                .url("http://www.wisechat.chat")));
    }

}

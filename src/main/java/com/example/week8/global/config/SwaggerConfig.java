package com.example.week8.global.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.models.OpenAPI;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(
    info = @Info(
        title = "Spring Week8",
        description = """
                        https://github.com/2025-1-Alom-Spring/week8
                        """,
        version = "1.0v"
    ),
    servers = {
        @Server(url = "https://your-server-ip:8080", description = "메인 서버"),
        @Server(url = "http://localhost:8080", description = "로컬 서버")
    }
)
@Configuration
public class SwaggerConfig {

  @Bean
  public OpenAPI openAPI() {
    return new OpenAPI()
        .servers(List.of(
                new io.swagger.v3.oas.models.servers.Server()
                    .url("http://localhost:8080")
                    .description("로컬 서버"),
                new io.swagger.v3.oas.models.servers.Server()
                    .url("https://your-server-ip:8080")
                    .description("메인 서버")
            )
        );
  }
}

package test.inovasi.daya.solusi;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "Test Inovasi Daya Solusi",
                version = "1.0",
                description = "Test Inovasi Daya Solusi"
        )
)
public class TestInovasiDayaSolusiApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestInovasiDayaSolusiApplication.class, args);
    }

}

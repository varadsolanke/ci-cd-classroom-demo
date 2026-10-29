package demo;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
@GetMapping("/")
public Map<String, String> home() {
return Map.of("message", "Hello from CI/CD Classroom Demo");
}
@GetMapping("/health")
public Map<String, String> health() {
return Map.of("status", "UP");
}
}

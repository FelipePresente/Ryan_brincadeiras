package ryan_brincadeiras.api.Home;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@CrossOrigin(origins = "*")
public class HomeController {
    
    private final HomeService homeService;

    public HomeController() {
        this.homeService = new HomeService();
    }

    @GetMapping
    public String sayHello() {
        return this.homeService.sayHello();
    }

    @GetMapping("/{name}")
    public String sayMyName(@PathVariable String name) {
        return this.homeService.sayMyName(name);
    }
}

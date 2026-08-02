package ryan_brincadeiras.api.Home;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
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
}

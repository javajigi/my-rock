package rock.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("")
	public String home(String name, Model model) {
		model.addAttribute("name", name);
		return "index";
	}
}

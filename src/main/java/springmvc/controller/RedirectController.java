package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {

//	This is redirecting our view to contact page
	@RequestMapping("/one")
	public String one() {
		return "redirect:/contact";
	}

//	or you can use this too
	@RequestMapping("/two")
	public RedirectView two() {
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("contact");
		return redirectView;
	}

}

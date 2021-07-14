package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {

	@RequestMapping("/contact")
	public String getContactData() {
		return "contact";
	}

//	By default request mapping is get but we have a post in our form
//	we need to specify it here explicitly
	@RequestMapping(path = "/handleContact", method = RequestMethod.POST)
	public String handleForm(@RequestParam("email") String userEmail, @RequestParam("password") String userPassword,
			Model model) {

		model.addAttribute("useremail", userEmail);
		model.addAttribute("userpassword", userPassword);

		return "success";

	}
}

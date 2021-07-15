package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.model.User;

@Controller
public class ContactController {

	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header", "Hi i am here");
		m.addAttribute("dec", "Hi i am here too");
	}

	@RequestMapping("/contact")
	public String getContactData() {
		return "contact";
	}

//	By default request mapping is get but we have a post in our form
//	we need to specify it here explicitly
//by default requestparams are required
//	@RequestMapping(path = "/handleContact", method = RequestMethod.POST)
//	public String handleForm(@RequestParam("email") String userEmail, @RequestParam("password") String userPassword,
//			Model model) {
//
//		model.addAttribute("useremail", userEmail);
//		model.addAttribute("userpassword", userPassword);
//
//		return "success";
//
//	}

	@RequestMapping(path = "/handleContact", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {

		return "success";

	}

}

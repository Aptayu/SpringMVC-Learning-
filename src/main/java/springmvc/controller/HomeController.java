package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {

		System.out.println("Yes");

		model.addAttribute("name", "Ayush");
		List<String> string = new ArrayList<String>();

		return "index";
	}

	@RequestMapping("/about")
	public String about() {
		System.out.println("Yes");
		return "about";
	}

	@RequestMapping("/help")
	public ModelAndView help() {
//creating model and view objcet
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name", "hi");
		LocalDateTime timeNow = LocalDateTime.now();
		modelAndView.addObject("timeNow", timeNow);
		modelAndView.setViewName("help");

//		marks
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(45);
		list.add(50);

		modelAndView.addObject("marks", list);

		return modelAndView;
	}

}

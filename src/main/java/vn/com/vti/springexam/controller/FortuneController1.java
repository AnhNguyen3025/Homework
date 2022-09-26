package vn.com.vti.springexam.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FortuneController1 {
	
	@RequestMapping(value="/fortune1",produces="text/html; charset= utf-8")
	
	public String fortune(Model model) {
		
		Random random = new Random();
		int num = random.nextInt(3);
		String numStr ="";
		if (num ==0) {
			numStr = "Lucky";
		}
		if (num ==1) {
			numStr = "Normal";
		}if (num ==2) {
			numStr = "Bad";
		}
		model.addAttribute("rd",numStr);
		return "fortune";
	}
	
}

package springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test {
@RequestMapping("/yy")
	public String name() {
		System.out.println("hello world");
		return "success";
	}
}

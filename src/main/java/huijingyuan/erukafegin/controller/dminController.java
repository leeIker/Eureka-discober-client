package huijingyuan.erukafegin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import huijingyuan.erukafegin.Service.AdminController;


@RestController
public class dminController {

	@Autowired
	private AdminController as;
	@RequestMapping(value="hi",method=RequestMethod.GET)
	public String SayHi(@RequestParam(value="message") String message) {
		return as.sayHi(message);
	}
}

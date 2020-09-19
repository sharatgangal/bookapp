package com.dxc.book.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author sgangal2
 *
 */
@Controller

public class RootController {
	/**
	 * @return String (redirect to swagger-ui.html)
	 */
	@RequestMapping("/")
	public String swaggerUI() {
		return "redirect:/swagger-ui.html";
	}
}


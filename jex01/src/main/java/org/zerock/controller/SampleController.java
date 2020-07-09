package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/sample/*")
@Log4j
public class SampleController {

	// @InitBinder
	// public void initBinder(WebDataBinder binder) {
	// SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	// binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat,
	// false));
	// }

	@RequestMapping("")
	public void basic() {

		log.info("basic...................");

	}


}

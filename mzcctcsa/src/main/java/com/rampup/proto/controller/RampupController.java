package com.rampup.proto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rampup.proto.mapper.PostMapper;

@Controller
public class RampupController {

	@Autowired
	PostMapper postMapper;

	@RequestMapping(value = "/welcome")
	public String test() {
		return "/welcome";
	}

	@RequestMapping(value = "/readPost")
	public String readPost(Model model) {
		model.addAttribute("contents", postMapper.readPost(1L).getContents());

		return "/readPost";
	}

	@RequestMapping(value = "/list")
	public String list(Model model) {
		model.addAttribute("list", postMapper.list());

		return "/readPost";
	}
}

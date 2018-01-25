package com.amossefin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberController {

  @RequestMapping("/member")
  public String member(@RequestParam(value="name", required=false,
  defaultValue="you aren't currently logged in") String name, Model model) {
    model.addAttribute("name", name);
    return "member";
  }
}

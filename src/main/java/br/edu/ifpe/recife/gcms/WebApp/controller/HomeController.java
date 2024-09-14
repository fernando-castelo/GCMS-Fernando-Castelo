package br.edu.ifpe.recife.gcms.WebApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class
HomeController {

    @RequestMapping("/")
    public @ResponseBody String greeting() {
        return "Hello, World";
    }

    @RequestMapping("/Fernando")
    public @ResponseBody String greetingFernando() {
        return "Hello, Fernando!";
    }

    @RequestMapping("/Fulano")
    public @ResponseBody String greetingFulano() {
        return "Hello, Fulano!";
    }

    @RequestMapping("/hotfix/fernando")
    public @ResponseBody String greetingFernandoHotfix() {
        return "Hello, Fernando from hotfix branch";
    }

    @RequestMapping("/test/fernando")
    public @ResponseBody String greetingTest() {
        return "Hello, testing greeting";
    }

    @RequestMapping("/Undertaker")
    public @ResponseBody String greetingUndertaker() {
        return "Hello, John Cena!";
    }
}

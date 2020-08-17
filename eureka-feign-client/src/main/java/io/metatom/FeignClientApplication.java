package io.metatom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * FeignClientApplication
 *
 * @author igaozp
 * @since 2020/8/17
 */
@SpringBootApplication
@EnableFeignClients
@Controller
public class FeignClientApplication {
    @Resource
    private GreetingClient greetingClient;

    public static void main(String[] args) {
        SpringApplication.run(FeignClientApplication.class, args);
    }

    @RequestMapping("/get-greeting")
    public String greeting(Model model) {
        model.addAttribute("greeting", greetingClient.greeting());
        return "greeting-view";
    }
}

package io.metatom;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * GreetingController
 *
 * @author igaozp
 * @since  2020/8/17
 */
public interface GreetingController {
    /**
     * greeting
     *
     * @return greeting info
     */
    @RequestMapping("/greeting")
    String greeting();
}

package io.metatom;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @author igaozp
 * @since 2020/9/2
 */
@RestController
public class RandomController {
    @GetMapping("number")
    public Long randomNumber() throws InterruptedException {
        Random random = new Random(1);
        int randomTime = random.nextInt(10);
        Thread.sleep(randomTime * 1000);
        return System.nanoTime();
    }
}

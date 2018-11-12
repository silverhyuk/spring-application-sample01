package me.silverhyuk.springapplicationsample01.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        /**
         * foo => -Dfoo=eunhyuk (jvm 옵션은 argument가 아님)
         * bar => --var=silverhyuk (--옵션은 argument가 맞음)
         */
        System.out.println("SampleRunner foo : " + args.containsOption("foo"));
        System.out.println("SampleRunner bar : " + args.containsOption("bar"));
    }
}

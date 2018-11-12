package me.silverhyuk.springapplicationsample01.argument;

import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class SampleArgument {

    public SampleArgument(ApplicationArguments arguments) {
        /**
         * foo => -Dfoo=eunhyuk (jvm 옵션은 argument가 아님)
         * bar => --var=silverhyuk (--옵션은 argument가 맞음)
         */
        System.out.println("arguments foo : " + arguments.containsOption("foo"));
        System.out.println("arguments bar : " + arguments.containsOption("bar"));
    }
}

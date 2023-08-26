package org.example;

import org.springBoot.MySpringApplication;
import org.springBoot.MySpringBootApplication;
import org.springBoot.WebServerAutoConfiguration;
import org.springframework.context.annotation.Import;

@MySpringBootApplication
public class UserApp
{
    public static void main( String[] args )
    {
        MySpringApplication.run(UserApp.class);
    }
}

package org.example;

import org.springBoot.MySpringApplication;
import org.springBoot.MySpringBootApplication;

@MySpringBootApplication
public class UserApp
{
    public static void main( String[] args )
    {
        MySpringApplication.run(UserApp.class);
    }
}

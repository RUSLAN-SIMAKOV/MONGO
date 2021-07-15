package mflix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        String welcomeMessage =

                        "\n"
                        + "╔═══╗╔╗ ╔╗╔═══╗╔╗   ╔═══╗╔═╗ ╔╗     ╔═══╗╔══╗╔═╗╔═╗╔═══╗╔╗╔═╗╔═══╗╔╗  ╔╗" + "\n"
                        + "║╔═╗║║║ ║║║╔═╗║║║   ║╔═╗║║║╚╗║║     ║╔═╗║╚╣─╝║║╚╝║║║╔═╗║║║║╔╝║╔═╗║║╚╗╔╝║"+ "\n"
                        + "║╚═╝║║║ ║║║╚══╗║║   ║║ ║║║╔╗╚╝║     ║╚══╗ ║║ ║╔╗╔╗║║║ ║║║╚╝╝ ║║ ║║╚╗║║╔╝"+ "\n"
                        + "║╔╗╔╝║║ ║║╚══╗║║║ ╔╗║╚═╝║║║╚╗║║     ╚══╗║ ║║ ║║║║║║║╚═╝║║╔╗║ ║║ ║║ ║╚╝║ "+ "\n"
                        + "║║║╚╗║╚═╝║║╚═╝║║╚═╝║║╔═╗║║║ ║║║     ║╚═╝║╔╣─╗║║║║║║║╔═╗║║║║╚╗║╚═╝║ ╚╗╔╝ "+ "\n"
                        + "╚╝╚═╝╚═══╝╚═══╝╚═══╝╚╝─╚╝╚╝ ╚═╝     ╚═══╝╚══╝╚╝╚╝╚╝╚╝─╚╝╚╝╚═╝╚═══╝  ╚╝  "+ "\n";
        System.out.println(welcomeMessage);
    }
}

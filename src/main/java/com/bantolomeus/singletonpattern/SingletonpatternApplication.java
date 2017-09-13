package com.bantolomeus.singletonpattern;

import com.bantolomeus.singletonpattern.singleton.Singleton;
import com.bantolomeus.singletonpattern.singleton.StatusChanger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SingletonpatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(SingletonpatternApplication.class, args);

		StatusChanger statusChanger1 = new StatusChanger();
		StatusChanger statusChanger2 = new StatusChanger();

		statusChanger1.changeSingletonStatus("wow I set the status");

		statusChanger2.changeSingletonStatus("I override the status");

		statusChanger1.changeSingletonStatus("and again");

		System.out.println(Singleton.getInstance().status);
	}
}

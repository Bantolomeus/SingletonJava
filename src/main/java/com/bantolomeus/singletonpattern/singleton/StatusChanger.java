package com.bantolomeus.singletonpattern.singleton;

public class StatusChanger {

    public void changeSingletonStatus(String newStatus) {
        Singleton singleton = Singleton.getInstance();

        singleton.status = newStatus;
    }
}

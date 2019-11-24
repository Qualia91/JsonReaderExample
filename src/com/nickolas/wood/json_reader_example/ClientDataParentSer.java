package com.nickolas.wood.json_reader_example;

import java.io.Serializable;

public class ClientDataParentSer implements Serializable {


    private final String group;

    public ClientDataParentSer(String group) {
        this.group = group;
    }

    public String getGroup() {
        return group;
    }
}

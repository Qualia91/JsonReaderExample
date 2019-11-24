package com.nickolas.wood.json_reader_example;

import java.io.Serializable;
import java.util.ArrayList;

public class ClientSer implements Serializable {
    ArrayList<ClientDataSer> client;
    ArrayList<ClientDataSer> client2;

    public ClientSer(ArrayList<ClientDataSer> client, ArrayList<ClientDataSer> client2) {
        this.client = client;
        this.client2 = client2;
    }

    public ArrayList<ClientDataSer> getClient() {
        return client;
    }

    public void setClient(ArrayList<ClientDataSer> client) {
        this.client = client;
    }

    public ArrayList<ClientDataSer> getClient2() {
        return client2;
    }

    public void setClient2(ArrayList<ClientDataSer> client2) {
        this.client2 = client2;
    }
}

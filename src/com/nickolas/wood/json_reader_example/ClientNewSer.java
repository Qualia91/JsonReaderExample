package com.nickolas.wood.json_reader_example;

import java.io.Serializable;
import java.util.ArrayList;

public class ClientNewSer implements Serializable {
    ArrayList<ClientDataParentSer> client;
    ArrayList<ClientDataParentSer> client2;

    public ClientNewSer(ArrayList<ClientDataParentSer> client, ArrayList<ClientDataParentSer> client2) {
        this.client = client;
        this.client2 = client2;
    }

    public ArrayList<ClientDataParentSer> getClient() {
        return client;
    }

    public void setClient(ArrayList<ClientDataParentSer> client) {
        this.client = client;
    }

    public ArrayList<ClientDataParentSer> getClient2() {
        return client2;
    }

    public void setClient2(ArrayList<ClientDataParentSer> client2) {
        this.client2 = client2;
    }
}

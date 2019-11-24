package com.nickolas.wood.json_reader_example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        writeInitialJson();

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        try (Reader reader = new FileReader("test.json")) {

            // Convert JSON File to Java Object
            ClientSer clientSer = gson.fromJson(reader, ClientSer.class);

            ClientNewSer clientNewSer = new ClientNewSer(getNewClientData(clientSer.getClient()), getNewClientData(clientSer.getClient2()));

            try {
                Writer writer = new FileWriter("testNew.json");
                gson.toJson(clientNewSer, writer);
                writer.flush();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static ArrayList<ClientDataParentSer> getNewClientData(ArrayList<ClientDataSer> clientDataSerList) {

        ArrayList<ClientDataParentSer> clientDataSers = new ArrayList<>();

        int memberCounter = 0;
        for (ClientDataParentSer clientDataSer : clientDataSerList) {

            clientDataSers.add(clientDataSer);

            memberCounter += ((ClientDataSer)clientDataSer).getMember();
        }

        ClientDataNewSer clientDataNewSer = new ClientDataNewSer("all", memberCounter);

        clientDataSers.add(clientDataNewSer);

        return clientDataSers;

    }

    private static void writeInitialJson() {

        ClientDataSer clientDataSer1 = new ClientDataSer(12, "g1");
        ClientDataSer clientDataSer2 = new ClientDataSer(17, "g2");

        ArrayList<ClientDataSer> clientDataSers1 = new ArrayList<>();

        clientDataSers1.add(clientDataSer1);
        clientDataSers1.add(clientDataSer2);

        ClientDataSer clientDataSer3 = new ClientDataSer(14, "g11");
        ClientDataSer clientDataSer4 = new ClientDataSer(175, "g22");

        ArrayList<ClientDataSer> clientDataSers2 = new ArrayList<>();

        clientDataSers2.add(clientDataSer3);
        clientDataSers2.add(clientDataSer4);

	    ClientSer clientSer = new ClientSer(
                clientDataSers1,
                clientDataSers2
        );

        try {
            Writer writer = new FileWriter("test.json");
            Gson gson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();
            gson.toJson(clientSer, writer);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

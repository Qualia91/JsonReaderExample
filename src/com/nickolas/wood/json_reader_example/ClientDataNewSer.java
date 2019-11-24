package com.nickolas.wood.json_reader_example;

public class ClientDataNewSer extends ClientDataParentSer {

    int member;

    public ClientDataNewSer(String group, int member) {
        super(group);
        this.member = member;
    }

    public int getMember() {
        return member;
    }

    public void setMember(int member) {
        this.member = member;
    }
}

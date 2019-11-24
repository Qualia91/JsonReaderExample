package com.nickolas.wood.json_reader_example;

public class ClientDataSer extends ClientDataParentSer {
    int member;

    public ClientDataSer(int member, String group) {
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

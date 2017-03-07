package com.sdajava.CreatList;

public class Main {

    public static void main(String[] args) {

       ListImpl lista = new ListImpl();
        lista.addElement("test");
        lista.addElement("drugi test");
        lista.addElement("kolejny test");

        lista.showList();
        System.out.println("rozmiar listy " + lista.size());
    }
}

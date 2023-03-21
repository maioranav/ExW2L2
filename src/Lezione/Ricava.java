package Lezione;

import lombok.Data;

@Data
public class Ricava {

    //ESEMPIO DI UTILIZZO DI LOMBOK

    public static void main(String[] args) {
        Eserczio e = new Eserczio();
        e.setCiao(10);
        System.out.println(e.getCiao());
    }

}

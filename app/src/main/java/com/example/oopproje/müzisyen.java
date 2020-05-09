package com.example.oopproje;

public class müzisyen {

    String Müzisyen;
    String Enstrüman;
    int yas;

    public müzisyen(String müzisyen, String enstrüman, int yas) {
        Müzisyen = müzisyen;
        Enstrüman = enstrüman;
        this.yas = yas;
    }

    public String getMüzisyen() {
        return Müzisyen;
    }

    public void setMüzisyen(String müzisyen,String password) {

        if(password.matches( "fatih" )){
            Müzisyen = müzisyen;

        }

    }

    public String getEnstrüman() {
        return Enstrüman;
    }

    public void setEnstrüman(String enstrüman) {
        Enstrüman = enstrüman;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
}

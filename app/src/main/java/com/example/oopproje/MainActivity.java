package com.example.oopproje;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User myUser = new User("Fatih","Mühendis");


        /*User yeniKullanici   = new User();
        yeniKullanici.isim   = "Mehmed-i-Zeko";
        yeniKullanici.meslek = "Öğretmen";*/

        //Encapsulation
        müzisyen newmüzisyen =new müzisyen( "düğün şarkıcısı","gitar",50 );
        newmüzisyen.setMüzisyen( "ahmet","fatih" );
        System.out.println(newmüzisyen.getMüzisyen());

        //Inheritance
        SuperMüzisyen yenimüzisyen = new SuperMüzisyen( "ağala","davul",41);
        yenimüzisyen.setMüzisyen( "AHMET Kaya","fatih" );
        yenimüzisyen.sing();
        System.out.println(yenimüzisyen.sing());

        // Statik Polymorphism
        Matematiler matematik = new Matematiler();
        int toplam = matematik.toplama(5,8,9);
        System.out.println(toplam);

        //Dinamik Polymorphism
        Dog dog= new Dog();
        dog.test();
        dog.sing();

    }
}

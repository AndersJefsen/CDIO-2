package spil;

import our_fields.GUI_Custom;

import static org.junit.jupiter.api.Assertions.*;

class SpillerTest {

    @org.junit.jupiter.api.Test
    void spil() {
        int mindsbal=1000;
        GUI_Custom[] felter = Spil.istantiererFelter();
        Spiller spiller = new Spiller("testplayer",1000,0);
        for(int i = 0; i<1000;i++)
        {
            spiller.turn(felter);
            assertEquals(spiller.konto.getBalance()>=0, true);
            if (spiller.konto.getBalance()<mindsbal)
            {
                mindsbal = spiller.konto.getBalance();
            }
            if (spiller.konto.getBalance()>=3000)
            {
                spiller.konto.update(1000-(spiller.konto.getBalance()));
            }
        }
        System.out.println(mindsbal);



    }
}
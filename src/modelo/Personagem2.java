package modelo;

import engine.Personagem;

public class Personagem2 extends Personagem {

    private static int x, y;
    private static boolean v1, v2, v3, v4, v5, v6, v7, v8, v9;

    @Override
    public void moverAutomatico() {

        if (x == 0) {

            x = 156;

        }

        if (v1 == false) {

            y += 1;

            if (y == 100) {

                v1 = true;

            }

        }

        if (v2 == false && v1 == true) {

            x += 1;

            if (x == 445) {

                v2 = true;

            }

        }

        if (v3 == false && v2 == true) {

            y += 1;

            if (y == 352) {

                v3 = true;

            }

        }

        if (v4 == false && v3 == true) {

            x += 1;

            if (x == 579) {

                v4 = true;

            }

        }

        if (v5 == false && v4 == true) {

            y += 1;

            if (y == 560) {

                v5 = true;

            }

        }

        if (v6 == false && v5 == true) {

            x -= 1;

            if (x == 355) {

                v6 = true;

            }

        }

        if (v7 == false && v6 == true) {

            y -= 1;

            if (y == 480) {

                v7 = true;

            }

        }

        if (v8 == false && v7 == true) {

            x -= 1;

            if (x == 150) {

                v8 = true;

            }
        }

        if (v9 == false && v8 == true) {

            y -= 1;

            if (y == 100) {

                v1 = true;
                v2 = false;
                v3 = false;
                v4 = false;
                v5 = false;
                v6 = false;
                v7 = false;
                v8 = false;
                v9 = false;
                y = 100;
                x = 156;

            }

        }

        this.personagem.setLocation(x, y);

    }

}

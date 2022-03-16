package modelo;

import engine.Personagem;

public class Personagem3 extends Personagem {

    private static int x, y;
    private static boolean v0, v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18, v19,
            v20;

    @Override
    public void moverAutomatico() {

        if (x == 0 && v0 == false) {

            x = 150;

        }

        if (v1 == false) {

            y += 1;

            if (y == 475) {

                v1 = true;

            }

        }

        if (v2 == false && v1 == true) {

            x -= 1;

            if (x == 5) {

                v2 = true;
                v0 = true;

            }

        }

        if (v3 == false && v2 == true) {

            y += 1;

            if (y == 581) {

                v3 = true;

            }

        }

        if (v4 == false && v3 == true) {

            x += 1;

            if (x == 148) {

                v4 = true;

            }

        }

        if (v4 == true && v5 == false) {

            y -= 1;

            if (y == 481) {

                v5 = true;

            }
        }

        if (v6 == false && v5 == true) {

            x += 1;

            if (x == 352) {

                v6 = true;

            }

        }

        if (v7 == false && v6 == true) {

            y -= 2;

            if (y == 351) {

                v7 = true;

            }

        }

        if (v7 == true && v8 == false) {

            x += 1;

            if (x == 554) {

                v8 = true;

            }

        }

        if (v8 == true && v9 == false) {

            y -= 2;

            if (y == 175) {

                v9 = true;

            }

        }

        if (v10 == false && v9 == true) {

            x -= 1;

            if (x == 307) {

                v10 = true;

            }

        }

        if (v11 == false && v10 == true) {

            x += 1;
            y -= 1;

            if (y == 56) {

                v11 = true;

            }

        }

        if (v12 == false && v11 == true) {

            y -= 1;

            if (y == 3) {

                v12 = true;

            }

        }

        if (v13 == false && v12 == true) {

            x += 1;

            if (x == 575) {

                v13 = true;

            }

        }

        if (v14 == false && v13 == true) {

            x -= 3;

            if (x == 350) {

                v14 = true;

            }

        }

        if (v15 == false && v14 == true) {

            y += 1;

            if (y == 100) {

                v15 = true;

            }

        }

        if (v16 == false && v15 == true) {

            x -= 1;

            if (x == 150) {

                v16 = true;

            }

        }

        if (v16 == true && v17 == false) {

            y -= 1;

            if (y == 10) {

                v17 = true;

            }

        }

        if (v18 == false && v17 == true) {

            x -= 2;

            if (x == 6) {

                v18 = true;

            }

        }

        if (v19 == false && v18 == true) {

            y += 1;

            if (y == 80) {

                v19 = true;

            }

        }

        if (v20 == false && v19 == true) {

            x += 1;

            if (x == 150) {

                v20 = true;
                y = 100;

            }

        }

        if (v20 == true) {

            v1 = false;
            v2 = false;
            v3 = false;
            v4 = false;
            v5 = false;
            v6 = false;
            v7 = false;
            v8 = false;
            v9 = false;
            v10 = false;
            v11 = false;
            v12 = false;
            v13 = false;
            v14 = false;
            v15 = false;
            v16 = false;
            v17 = false;
            v18 = false;
            v19 = false;
            v20 = false;

        }

        this.personagem.setLocation(x, y);

    }

}

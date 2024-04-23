package com.example.atividadep2;

interface Animal {
    String mover(int passos);
}

interface Terrestre extends Animal {
    String andar(int passos);
}

interface Aquatico extends Animal {
    String nadar(int metros);
}

abstract class AnimalTerrestre implements Terrestre {
    @Override
    public String mover(int passos) {
        return null;
    }
}

class Homem extends AnimalTerrestre {
    @Override
    public String andar(int passos) {
        return "Homem andou " + passos + " passos.";
    }

    @Override
    public String mover(int passos) {
        return andar(passos);
    }
}

class Galinha extends AnimalTerrestre {
    @Override
    public String andar(int passos) {
        return "Galinha ciscou " + passos + " vezes.";
    }

    @Override
    public String mover(int passos) {
        return andar(passos);
    }
}

class Cavalo extends AnimalTerrestre {
    @Override
    public String andar(int passos) {
        return "Cavalo galopou " + passos + " passos.";
    }

    @Override
    public String mover(int passos) {
        return andar(passos);
    }
}

class Peixe implements Aquatico {
    @Override
    public String nadar(int metros) {
        return "Peixe nadou " + metros + " metros.";
    }

    @Override
    public String mover(int passos) {
        return "Peixe não pode se mover da mesma forma que animais terrestres.";
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        AnimalTerrestre homem = new Homem();
        AnimalTerrestre galinha = new Galinha();
        AnimalTerrestre cavalo = new Cavalo();
        Aquatico peixe = new Peixe();

        System.out.println(homem.andar(3));
        System.out.println(galinha.andar(5));
        System.out.println(cavalo.andar(4));
        System.out.println(peixe.nadar(6));
        System.out.println(peixe.mover(2));
    }
}

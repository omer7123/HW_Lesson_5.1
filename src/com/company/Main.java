package com.company;

public class Main {

    public static Hero Geralt = new Hero(50, 500, 10);
    public static Boss boss = new Boss(50, 500, 20);

    public static void main(String[] args) {
        FightInfo();
        while (!Finished()) {
            heroesHit();
            bossHit();
            FightInfo();
        }


    }

    public static void heroesHit() {
        if (Geralt.getDamageHero() > 0) {
            if (boss.getBossHealth() - Geralt.getDamageHero() < 0) {
                boss.setBossHealth(0);
            } else {
                boss.setBossHealth(boss.getBossHealth() - Geralt.getDamageHero() - Geralt.getAttackTypeHero());

            }
        }
    }

    public static void bossHit() {
        if (boss.getBossHealth() > 0) {
            if (Geralt.getHealthHero() - boss.getBossDamage() < 0) {
                Geralt.setHealthHero(0);
            } else {
                Geralt.setHealthHero(Geralt.getHealthHero() - boss.getBossDamage());
                Geralt.setHealthHero(Geralt.getHealthHero() + Geralt.getAttackTypeHero());
                System.out.println("Geralt отразил урон: " + Geralt.getAttackTypeHero() +" и перенаправил на босса");
            }
        }
    }

    public static boolean Finished() {
        if (boss.getBossHealth() <= 0) {
            System.out.println("Heroes Win");

            return true;
        } else if (Geralt.getHealthHero() <= 0) {
            System.out.println("Boss Win");
            return true;
        } else {
            return false;
        }

    }

    public static void FightInfo() {
        System.out.println("_".repeat(20));
        System.out.println("Здоровье героя: " + Geralt.getHealthHero());
        System.out.println("Здоровье босса: " + boss.getBossHealth());
        System.out.println("_".repeat(20));


    }
}
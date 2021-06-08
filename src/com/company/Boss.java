package com.company;

public class Boss {
    private int bossDamage;
    private int bossHealth;
    private int bossDefence;

    public Boss(int bossDamage, int bossHealth, int bossDefence) {
        this.bossDamage = bossDamage;
        this.bossHealth = bossHealth;
        this.bossDefence = bossDefence;
    }

    public int getBossDamage() {
        return bossDamage;
    }

    public void setBossDamage(int bossDamage) {
        if (bossDamage <= 0) {
            System.out.println("У босса не можеть быть урон ноль или меньше");
        } else {
            this.bossDamage = bossDamage;
        }

    }

    public int getBossHealth() {
        return bossHealth;
    }

    public void setBossHealth(int bossHealth) {
      /*  if (bossHealth < 0) {
            System.out.println("Босс не может сражаться без здоровья");
        } else {*/
            this.bossHealth = bossHealth;
        //}

    }

    public int getBossDefence() {
        return bossDefence;
    }

    public void setBossDefence(int bossDefence) {
        this.bossDefence = bossDefence;
    }
}

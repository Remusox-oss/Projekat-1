import java.util.*;

public class Game {

    public static void decraseHealth(Player p, Enemy e){
        int newHealth = p.getHealth() - e.getDmg();
        p.setHealth(newHealth);
        System.out.println("Zdravlje igraca nakon udarca: " + p.getHealth());
    }

    public static void checkCollision(Player p, Enemy e){
        if (p.getPosX() <= e.getPosX() + e.getWidth() &&
            p.getPosX() + p.getWidth() >= e.getPosX() &&
            p.getPosY() <= e.getPosY() + e.getHeight() &&
            p.getHeight() + p.getPosY() >= e.getPosY()) {
            System.out.println("Neprijatelj je udario igraca!");
            decraseHealth(p, e);
            System.out.printf("%s udarilo igraca %s%n", e.getEnemyType(), p.getName());
        } else {
            System.out.println("Neprijatelj nije udario igraca.");
        }
    }

    public static Enemy addEnemy(){
        Random rand = new Random();
        Enemy enemy = new Enemy("Zmaj", rand.nextInt(60), rand.nextInt(60), 50, 50, 10);
        return enemy;
    }


    public static void toString(Enemy e, Player p){
        System.out.println("Igrac: " + p.getName() + " | Pozicija: (" + p.getPosX() + ", " + p.getPosY() + ") | Velicina: (" + p.getWidth() + ", " + p.getHeight() + ") | Zdravlje: " + p.getHealth());
        System.out.println("Neprijatelj: " + e.getEnemyType() + " | Pozicija: (" + e.getPosX() + ", " + e.getPosY() + ") | Velicina: (" + e.getWidth() + ", " + e.getHeight() + ") | Steta: " + e.getDmg());
    }
    public static void main(String[] args){
        Player player = new Player( "marko 2008", 10, 20, 50, 50, 100);
        Enemy enemy = new Enemy("goblin", 30, 40, 50, 50, 20);
        toString(enemy, player);
        checkCollision(player, enemy);
        Enemy enemy2 = addEnemy();
        toString(enemy2, player);

    }

}

public class Enemy {
    private String EnemyType;
    private int posX;
    private int posY;
    private int width;
    private int height;
    private int dmg;
    
    public Enemy(String EnemyType, int posX, int posY, int width, int height, int dmg) {
        this.EnemyType = EnemyType;
        this.posX = posX;
        this.posY = posY;
        this.width = width;
        this.height = height;
        this.dmg = dmg;
    }

    public String getEnemyType() {
        if (EnemyType.isEmpty()){
            String notFound = "ne postoji neprijatelj";
            return notFound;
        }

        return EnemyType.toLowerCase();
    }
    public void setEnemyType(String enemyType) {
        EnemyType = enemyType;
    }
    public int getPosX() {
        return posX;
    }
    public void setPosX(int posX) {
        this.posX = posX;
    }
    public int getPosY() {
        return posY;
    }
    public void setPosY(int posY) {
        this.posY = posY;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getDmg() {
        if (dmg <=0 ){
            dmg = 0;
        }
        if(dmg > 100){
            dmg = 100;
        }
        return dmg;
    }
    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    
}

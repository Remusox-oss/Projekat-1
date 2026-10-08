public class Player {
    private String Name;
    private int posX;
    private int posY;
    private int width;
    private int height;
    private  int health;

    public Player(String Name, int posX, int posY, int width, int height, int health) {
        this.Name = Name;
        this.posX = posX;
        this.posY = posY;
        this.width = width;
        this.height = height;
        this.health = health;
    }

    public String getName() {
        if (Name.isEmpty()){
            String notFound = "ne postoji igraca";
            return notFound;
        }
        if(Name.length() > 16){
            Name = Name.substring(0, 16);
        }
        boolean hasSpace = Name.contains(" ");
        if(hasSpace){
            Name = Name.replace(" ", "");
            
        }

        return Name;
    }
    public void setName(String name) {
        Name = name;
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
    public int getHealth() {
        if (health <=0 ){
            health = 0;
        }
        if(health > 100){
            health = 100;
        }
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    

}

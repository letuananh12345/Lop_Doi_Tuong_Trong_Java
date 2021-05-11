public class Fan {
    private static final int slow = 1;
    private static final int medium = 2;
    private static final int fast = 3;
    private int speed=slow;
    private int radius=5;
    private String color="blue";
    private boolean status=false;
    public Fan(){}
    public Fan(int speed,boolean status,String color,int radius){
        this.speed=speed;
        this.status=status;
        this.color=color;
        this.radius=radius;
    }
    public  int setSpeed(int speed){
        return this.speed=speed;
    }
    public  int setRadius(int radius){
        return this.radius=radius;
    }
    public  void setStatus(boolean on){
        this.status=on;
    }
    public  void setColor(String color){
        this.color=color;
    }
    public int getSpeed(){
        return this.speed;
    }
    public int getRadius(){
        return this.radius;
    }

}

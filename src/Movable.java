
public interface Movable extends car {

public void move() {

        /*double radians = Math.toRadians(this.getRotate() - 90);
        
        this.setTranslateX(this.getTranslateX() + Math.cos(radians) * );
        this.setTranslateY(this.getTranslateY() + Math.sin(radians) * 6.9);
        			
        if(this.getTranslateY() <= -100){
            this.setTranslateY(1000);
        }

        else if(this.getTranslateY() >= 1000){
            this.setTranslateY(-100);
        }

        else if(this.getTranslateX() <= -100){
            this.setTranslateX(1920);
        }

        else if(this.getTranslateX() >= 1920){
            this.setTranslateX(-100);
        }*/


    }

    public void turnLeft() {
        //this.setRotate(this.getRotate() - 20);
    }

    public void turnRight() {
        //this.setRotate(this.getRotate() + 20);
    }
    
}
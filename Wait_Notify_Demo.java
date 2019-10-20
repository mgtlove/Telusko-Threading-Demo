import java.util.*;

class Car{
    static int carNumber = 0;
    boolean hasPassed = false;
    boolean westBound = false;
    Car(){
        carNumber = this.carNumber;
        carNumber++;
        if(carNumber%2 == 0) westBound = true;
    }
    void setHasPassed(){
        hasPassed = true;
    }
}

class OneWayBridge{
    boolean isOpen;
    boolean westBound = false;
    int carLimit = 5;
}

class Traffic implements Runnable{
    Car[] traffic;
    OneWayBridge bridge = new OneWayBridge();
    
    Traffic(int numberCars){
        for(int i = 0; i<numberCars; i++){
            traffic[i] = new Car();
        }
    }
    @Override
    public void run(){
        while(bridge.isOpen && (bridge.westBound == false)){

        }
        while()

    }
}

class Wait_Notify_Demo{
    public static void main(String[] args) {

        Traffic program = new Traffic(15);

        Thread tunellProgram = new Thread(program);
        
    }
}
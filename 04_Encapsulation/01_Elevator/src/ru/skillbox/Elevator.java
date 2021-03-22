
package ru.skillbox;
import java.util.Scanner;

public class Elevator {
    private int currentFloor = 1;
    private int maxFloor;
    private int minFloor;

    public Elevator(int minFloor, int maxFloor){
        this.maxFloor = maxFloor;
        this.minFloor = minFloor;
    }
    public int getCurrentFloor(){
        return currentFloor;
    }
    public void moveDown(){
        currentFloor = currentFloor > minFloor ? currentFloor - 1 : currentFloor;
    }
    public void moveUp(){
        currentFloor = currentFloor < maxFloor ? currentFloor + 1 : currentFloor;
    }
    public void move(int floor){
        if (floor > maxFloor){
            System.out.println("Ошибка! Попробуйте снова.");
            return;
        }
        if (currentFloor == floor){
            return;
        }
        if (floor < minFloor){
            System.out.println("Ошибка! Попробуйте снова.");
            return;
        }
        //if (currentFloor > floor){
        //    while (currentFloor != floor){
        //        moveDown();
        //        System.out.println("Этаж номер " +getCurrentFloor());
        //    }
        //}
        //if (currentFloor < floor){
         //   while (currentFloor != floor){
         //       moveUp();
         //       System.out.println("Этаж номер " +getCurrentFloor());
          //  }
        while (currentFloor!= floor){
            if(currentFloor > floor){
                moveDown();
                System.out.println("Этаж номер " +getCurrentFloor());
            }
            if (currentFloor < floor){
                moveUp();
                System.out.println("Этаж номер " +getCurrentFloor());
            }
        }

    }


}

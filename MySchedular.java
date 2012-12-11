/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package schedular;

import java.util.Timer;

/**
 *
 * @author sumit sharma
 */
public class MySchedular {

    public MySchedular() {
    }
 public static void main(String[] args){
     Timer timer=new Timer();
     MyTask myTask=new MyTask(timer);
     int firstSart=1000;// it means after 1 second.
     int period=1000*2;//after which the task repeat;
     timer.schedule(myTask,firstSart,period);//the time specified in millisecond.
     
 }
}

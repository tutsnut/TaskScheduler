/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package schedular;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author sumit sharma
 */
public class MyTask extends TimerTask{
    Timer timer;
    int count=0;
    public MyTask(){
        
    }
    public MyTask(Timer timer){
        this.timer=timer;
    }
    public void toDo(){
        System.out.println("count-> "+(count++));
        
    }

    @Override
    public void run() {
        toDo();
        
        System.out.println("count called ");
        if(count>10){//this is the condition when you want to stop the task.
            timer.cancel();
        }
    }
}

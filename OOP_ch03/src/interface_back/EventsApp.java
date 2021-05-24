/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface_back;

public class EventsApp {
 
    public static void main(String[] args) {
         
        Button button = new Button(new ButtonClickHandler());
        button.click();
        button.click();
        button.click();
    }
}
 
class ButtonClickHandler implements EventHandler{
     
    public void execute(){
         
        System.out.println("Кнопка нажата!");
    }
}
 
interface EventHandler{
     
    void execute();
}
 
class Button{
     
    EventHandler handler;
    Button(EventHandler action){
         
        this.handler=action;
    }
    public void click(){
         
        handler.execute();
    }
}
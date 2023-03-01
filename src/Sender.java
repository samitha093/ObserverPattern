import java.util.ArrayList;
import java.util.List;

public class Sender implements Subject{
    private List<Observer> observerList = null;
    public Sender(){
        observerList = new ArrayList<Observer>();
    }


    @Override
    public void add(Observer Client) {
        observerList.add(Client);
    }

    @Override
    public void remove(Observer Client) {
        observerList.remove(Client);
    }

    @Override
    public void notifyobserver(String msg) {
        for(Observer ob : observerList){
            ob.update(msg);
        }
    }
}

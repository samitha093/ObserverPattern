public class Reciver implements Observer{
    private String name;
    public Reciver(String name){
        this.name = name;
    }
    @Override
    public void update(String msg) {
        System.out.println(name+" : "+msg);
    }
}

public class Main {
    public static void main(String[] args) {
        Sender bank = new Sender();
        Reciver kamal = new Reciver("kamal");
        Reciver nimal = new Reciver("nimal");
        Reciver saman = new Reciver("saman");
        bank.add(kamal);
        bank.add(nimal);
        bank.add(saman);
        bank.notifyobserver("new message");
        bank.remove(nimal);
        bank.notifyobserver("second msg");

    }
}

public interface Subject {

    void add(Observer Client);

    public void remove(Observer Client);

    public void notifyobserver(String msg);
}

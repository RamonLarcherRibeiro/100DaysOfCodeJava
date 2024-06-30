package notifications;

public class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("usuario notificado por email");
    }
}

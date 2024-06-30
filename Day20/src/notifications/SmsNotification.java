package notifications;

public class SmsNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("usuario notificado por sms");
    }
    
}

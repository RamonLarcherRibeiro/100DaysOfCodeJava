import notifications.NotificationFactory;
import notifications.Notification;
public class App {
    public static void main(String[] args) throws Exception {
        NotificationFactory notificationFactory = new NotificationFactory();

        // Obter um objeto EmailNotification e chamar seu método notifyUser
        Notification notification1 = notificationFactory.createNotification("EMAIL");
        notification1.notifyUser();

        // Obter um objeto SMSNotification e chamar seu método notifyUser
        Notification notification2 = notificationFactory.createNotification("SMS");
        notification2.notifyUser();
    }
}

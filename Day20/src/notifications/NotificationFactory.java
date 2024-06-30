package notifications;

public class NotificationFactory{
    //usa um metodo para criar objetos com base na entrada
    public Notification createNotification(String channel){
        if(channel == null || channel.isEmpty()){
            return null;
        }else{
            switch (channel.toUpperCase()) {
                case "EMAIL":
                    return new EmailNotification();
                case "SMS":
                    return new SmsNotification();
                default:
                    throw new IllegalArgumentException("canal indefinido" + channel);
            }
        }
    }
}

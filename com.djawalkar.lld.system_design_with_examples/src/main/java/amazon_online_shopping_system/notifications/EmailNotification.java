package amazon_online_shopping_system.notifications;

import amazon_online_shopping_system.users.Account;

import java.util.Date;

public class EmailNotification extends Notification {
    public EmailNotification(int id, Date createdOn, String content){
        this.notificationId = id;
        this.createdOn = createdOn;
        this.content = content;
    }
    public boolean sendNotification(Account account) {
        // functionality
        return false;
    }
}

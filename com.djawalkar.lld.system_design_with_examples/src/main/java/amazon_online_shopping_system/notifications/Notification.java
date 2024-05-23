package amazon_online_shopping_system.notifications;

import amazon_online_shopping_system.users.Account;

import java.util.Date;

// Notification is an abstract class
public abstract class Notification {
    protected int notificationId;
    protected Date createdOn;
    protected String content;

    public abstract boolean sendNotification(Account account);
}

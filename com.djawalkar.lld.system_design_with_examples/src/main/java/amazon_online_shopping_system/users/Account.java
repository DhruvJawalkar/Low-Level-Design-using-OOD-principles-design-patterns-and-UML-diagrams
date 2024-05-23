package amazon_online_shopping_system.users;


import amazon_online_shopping_system.Address;
import amazon_online_shopping_system.enums.AccountStatus;
import amazon_online_shopping_system.notifications.Notification;
import amazon_online_shopping_system.payments.CreditCard;
import amazon_online_shopping_system.payments.ElectronicBankTransfer;
import amazon_online_shopping_system.products.Product;
import amazon_online_shopping_system.products.ProductReview;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private String userName;
    private String password;
    private String name;
    private List<Address> shippingAddress;
    private AccountStatus status;
    private String email;
    private String phone;
    private List<CreditCard> creditCards;
    private List<ElectronicBankTransfer> bankAccounts;

    public Account(String name, String email, String phone, String userName, String password){
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.userName = userName;
        this.password = password;
        this.status = AccountStatus.ACTIVE;

        this.shippingAddress = new ArrayList<>();
        this.creditCards = new ArrayList<>();
        this.bankAccounts = new ArrayList<>();
    }

    public Address getShippingAddress() {
        return shippingAddress.get(0);
    }

    public boolean addProduct(Product product) {
        return false;
    }

    public boolean addProductReview(ProductReview review, Product product) {
        return false;
    }

    public boolean deleteProduct(Product product) {
        return false;
    }

    public boolean deleteProductReview(ProductReview review, Product product) {
        return false;
    }

    public boolean resetPassword() {
        return true;
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setShippingAddress(List<Address> shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public void addShippingAddress(Address address) {
        this.shippingAddress.add(address);
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<CreditCard> getCreditCards() {
        return creditCards;
    }

    public void addCreditCard(CreditCard creditCard) {
        this.creditCards.add(creditCard);
    }

    public List<ElectronicBankTransfer> getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(List<ElectronicBankTransfer> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    public void notifyUserOnOrderUpdate(Notification notification){
        //notify
    }
}

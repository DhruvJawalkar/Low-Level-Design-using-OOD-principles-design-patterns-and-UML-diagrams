package amazon_online_shopping_system.users;

import amazon_online_shopping_system.enums.AccountStatus;
import amazon_online_shopping_system.products.ProductCategory;

public class Admin {
    private Account account;

    public Admin(Account account){
        this.account = account;
    }
    public boolean blockUser(Account account) {
        account.setStatus(AccountStatus.BLOCKED);
        return true;
    }

    public boolean addNewProductCategory(ProductCategory category) {
        return false;
    }

    public boolean modifyProductCategory(ProductCategory category) {
        return false;
    }

    public boolean deleteProductCategory(ProductCategory category) {
        return false;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}

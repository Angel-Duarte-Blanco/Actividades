
package Form_Pkg;

/**
 *
 * @author 
 */
public class rDataClass {
    
    private String customer_name;
    private String customer_lastname;
    private String customer_email;
    private String customer_adress;
    private int customer_count_num;
    private int monthly_money;
    private char credit_card;

    public rDataClass(String customer_name, String customer_lastname, String customer_email, String customer_adress, int customer_count_num, int monthly_money, char credit_card) {
        this.customer_name = customer_name;
        this.customer_lastname = customer_lastname;
        this.customer_email = customer_email;
        this.customer_adress = customer_adress;
        this.customer_count_num = customer_count_num;
        this.monthly_money = monthly_money;
        this.credit_card = credit_card;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_lastname() {
        return customer_lastname;
    }

    public void setCustomer_lastname(String customer_lastname) {
        this.customer_lastname = customer_lastname;
    }

    public String getCustomer_email() {
        return customer_email;
    }

    public void setCustomer_email(String customer_email) {
        this.customer_email = customer_email;
    }

    public String getCustomer_adress() {
        return customer_adress;
    }

    public void setCustomer_adress(String customer_adress) {
        this.customer_adress = customer_adress;
    }

    public int getCustomer_count_num() {
        return customer_count_num;
    }

    public void setCustomer_count_num(int customer_count_num) {
        this.customer_count_num = customer_count_num;
    }

    public int getMonthly_money() {
        return monthly_money;
    }

    public void setMonthly_money(int monthly_money) {
        this.monthly_money = monthly_money;
    }

    public char getCredit_card() {
        return credit_card;
    }

    public void setCredit_card(char credit_card) {
        this.credit_card = credit_card;
    }

   
}

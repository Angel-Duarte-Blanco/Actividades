
package Form_Pkg;

/**
 *
 * @author 
 */
public class ProductsClass {
    private String product_name;
    private String product_line;
    private String product_section;
    private String product_lenght;
    private int product_price;
    private int product_quantity;
    private int product_code;

    public ProductsClass(String product_name, String product_line, String product_section, String product_lenght, int product_price, int product_quantity, int product_code) {
        this.product_name = product_name;
        this.product_line = product_line;
        this.product_section = product_section;
        this.product_lenght = product_lenght;
        this.product_price = product_price;
        this.product_quantity = product_quantity;
        this.product_code = product_code;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_line() {
        return product_line;
    }

    public void setProduct_line(String product_line) {
        this.product_line = product_line;
    }

    public String getProduct_section() {
        return product_section;
    }

    public void setProduct_section(String product_section) {
        this.product_section = product_section;
    }

    public String getProduct_lenght() {
        return product_lenght;
    }

    public void setProduct_lenght(String product_lenght) {
        this.product_lenght = product_lenght;
    }

    public int getProduct_price() {
        return product_price;
    }

    public void setProduct_price(int product_price) {
        this.product_price = product_price;
    }

    public int getProduct_quantity() {
        return product_quantity;
    }

    public void setProduct_quantity(int product_quantity) {
        this.product_quantity = product_quantity;
    }

    public int getProduct_code() {
        return product_code;
    }

    public void setProduct_code(int product_code) {
        this.product_code = product_code;
    }

  
}

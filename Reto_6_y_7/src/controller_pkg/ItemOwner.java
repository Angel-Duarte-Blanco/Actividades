
package controller_pkg;


public class ItemOwner {
    private int idOwner;
    private String owner;

    public ItemOwner(int idOwner, String owner) {
        this.idOwner = idOwner;
        this.owner = owner;
    }

    public int getIdOwner() {
        return idOwner;
    }

    public void setIdOwner(int idOwner) {
        this.idOwner = idOwner;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString(){
        return getOwner();
    }
}

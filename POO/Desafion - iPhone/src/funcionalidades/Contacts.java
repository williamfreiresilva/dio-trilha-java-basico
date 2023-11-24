package funcionalidades;

public interface Contacts {
    String name = ""; 
    String houseNumber = "000000000000";
    String workNumber = "000000000000";
    String email = "";
    String[] favorites = new String[0];

    private void callContact(){};
    private void addContact(){};
    private void deleteContact(){};
    private void updateContact(){};
    private void addFavorite(){};
}

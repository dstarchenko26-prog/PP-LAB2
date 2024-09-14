public class Customer {
    private int id, balance;
    private String surname, firstName, patronymic;
    private long bankID;

    /**
     * class constructor
     * @param i id customer
     * @param sn surname customer
     * @param fn first name customer
     * @param pn patronymic customer
     * @param bd bankID customer
     * @param b balance customer
     */
    Customer (int i, String sn, String fn, String pn, long bd, int b) {
        id = i;
        surname = sn;
        firstName = fn;
        patronymic = pn;
        bankID = bd;
        balance = b;
    }

    /**
     * sets the value
     * @param i id
     */
    public void setValueId(int i) {
        id = i;
    }

    /**
     * sets the value
     * @param sn surname
     */
    public void setValueSurname(String sn) {
        surname = sn;
    }

    /**
     * sets the value
     * @param fn first name
     */
    public void setValueFirstName(String fn) {
        firstName = fn;
    }

    /**
     * sets the value
     * @param pn patronymic
     */
    public void setValuePatronymic(String pn) {
        patronymic = pn;
    }

    /**
     * sets the value
     * @param bd bankID
     */
    public void setValueBankID(long bd) {
        bankID = bd;
    }

    /**
     * sets the value
     * @param b balance
     */
    public void setValueBalance(int b) {
        balance = b;
    }

    /**
     * @return id
     */
    public int getValueId() {
        return id;
    }

    /**
     * @return surname
     */
    public String getValueSurname() {
        return surname;
    }

    /**
     * @return first name
     */
    public String getValueFirstName() {
        return firstName;
    }

    /**
     * @return patronymic
     */
    public String getValuePatronymic() {
        return patronymic;
    }

    /**
     * @return bankID
     */
    public long getValueBankID() {
        return bankID;
    }

    /**
     * @return balance
     */
    public int getValueBalance() {
            return balance;
    }

    /**
     * information about the customer in the form of a string
     * @return String
     */
    public String toString() {
        return String.join(" ", "Покупець:", String.valueOf(id), surname, firstName, patronymic, "Рахунок:", String.valueOf(bankID), String.valueOf(balance), "\n");
    }
}
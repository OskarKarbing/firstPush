public class Account {
    String user;
    int balance;



    public Account(String user, int balance) {
        this.user = user;
        this.balance = balance;
    }
        public int getBalance() {
            return balance;
        }

        public void setBalance(int balance) {
            this.balance = balance;
        }

}

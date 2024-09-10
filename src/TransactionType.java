public enum TransactionType {
    BALANCEINQUIRY(1),
    DEPOSITCASH(2),
    DEPOSITCHECK(3),
    WITHDRAW(4),
    TRANSFER(5);

    private final int value;

    TransactionType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

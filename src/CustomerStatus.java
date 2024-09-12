public enum CustomerStatus {
     ACTIVE(1),
    BLOCKED(2),
    BANNED(3),
    COMPROMISED(4),
    ARCHIVED(5),
    CLOSED(6),
    UNKNOWN(7);

     private final int value;

     CustomerStatus(int value) {
         this.value = value;
     }

     public int getValue() {
         return value;
     }
}

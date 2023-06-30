package Day3.Bai6;

import java.util.Date;

// Lớp Transaction đại diện cho giao dịch
class Transaction {
    private String transactionId;
    private Date timestamp;
    private String description;

    public Transaction(String transactionId, Date timestamp, String description) {
        this.transactionId = transactionId;
        this.timestamp = timestamp;
        this.description = description;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getDescription() {
        return description;
    }
}

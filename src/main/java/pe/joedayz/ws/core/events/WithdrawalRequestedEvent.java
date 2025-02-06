package pe.joedayz.ws.core.events;

import java.math.BigDecimal;

/**
 * @author josediaz
 **/
public class WithdrawalRequestedEvent {


  private String senderId;
  private String recipientId;
  private BigDecimal amount;

  public WithdrawalRequestedEvent() {
  }

  public WithdrawalRequestedEvent(String senderId, String recipientId, BigDecimal amount) {
    this.senderId = senderId;
    this.recipientId = recipientId;
    this.amount = amount;
  }

  public String getSenderId() {
    return senderId;
  }

  public void setSenderId(String senderId) {
    this.senderId = senderId;
  }

  public String getRecipientId() {
    return recipientId;
  }

  public void setRecipientId(String recipientId) {
    this.recipientId = recipientId;
  }

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }
}

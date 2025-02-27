package entity;
public class Card {
    private Owner owner;
    private String numberId;
    private Integer nominal;
    private String pin;
    private Type type;
    private Status status = Status.ACTIVE;
    public enum Type{DEBIT,CREDIT,DEPOSIT};
    public enum Status{ACTIVE, INACTIVE};

    public Owner getOwner() {
        return owner;
    }
    public String getNumberId() {
        return numberId;
    }
    public Integer getNominal() {
        return nominal;
    }
    public void setNominal(Integer nominal) {
        this.nominal = nominal;
    }
    // 
    public Boolean validatePin(String pin) {
        return this.pin.equals(pin);
    }

    public Card(Owner owner, String numberId, Integer nominal, String pin, Type type) {
        this.owner = owner;
        this.numberId = numberId;
        this.nominal = nominal;
        this.pin = pin;
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "NumberId = " + this.numberId + " Owner = " + this.getOwner().getName();
    }

    protected String getDetail() {
        return "Card details : { \nOwner = " + this.getOwner().getName()
               + "\nNUmberID : " + this.getNumberId()
               + "\nNominal :" + this.getNominal()
               + "\nType : " + this.getType()
               + "\nStatus : " + this.getStatus() + " }";
    }
}

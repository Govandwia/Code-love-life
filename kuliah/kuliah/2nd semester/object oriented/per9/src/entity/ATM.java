package entity;

import java.util.Date;
import java.util.List;

public class ATM {
    private static final Bank bank = new Bank();

    public static Card createCard (
        String name,
        Date dateofBirth,
        String numberId,
        Integer nominal,
        String pin,
        Card.Type type
    ) { 
        if (bank.checkIfNumberIdExist(numberId)){
            System.out.println("Nomor kartu tidak dapat digunakan");
            return null;
        } else {
            Owner owner = new Owner(name, dateofBirth);
            Card card = new Card(owner, numberId, nominal, pin, type);
            bank.addCard(card);
            return card;
        }
    }

    public static void deactivateCard(String numberId) {
        bank.deactivateCard(numberId);
    }

    public static void reactivateCard(String numberId) {
        bank.reactivateCard(numberId);
    }

    public static void printCardDetail(String numberId) {
        Card card = bank.getCardDetails(numberId);
        System.out.println(card.getDetail());
    }

    public static void withdraw(String numberId, String pin, Integer nominal) {
        Integer uang = bank.withdraw(numberId, pin, nominal);
        System.out.println("Anda mendapat uang sejumlah: " + uang);
    }

    public static void printAllActiveCard() {
        List<Card> cards = bank.getActiveCards();
        System.out.printf("Active card List : %s, with total of %s Card(s) %n",cards, cards.size());
    }
}

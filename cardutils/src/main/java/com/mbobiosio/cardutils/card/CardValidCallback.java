package com.mbobiosio.cardutils.card;

/**
 * Created by Mbuodile Obiosio on 7/13/18
 * cazewonder@gmail.com
 */
public interface CardValidCallback {

    /**
     * called when data entry is complete and the card is valid
     * @param card the validated card
     */

    void cardValid(CreditCard card);
}

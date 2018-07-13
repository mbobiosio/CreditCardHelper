package com.mbobiosio.cardutils.controller;

import android.widget.EditText;

import com.mbobiosio.cardutils.card.CardType;
import com.mbobiosio.cardutils.cardentry.CreditEntryFieldBase;

/**
 * Created by Mbuodile Obiosio on 7/13/18
 * cazewonder@gmail.com
 */
public interface CreditCardFieldDelegate {
    // When the card type is identified
    void onCardTypeChange(CardType type);

    void onCreditCardNumberValid(String remainder);

    void onExpirationDateValid(String remainder);

    // Image should flip to back for security code
    void onSecurityCodeValid(String remainder);

    void onZipCodeValid();

    void onBadInput(EditText field);

    void focusOnField(CreditEntryFieldBase field, String initialValue);

    void focusOnPreviousField(CreditEntryFieldBase field);
}


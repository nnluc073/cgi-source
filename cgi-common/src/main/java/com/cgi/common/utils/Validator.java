package com.cgi.common.utils;

import com.cgi.common.dto.Phone;
import com.cgi.common.constants.enums.ERegion;
import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber;
import org.apache.commons.validator.routines.EmailValidator;

import java.time.LocalDate;
import java.time.Period;
import java.util.regex.Pattern;

/**
 * Created by Fundoo. User: nnluc073 Date: 10/12/2020 Time: 21:37
 */

public class Validator {
    public static boolean isEmail(String email){
        EmailValidator validator = EmailValidator.getInstance();
        return validator.isValid(email);
    }
    public static Phone isPhone(String phoneString) {
        if (phoneString == null)
            return null;
        String str = "^\\s?((\\+[1-9]{1,4}[ \\-]*)|(\\([0-9]{2,3}\\)[ \\-]*)|([0-9]{2,4})[ \\-]*)*?[0-9]{3,4}?[ \\-]*[0-9]{3,4}?\\s?";
        if (Pattern.compile(str).matcher(phoneString).matches()) {
            try {
                PhoneNumberUtil phoneUtil = PhoneNumberUtil.getInstance();
                Phonenumber.PhoneNumber parse = phoneUtil.parse(phoneString, ERegion.VN.getCode());
                String code = String.valueOf(parse.getCountryCode()).substring(0,2);
                Phone phone = new Phone(parse.getCountryCode(),parse.getNationalNumber());
                return phone;
            } catch (NumberParseException ex) {
                return null;
            }
        } else {
            return null;
        }
    }
    public static String stripNonDigits(
            final CharSequence input /* inspired by seh's comment */){
        final StringBuilder sb = new StringBuilder(
                input.length() /* also inspired by seh's comment */);
        for(int i = 0; i < input.length(); i++){
            final char c = input.charAt(i);
            if(c > 47 && c < 58){
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static Phone formatPhone(String phoneString, boolean nonFilter) {
        if (phoneString == null)
            return null;
        if (!nonFilter) {
            phoneString = stripNonDigits(phoneString);
        }
        try {
            PhoneNumberUtil phoneUtil = PhoneNumberUtil.getInstance();
            Phonenumber.PhoneNumber parse = phoneUtil.parse(phoneString, ERegion.VN.getCode());
            Phone phone = new Phone(parse.getCountryCode(),parse.getNationalNumber());
            return phone;
        } catch (NumberParseException ex) {
            return null;
        }
    }

    /**
     * This is to check and return the phone number in international format.
     * @param inputPhoneNumber
     * @param countryCode (i.e: VN, US, SG, IN, ....)
     * @return phone number in international format if it is valid. Otherwise, return null value.
     */
    public static String getInternationalFormatIfPhoneNumberValid(final String inputPhoneNumber, final String countryCode) {
        try {
            PhoneNumberUtil phoneNumberUtil = PhoneNumberUtil.getInstance();
            Phonenumber.PhoneNumber phone = phoneNumberUtil.parse(inputPhoneNumber, countryCode);
            String formattedPhoneNumber = null;
            if (phoneNumberUtil.isValidNumber(phone)) {
                formattedPhoneNumber = phoneNumberUtil.format(phone, PhoneNumberUtil.PhoneNumberFormat.INTERNATIONAL);
                return formattedPhoneNumber.replaceAll(" ", "");
            }
            return null;
        } catch (NumberParseException ex) {
            return null;
        }
    }

    /**
     * This is to validate if the age is limited for using.
     * @param dateOfBirth
     * @param limitedAge
     * @return true only when the age is NOT less than limitedAge, OR dateOfBirth must before today if limitedAge = 0.
     */
    public static boolean validateAge(final LocalDate dateOfBirth, int limitedAge) {
        if (dateOfBirth == null) {
            return false;
        }
        final LocalDate today = LocalDate.now();
        if (limitedAge > 0) {
            final Period diff = Period.between(dateOfBirth, today);
            final int diffYears = diff.getYears();
            if (diffYears >= limitedAge) {
                return true;
            }
        } else {
            return dateOfBirth.isBefore(today);
        }

        return false;
    }
}

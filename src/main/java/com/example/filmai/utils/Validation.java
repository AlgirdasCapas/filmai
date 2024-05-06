package com.example.filmai.utils;

import java.net.HttpURLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    public static final String USERNAME_REGEX_PATTERN = "^[a-zA-Z0-9_@-]{5,13}$";

    public static boolean isValidUsername(String username) {
        //sukuriamos validacijso taisykles pagal anksciau sukurtas taisykles
        Pattern pattern = Pattern.compile(USERNAME_REGEX_PATTERN);
        // validacijos atitikmens sukurimas palyginant vartotojo ivesta username su validacijos taisyklemis.
        Matcher matcher = pattern.matcher(username);
        //grazins true jeigu vartotojo ivestas vardas praeis validacija - priesingu false
        return matcher.find();
    }
}

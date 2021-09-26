package com.example.drugs_delivery.database;

import android.provider.BaseColumns;

public class User {
    private User() {
    }
    public static final class Userdetails implements BaseColumns{
        public static final String TABLE_NAME = "user";
        public static final String COL_NAME = "Name";
        public static final String COL_NUMBER = "Contact Number";
        public static final String COL_Address = "Address";
    }
}

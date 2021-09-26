package com.example.drugs_delivery.database;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DBHandler extends SQLiteOpenHelper {
    public static final String DB_NAME ="User.db";
    public static final int DB_VERSION =1;
    public DBHandler(Context context){
        super(context,DB_NAME, factory null , DB_VERSION);
    }

}
@Override
public void onCreate(SQLiteDatabase db) {
    String USER_TABLE = "CREATE TABLE"+ User.Userdetails.TABLE_NAME+" { "+
            User.Userdetails.COL_NAME+" String PRIMARY KEY,"+
           " User.Userdetails.COL_Address+" String" )"
             User.Userdetails.COL_NUMBER+" INTEGER" )"
              super(context, name, factory, version);
    db.execSQL(USER_TABLE);

}

public boolean addOrder(String Name,int Contact_Number,String Address){
     SQLiteDatabase db= getWritableDatabase();
    ContentValues values= new ContentValues();

    values.put(User.Userdetails.COL_NAME,Name);
    values.put(User.Userdetails.COL_NUMBER,Contact_Number);
    values.put(User.Userdetails.COL_Address,Address);
     long id= db.insert(User.Userdetails.TABLE_NAME, null,values);
}
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
public boolean deleteOrder(User.Userdetails){

    SQLiteDatabase db= this.getWritableDatabase();
    String queryString ="DELETE From" +  USER TABLE + "WHERE"+ COL_Address+ " "+User{
     Cursor Cursor =db.rawQuery(queryString, selection args:null);

     if (cursor.moveTOFirst()) {
         return true;
     }
     else {
         return false;
     }

     }
    }
}
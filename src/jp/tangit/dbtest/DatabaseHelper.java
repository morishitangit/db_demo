package jp.tangit.dbtest;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper{

	public DatabaseHelper(Context context) {
		super(context, null, null, Config.DB_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		
		//tableçÏê¨
	    db.execSQL("create table db_table(_id integer primary key autoincrement, name text not null);");

        // tableë}ì¸
        db.execSQL("insert into db_table(name) values ('Ç¢');");
        db.execSQL("insert into db_table(name) values ('Ç†');");
        db.execSQL("insert into db_table(name) values ('Ç§');");
        db.execSQL("insert into db_table(name) values ('Ç¶');");
        db.execSQL("insert into db_table(name) values ('Ç®');");
        
        db.execSQL("insert into db_table(name) values ('Ç©');");
        db.execSQL("insert into db_table(name) values ('Ç´');");
        db.execSQL("insert into db_table(name) values ('Ç≠');");
        db.execSQL("insert into db_table(name) values ('ÇØ');");
        db.execSQL("insert into db_table(name) values ('Ç±');");
        
        db.execSQL("insert into db_table(name) values ('Ç≥');");
        db.execSQL("insert into db_table(name) values ('Çµ');");
        db.execSQL("insert into db_table(name) values ('Ç∑');");
        db.execSQL("insert into db_table(name) values ('Çπ');");
        db.execSQL("insert into db_table(name) values ('Çª');");
        
        db.execSQL("insert into db_table(name) values ('ÇΩ');");
        db.execSQL("insert into db_table(name) values ('Çø');");
        db.execSQL("insert into db_table(name) values ('Ç¬');");
        db.execSQL("insert into db_table(name) values ('Çƒ');");
        db.execSQL("insert into db_table(name) values ('Ç∆');");
        
        db.execSQL("insert into db_table(name) values ('Ç»');");
        db.execSQL("insert into db_table(name) values ('Ç…');");
        db.execSQL("insert into db_table(name) values ('Ç ');");
        db.execSQL("insert into db_table(name) values ('ÇÀ');");
        db.execSQL("insert into db_table(name) values ('ÇÃ');");
    }

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
	}


}

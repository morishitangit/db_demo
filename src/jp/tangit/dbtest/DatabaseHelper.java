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
		
		//table�쐬
	    db.execSQL("create table db_table(_id integer primary key autoincrement, name text not null);");

        // table�}��
        db.execSQL("insert into db_table(name) values ('��');");
        db.execSQL("insert into db_table(name) values ('��');");
        db.execSQL("insert into db_table(name) values ('��');");
        db.execSQL("insert into db_table(name) values ('��');");
        db.execSQL("insert into db_table(name) values ('��');");
        
        db.execSQL("insert into db_table(name) values ('��');");
        db.execSQL("insert into db_table(name) values ('��');");
        db.execSQL("insert into db_table(name) values ('��');");
        db.execSQL("insert into db_table(name) values ('��');");
        db.execSQL("insert into db_table(name) values ('��');");
        
        db.execSQL("insert into db_table(name) values ('��');");
        db.execSQL("insert into db_table(name) values ('��');");
        db.execSQL("insert into db_table(name) values ('��');");
        db.execSQL("insert into db_table(name) values ('��');");
        db.execSQL("insert into db_table(name) values ('��');");
        
        db.execSQL("insert into db_table(name) values ('��');");
        db.execSQL("insert into db_table(name) values ('��');");
        db.execSQL("insert into db_table(name) values ('��');");
        db.execSQL("insert into db_table(name) values ('��');");
        db.execSQL("insert into db_table(name) values ('��');");
        
        db.execSQL("insert into db_table(name) values ('��');");
        db.execSQL("insert into db_table(name) values ('��');");
        db.execSQL("insert into db_table(name) values ('��');");
        db.execSQL("insert into db_table(name) values ('��');");
        db.execSQL("insert into db_table(name) values ('��');");
    }

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
	}


}

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
		
		//table作成
	    db.execSQL("create table db_table(_id integer primary key autoincrement, name text not null);");

        // table挿入
        db.execSQL("insert into db_table(name) values ('い');");
        db.execSQL("insert into db_table(name) values ('あ');");
        db.execSQL("insert into db_table(name) values ('う');");
        db.execSQL("insert into db_table(name) values ('え');");
        db.execSQL("insert into db_table(name) values ('お');");
        
        db.execSQL("insert into db_table(name) values ('か');");
        db.execSQL("insert into db_table(name) values ('き');");
        db.execSQL("insert into db_table(name) values ('く');");
        db.execSQL("insert into db_table(name) values ('け');");
        db.execSQL("insert into db_table(name) values ('こ');");
        
        db.execSQL("insert into db_table(name) values ('さ');");
        db.execSQL("insert into db_table(name) values ('し');");
        db.execSQL("insert into db_table(name) values ('す');");
        db.execSQL("insert into db_table(name) values ('せ');");
        db.execSQL("insert into db_table(name) values ('そ');");
        
        db.execSQL("insert into db_table(name) values ('た');");
        db.execSQL("insert into db_table(name) values ('ち');");
        db.execSQL("insert into db_table(name) values ('つ');");
        db.execSQL("insert into db_table(name) values ('て');");
        db.execSQL("insert into db_table(name) values ('と');");
        
        db.execSQL("insert into db_table(name) values ('な');");
        db.execSQL("insert into db_table(name) values ('に');");
        db.execSQL("insert into db_table(name) values ('ぬ');");
        db.execSQL("insert into db_table(name) values ('ね');");
        db.execSQL("insert into db_table(name) values ('の');");
    }

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
	}


}

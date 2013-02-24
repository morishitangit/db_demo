package jp.tangit.dbtest;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.Menu;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class MainActivity extends Activity {

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//listview�̐���
		ListView lv = (ListView) findViewById(R.id.listView1);
		
		//db�쐬
		DatabaseHelper helper = new DatabaseHelper(this);
		SQLiteDatabase db = helper.getWritableDatabase();
		
		//�J�[�\���̍쐬
		Cursor c = db.rawQuery("select * from db_table order by name;",null);

		//table�̃f�[�^�����X�g�A�_�v�^�[�ɃZ�b�g
        ListAdapter adapter = new SimpleCursorAdapter(
        												this,
        												android.R.layout.simple_list_item_1,
        												c,
        												new String[] { "_id", "name" },
        												new int[] { android.R.id.text2, android.R.id.text1 },
        												0);
        //�A�_�v�^�[���ɃZ�b�g
        lv.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}

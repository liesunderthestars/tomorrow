package com.example.myedittext;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	private EditText et;
	private EditText et1;
	private TextView tv;
	/**当Activity被第一次创建时调用**/
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	et=(EditText)findViewById(R.id.et);
	et1=(EditText)findViewById(R.id.et1);
	tv=(TextView)findViewById(R.id.tv);
	/*为EditText设置监听回车键*/
	et1.setOnKeyListener(new OnKeyListener() {
		
		@Override
		public boolean onKey(View v, int keyCode, KeyEvent event) {
			if (keyCode==KeyEvent.KEYCODE_ENTER) {
				tv.setText("您的用户名为："+et.getText().toString()+"\n"+"您的密码为："
			+et1.getText());//按下回车键即显示文本，文本为输入框中的内容
			}
			// TODO Auto-generated method stub
			return false;
		}
	});
	}

}

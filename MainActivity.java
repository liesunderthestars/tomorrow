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
	/**��Activity����һ�δ���ʱ����**/
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	et=(EditText)findViewById(R.id.et);
	et1=(EditText)findViewById(R.id.et1);
	tv=(TextView)findViewById(R.id.tv);
	/*ΪEditText���ü����س���*/
	et1.setOnKeyListener(new OnKeyListener() {
		
		@Override
		public boolean onKey(View v, int keyCode, KeyEvent event) {
			if (keyCode==KeyEvent.KEYCODE_ENTER) {
				tv.setText("�����û���Ϊ��"+et.getText().toString()+"\n"+"��������Ϊ��"
			+et1.getText());//���»س�������ʾ�ı����ı�Ϊ������е�����
			}
			// TODO Auto-generated method stub
			return false;
		}
	});
	}

}

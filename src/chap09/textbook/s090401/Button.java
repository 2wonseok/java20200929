package chap09.textbook.s090401;

public class Button {
	OnClickListener listener; // 인터페이스 타입 핑드
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	interface OnClickListener {
		void onClick();
	}
}

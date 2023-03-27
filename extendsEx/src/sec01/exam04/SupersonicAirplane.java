package sec01.exam04;

//상속받을때 사용하는 키워드 
//extends + 부모클래스명
public class SupersonicAirplane extends Airplane {
	
	//상수
	//한번 정의 후 값을 변경할 수 없다. 
	//대문자로 작성하고 단어를 연결할 경우 _를 붙여준다. 
	// 비행모드를 숫자로 정의한 것 1이면 보통 2이면 초음속
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2; 

	//비행상태
	public int flymode;
	
	//매개변수를 받아서 flyMode를 세팅
	public SupersonicAirplane(int flyMode) {
		System.out.println("====자식생성====");
		if(flyMode == NORMAL 
				 || flyMode == SUPERSONIC) {
			this.flymode = flyMode;
		}else {
			flyMode = NORMAL;
		}
	}
	@Override
	public void fly() {
		//부모가 가지고 있는 메서드를 자식클래스에서 재정의
		//메서드를 재정의해도 기존에 부모가 가진 메서드를 호출할 수 있다.
		//super.메서드명();
		
		if(flymode == SUPERSONIC ) {
			System.out.println("초음속비행입니다.");
		}else {
			//fly()를 재작성 했지만
			//부모가 가지고 있는 fly()메서드를 호출할 수 있다. 
			//super를 이용해서 접근 
			
			//초음속비행이면 자식 메서드 
			//일반비행이면 부모 메서드
			super.fly();
		}
		
	}
	public void booster() {
		System.out.println("부스터 작동! ! ! ");
	}
	
}

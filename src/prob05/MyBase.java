package prob05;

public class MyBase extends Base {
	
	public void service(String state){
		if( state.equals( "낮" ) ) {
			day();
		} else{
			night(state);
		}
	}
	
	public void day(){
		System.out.println("낮에는 열심히 일하자");
	}
	
	public void night(String state){
		if(state.equals("밤"))
		{
			System.out.println("night");
		}else
		{
			System.out.println("오후도 낮과 같이 일해야 합니다.");
		}
		
	}
}

package objetos;

public class WallJump extends Circle {

	public void regresar(){
		if(positionY+size > 600){
			velocityY -= gravity;
		}
	}
}

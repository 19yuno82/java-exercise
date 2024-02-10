package Controller;

import Model.MusicVO;
import javazoom.jl.player.MP3Player;
import javazoom.jl.player.Player;

public class Controller {
	//1.모든 노래들
	//2.노래 재생하는 객체
	//3.현재 재생번호
	private MusicVO[] musics;
	private MP3Player player;
	private int currentIndex;
	
	public Controller() {
		//생성자의 매개변수는 객체가 생성될 때 전달해줘야 하는 값이 있는 경우 생성
		musics = new MusicVO[5];
		
		//새 노래 객체 생성해서 0번칸에 저장
		musics[0] = new MusicVO("2002","AnneMarie","C:\\Users\\smhrd\\Desktop\\Music\\AnneMarie-2002.mp3",30);
		musics[1] = new MusicVO("DallaDalla","Itzy","C:\\Users\\smhrd\\Desktop\\Music\\Itzy-DallaDalla.mp3",30);
		musics[2] = new MusicVO("벌써12시","CHUNGHA","C:\\Users\\smhrd\\Desktop\\CHUNGHA-벌써12시.mp3",30);
		musics[3] = new MusicVO("깡","Rain","C:\\Users\\smhrd\\Desktop\\Rain-깡.mp3",30);
		musics[4] = new MusicVO("꽃","JISOO","C:\\Users\\smhrd\\Desktop\\JISOO-꽃.mp3",30);
		player = new MP3Player();
		currentIndex = 0;
		
	}//생성자

	public void play() {
		//현재 재생 중인지 검사
		if(player.isPlaying()) { //현재 노래 재생중이면
			player.stop(); //중지
		}//if
		//currentIndex 번째 노래 경로 play 안에 넣어주세요
		player.play(musics[currentIndex].getRoute());
	}//play method
	public void nextPlay() {
		//마지막 곡이면 처음 곡으로 돌리기
		currentIndex = (currentIndex == musics.length-1 ? 0 : currentIndex+1) ;
		play();
	}

	public void prePlay() {
		// 처음 곡이면 마지막 곡으로 돌리기
		currentIndex = (currentIndex == 0 ? musics.length-1 : currentIndex-1);
		play();
	}

	public String playList() {
		//현재 재생곡 출력
		return musics[currentIndex].toString();
	}

	public void stop() {
		//재생곡 정지
		player.stop();
	}
	
	
}//클래스

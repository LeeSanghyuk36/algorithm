import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
   
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      int o = 0; //적정 체중
      int w = 0; //실제 체중
      
      int scenario = 0; //시나리오
      String pet_state = ""; //펫의 상태 체크
      int game_state = 0; //게임의 상태 체크

      while( true )
      {
    	  String s = br.readLine();
    	  //시나리오 조작
    	  if( s.equals("# 0") ) {
    		 bw.write(scenario + " " + pet_state + "\n") ;
    		 game_state = 0;
    		 continue;
    	  } else if (s.equals("0 0")) {
    		  break;
    	  }
    	  
    	  //게임 상태 체크 및 작용
    	  if(game_state == 0) { //게임 시작
    		  StringTokenizer st = new StringTokenizer(s);
    		  o = Integer.parseInt(st.nextToken()); 
    	      w = Integer.parseInt(st.nextToken()); 
    	      game_state = 1;
    	      scenario++;
    	  } else if (game_state == 1) {//게임 도중
    		  StringTokenizer st = new StringTokenizer(s);
    		  String action = st.nextToken();
    		  int n = Integer.parseInt(st.nextToken());
    		  
    		  if(action.equals("E")) {
    			  w -= n;
    		  } else if (action.equals("F")) {
    			  w += n;
    		  }
    	  } else { //펫 사망
    		  continue;
    	  }
    	  
    	  //펫 상태 체크
    	  if( o/2 < w && w < o*2 ) {
    		  pet_state = ":-)"; //행복함
    	  } else if ( w <= 0) {
    		  pet_state = "RIP"; //사망
    		  game_state = -1; //게임 상태 변경
    	  } else {
    		  pet_state = ":-("; //슬픔
    	  }
    	  
      }
      bw.flush();
      bw.close();
      br.close();
   }   
}
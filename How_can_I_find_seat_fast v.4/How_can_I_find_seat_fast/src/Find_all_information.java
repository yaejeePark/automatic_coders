//http://blog.naver.com/shumin/220352549235
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.NoSuchElementException;

//Queue와 ArrayList를 이용해서 만들자! 
public class Find_all_information {
	
	int find_station = 0;
	static ArrayList<Integer> showSeat = new ArrayList<Integer>(9);
	static LinkedList<Integer> EachSeatQueue1 = new LinkedList<Integer>();
   //	EachSeatQueue1.add(0);
	static LinkedList<Integer> EachSeatQueue2 = new LinkedList<Integer>();
   // EachSeatQueue2.add(0);
	static LinkedList<Integer> EachSeatQueue3 = new LinkedList<Integer>();
    //EachSeatQueue3.add(0);
	static LinkedList<Integer> EachSeatQueue4 = new LinkedList<Integer>();
   // EachSeatQueue4.add(0);
	static LinkedList<Integer> EachSeatQueue5 = new LinkedList<Integer>();
   // EachSeatQueue5.add(0);
	static LinkedList<Integer> EachSeatQueue6 = new LinkedList<Integer>();
  //  EachSeatQueue6.add(0);
	static LinkedList<Integer> EachSeatQueue7 = new LinkedList<Integer>();
   // EachSeatQueue7.add(0);
	static LinkedList<Integer> EachSeatQueue8 = new LinkedList<Integer>();
    //EachSeatQueue8.add(0);
	static LinkedList<Integer> EachSeatQueue9 = new LinkedList<Integer>();
    //EachSeatQueue9.add(0);
	
   public synchronized ArrayList<Integer> get_current_seat(int hi){
     // Queue(num)
	   System.out.println("get_current_seat에 옴!");
	   hi++;
      for(int i=1;i<9;i++){
    	  System.out.println("나는 i얌 "+i);
    	  int ho = Queue(i,0,0,true);
    	  System.out.println("ho i="+i+"맨마지막에 있는 것은! ="+ho);
    	  showSeat.add(i-1,ho); //현재 맨 끝에 있는 것을 받아와야해 ! 
      }
      return showSeat;    
   }

   public static synchronized int Queue(int num, int current, int dest, boolean in){ // 각 자리마다 가지고 있음 
                          // num은 자리     목적지    나가는지 들어오는 지
      //링크드 리스트 만들기 여기서 말고! 제일 밖에서 만들 것
      //LinkedList<int>[7] eachSeatQueue = new LinkedList<int>()
      //               이거 되나?
	   //if(l==1){
		
	  // }
      //자기를 넣기 전에 먼저 가장 작은 목적지를 가지는 queue찾기
      try{if(in&&current!=0&&current!=0)//들어온 거라면 
      {
    	  switch(num){
      case 1:
    	  EachSeatQueue1.add(1,dest);
     case 2:
    	 EachSeatQueue2.add(2,dest);    
     case 3:
    	 EachSeatQueue3.add(3,dest);
     case 4:
    	 EachSeatQueue4.add(4,dest);
     case 5:
    	 EachSeatQueue5.add(5,dest);
     case 6:
         EachSeatQueue6.add(6,dest);
     case 7:
         EachSeatQueue7.add(7,dest);
     case 8:
         EachSeatQueue8.add(8,dest);
     case 9:
         EachSeatQueue9.add(8,dest);
     }
       
      }
      else if(in&&current ==0 && dest ==0){//맨 마지막만 궁금한 친구
    	  switch(num){
          case 1: System.out.println("여기 else if 들어옴/??");
          System.out.println(EachSeatQueue1.getLast());
        	 if(EachSeatQueue1.getLast()==null){
        		 System.out.println("맨마지막에 있는 친구는 ...!! null이다");
        	 	return 0;
        	 }
    		 System.out.println("맨마지막에 있는 친구는 ...!! null이 아니다!!!!!!!");

        	  return EachSeatQueue1.getLast();
          case 2:
        	  System.out.println("여기 else if 들어옴/??");
        	  if(EachSeatQueue1.getLast().equals(null))
         		 return 0;
        	  return EachSeatQueue2.getLast();
          case 3:
        	  if(EachSeatQueue1.getLast()==0)
          		 return 0;
        	  return EachSeatQueue3.getLast();
          case 4:
        	  if(EachSeatQueue1.getLast()==0)
          		 return 0;
        	  return EachSeatQueue4.getLast();
          case 5:
        	  if(EachSeatQueue1.getLast()==0)
          		 return 0;
        	  return EachSeatQueue5.getLast();
          case 6:
        	  if(EachSeatQueue1.getLast()==0)
          		 return 0;
        	  return EachSeatQueue6.getLast();
          case 7:
        	  if(EachSeatQueue1.getLast()==0)
          		 return 0;
        	  return EachSeatQueue7.getLast();
          case 8:
        	  if(EachSeatQueue1.getLast()==0)
          		 return 0;
        	  return EachSeatQueue8.getLast();
          case 9:
        	  if(EachSeatQueue1.getLast()==0)
          		 return 0;
        	  return EachSeatQueue8.getLast();
          }
      }
      else//역에 도착해서 나가는 거라면 / in이 false라면
      {
    	  
       switch(num){
       case 1:
            EachSeatQueue1.remove(EachSeatQueue1.size());
       case 2:
           EachSeatQueue2.remove(EachSeatQueue2.size());
       case 3:
           EachSeatQueue3.remove(EachSeatQueue3.size());
       case 4:
           EachSeatQueue4.remove(EachSeatQueue4.size());
       case 5:
           EachSeatQueue5.remove(EachSeatQueue5.size());
       case 6:
           EachSeatQueue6.remove(EachSeatQueue6.size());
       case 7:
           EachSeatQueue7.remove(EachSeatQueue7.size());
       case 8:
           EachSeatQueue8.remove(EachSeatQueue8.size());
       case 9:
           EachSeatQueue9.remove(EachSeatQueue9.size());
       }
      }
      //어레이 초기화! (먼저 클라이언트에게 보낸 후 !)
      return 0;
      } catch (NoSuchElementException e){
    	  return 0;
      }
   }
   
   public static synchronized int get_fast_seat(int current) {
      // TODO Auto-generated method stub
      //현재역에서 부터 가장 빨리 내리는 역 ! 
      //찾아줘 
      //pre_seat_information을 보고 
      int find = 0;
      int find_index = 0;
      while(true){
    	  find = (current+1)%10;
         find_index = Collections.binarySearch(showSeat, find);//그게 있어! 
         if(find_index == find)
            break;
         else if(find==9)
        	return -1;
         current++;
      }
      return find_index;
   }
}
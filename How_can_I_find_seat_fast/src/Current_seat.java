//http://blog.naver.com/shumin/220352549235
import java.util.*;
//Queue와 ArrayList를 이용해서 만들자! 
public class Current_seat {
		 Current_seat(){
			int find_station = 0;
			//seat_destination.add
			//pre_seat_information = seat_information;
			//int show_seat = new Integer;
			ArrayList<Integer> show_seat = new ArrayList<Integer>(8);
			//전체 자리
			LinkedList<Integer> eachSeatQueue = new LinkedList<Integer>();//집에 가서 알아보기
		}
	//여기서는 어레이를 알려줌 
	public synchronized arrayList<Integer> get_current_seat(int current, int dest, boolean in){
		//Queue(0, current,dest,true);
		int dest_station = 0;
		for(int i=0;i<8;i++){
			dest_station = Queue(i,0,0,true); //현재 맨 끝에 있는 것을 받아와야해 ! 
			show_seat.add(i,dest_station); //잠만 이걸 이케 빨리해도 되나!?  
		}//우선 맨 마지막에 있는 큐를 찾도록 해! 
		return show_seat;		
	}
	public synchronized int Queue(int num, int current, int dest, boolean in){ // 각 자리마다 가지고 있음 
								  // num은 자리  				목적지 	나가는지 들어오는 지		
		//자기를 넣기 전에 먼저 가장 작은 목적지를 가지는 queue찾기
		if(in==true)//들어온 거라면 
		{
			find_station = get_fast_station(current);//seat을 보내주나봐!!!
			//그 링크드에 데스트 넣기
			eachSeatQueue[find_station].add(dest);//마지막이 들어감 ! //얘를 만들어야 함!!!
			
		}
		else if(current==0&&dest==0){
			return eachSeatQueue[num].getLast(); 
		}
		else//역에 도착해서 나가는 거라면  in ==false라면!?
		{
				//그 링크드에 데스트 넣기 
				eachSeatQueue[num].delete(dest);// 그 자리에 있는 것을 빼기! 

		}
		//어레이 초기화! (먼저 클라이언트에게 보낸 후 !)
	}
	
	private synchronized int get_fast_station(int current) {
		// TODO Auto-generated method stub
		//현재역에서 부터 가장 빨리 내리는 역 ! 
		//찾아줘 
		//pre_seat_information을 보고 
		int find = 0;
		int find_index = 0;
		for(find = (current+1)%9;;current++){
			find_index = Collections.binarySearch(show_seat, find);//array List 
			if(find_index == find)
				break;
		}
		return find_index;//가장 빠른 seat이어야 해!!!
	}
}

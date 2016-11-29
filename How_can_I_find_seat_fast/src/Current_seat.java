//http://blog.naver.com/shumin/220352549235
import java.util.Collections;

//Queue와 ArrayList를 이용해서 만들자! 
public class Current_seat {
		int find_station = 0;
		//seat_destination.add
		//pre_seat_information = seat_information;
	
	//여기서는 어레이를 알려줌 
	public synchronized arrayList[] get_current_seat(){
		Queue(num)
		for(int i=0;i<9;i++){
			array_list[i] = Queue(i,0,0,true); //현재 맨 끝에 있는 것을 받아와야해 ! 
		}
		return array_list;
		
	}
	//가장 빠른 역 정보를 줌 
	public int get_fast_station(){
		return find_station;
	}
	public synchronized void Queue(int num, int current, int dest, boolean in){ // 각 자리마다 가지고 있음 
								  // num은 자리  	목적지 	나가는지 들어오는 지
		//링크드 리스트 만들기 여기서 말고! 제일 밖에서 만들 것
		//LinkedList<int>[7] eachSeatQueue = new LinkedList<int>()
		//					이거 되나?
		
		//자기를 넣기 전에 먼저 가장 작은 목적지를 가지는 queue찾기
		int find_station = find_fast_station(current);
		if(in==true)//들어온 거라면 
		{
		for(int i=0;i<7;i++){
			if(num==i)//
			그 링크드에 데스트 넣기
			eachSeatQueue[num].add(dest);
			}
		}
		else//역에 도착해서 나가는 거라면 
		{
			for(int i=0;i<7;i++){
				if(num==i)
				그 링크드에 데스트 넣기 
				eachSeatQueue[num].delete(dest);
				}
		}
		어레이 초기화! (먼저 클라이언트에게 보낸 후 !)
	}
	
	private synchronized int get_fast_station(int current) {
		// TODO Auto-generated method stub
		//현재역에서 부터 가장 빨리 내리는 역 ! 
		//찾아줘 
		//pre_seat_information을 보고 
		int find = 0;
		int find_index = 0;
		for(find = (current+1)%9;;current++){
			find_index = Collections.binarySearch(list, find);
			if(find_index == find)
				break;
			else
				continue;
		}
		return find;
	}
}

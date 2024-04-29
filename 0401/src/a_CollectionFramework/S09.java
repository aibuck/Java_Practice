package a_CollectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class S09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> queue = new LinkedList<>();
		
		queue.offer("땡큐");
		queue.offer("베리");
		queue.offer("감사");
		queue.poll();//땡큐
		queue.offer("방가");
		
		System.out.println(queue.peek());//베리
//		String result = queue.poll();
//		System.out.println(result);//베리
		System.out.println(queue.poll());//베리
		System.out.println(queue.poll());//감사
		System.out.println(queue.poll());//방가 //프린트 안에 있는것을 처리후, 프린트는 그 값만을 출력.
		System.out.println(queue.isEmpty());//true

	}

}

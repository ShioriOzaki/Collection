package practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Chapter5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<Task> task = new ArrayList<Task>();
		
		Task task1 = new Task(LocalDate.of(2021,10,21),"牛乳を買う");
		task.add(task1);
		Task task2 = new Task(LocalDate.of(2021,9,15),"○○社面談");
		task.add(task2);
		Task task3 = new Task(LocalDate.of(2021,12,4),"手帳を買う");
		task.add(task3);
		Task task4 = new Task(LocalDate.of(2021,8,10),"散髪に行く");
		task.add(task4);
		Task task5 = new Task(LocalDate.of(2021,11,9),"スクールの課題を解く");
		task.add(task5);
		
		task.sort(Comparator.comparing(Task::getDate, Comparator.naturalOrder()));
		
		for(Task tasks : task) {
			
			System.out.printf("%s:%s\n",tasks.getDate(),tasks.getTask());
			
		}

	}

}

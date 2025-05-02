package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.List;

public class Quention10 {
	public static void main(String[] args) {
		List<String> TaskId = new ArrayList<String>();
		TaskId.add("TASK001");
		TaskId.add("TASK002");
		TaskId.add("TASK003");
		TaskId.add("TASK001");
		TaskId.add("TASK004");
		TaskId.add("TASK002");
		for (int i = 0; i < TaskId.size(); i++) {
			System.out.println("-" + TaskId.get(i));
		}
		System.out.println("処理済みのタスクID一覧:" + TaskId);

		String Task1 = "TASK003";
		String Task2 = "TASK005";
		if (TaskId.contains(Task1)) {
			System.out.println(Task1 + "は既に処理済みです");
			TaskId.add(Task1);
		} else {
			System.out.println(Task1 + "は未処理です");
		}
		if (TaskId.contains(Task2)) {
			System.out.println(Task2 + "は既に処理済みです");
			TaskId.add(Task2);
		} else {
			System.out.println(Task2 + "は未処理です");
		}

		System.out.println("処理済みのタスクの総数: " + TaskId.size());

	}
}

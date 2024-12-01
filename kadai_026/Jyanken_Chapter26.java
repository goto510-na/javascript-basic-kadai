package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	public String getMyChoice() {
		Scanner scanner = new Scanner(System.in);
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
			
			boolean badInput = true;
			do {
			String hand = scanner.next();
			
			
			if (hand.equals("r") || hand.equals("s") ||hand.equals("p")){
				badInput=false;
				return hand;
			}else {
				System.out.println("入力された値が不正です。");
				System.out.println("もう一度入力してください：");
			}	
			}while (badInput);
				
			
		return null;
	}
	public String getRandom() {
		String[] hands = {"r","s","p"};
		int index = (int)Math.floor(Math.random() * 3);
		return hands [index];
				
	}
	public void playGame(String myHand, String botHand) {
		HashMap<String, String> handMap = new HashMap<>();
		handMap.put("r","グー");
		handMap.put("s","チョキ");
		handMap.put("p","パー");
		
		System.out.println("自分の手は："+handMap.get(myHand));
		System.out.println("相手の手は:"+handMap.get(botHand));
		
		if (myHand. equals(botHand)) {
			System.out.println("あいこです");
		}else if ((myHand.equals("r")&& botHand.equals("s"))
			||(myHand.equals("s")&& botHand.equals("p"))
			||(myHand.equals("p")&& botHand.equals("r"))){
			System.out.println("自分の勝ちです");
			
		}else {
			System.out.println("自分の負けです");
		}
		}
	}



package kadai_018;

abstract public class Kato_Chapter18 {
	
	public String familyName= "加藤";
	public String giveName= "";
	public String adress= "東京都中野区〇×";
	
	public void commonlntroduce() {
		System.out.println("名前は"+familyName+giveName+"です");
		System.out.println("住所は"+adress+"です");
	}
	
	abstract public void eachlntroduce();
	
	public void execlntroduce(){
		eachlntroduce();
}
}
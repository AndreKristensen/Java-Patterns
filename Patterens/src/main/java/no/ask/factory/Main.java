package no.ask.factory;

public class Main {

	public static void main(String[] args) {
		
		Flag norFlag = FlagFactory.flagCreator("NOR");
		System.out.println(norFlag.flagName());
		
		Flag engFlag = FlagFactory.flagCreator("ENG");
		System.out.println(engFlag.flagName());
	}
}

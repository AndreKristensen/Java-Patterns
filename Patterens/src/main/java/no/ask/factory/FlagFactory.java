package no.ask.factory;

public class FlagFactory {

	public static Flag flagCreator(String flag){
		if(flag.equals("NOR")){
			return new NorwegianFlag();
		}else if(flag.equals("ENG")){
			return new EnglishFlag();
		}
		return null;
	}
}

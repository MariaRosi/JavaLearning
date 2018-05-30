package Internationalization;

import java.util.Locale;

public class LocaleExample {

	public static void main(String[] args) {
		System.out.println("The default Locale = "+Locale.getDefault());
		System.out.println("The default Locale Language = "+Locale.getDefault().getDisplayLanguage());
		System.out.println("The default Locale Country = "+Locale.getDefault().getDisplayCountry());
		
		//Locale l1 = new Locale("pa","IN");
		//Locale.setDefault(l1);
		
		//System.out.println("The Locale after setting = "+Locale.getDefault().getDisplayLanguage());
		
		String[] listLanguages = Locale.getISOLanguages();
		
		for(String sLang : listLanguages) {
			//System.out.println(sLang);
		}
		String[] listCountries = Locale.getISOCountries();
		
		for(String sCountry : listCountries) {
			//System.out.println(sCountry);
		}
		
		Locale[] listLocales = Locale.getAvailableLocales();
		
		for(Locale l2 : listLocales) {
			System.out.println(l2.getDisplayCountry()+ "   "+l2.getDisplayLanguage());
		}
		

	}

} 

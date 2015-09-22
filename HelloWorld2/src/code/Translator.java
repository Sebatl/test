package code;

public class Translator {

	HelloWorld2 hello;

	/**
	 * Clase traductora de hola mundo
	 */
	public Translator(){
		hello = new HelloWorld2();
	}

	/**Metodo que traduce el viejo y querido "Hola Mundo" segun un idioma pasado 
	 * @param language String de 3 caracteres que define el idioma en el que se mostrara el "Hola Mundo"
	 * @return Traduccion del "Hola Mundo"
	 */
	public String printHelloWorld(String language){
		if(language.length() != 3){
			return "Invalid language!";
		}
		language = language.toUpperCase();

		if(language.equals("SPA")){
			return hello.printSpa();
		}
		if(language.equals("ENG")){
			return hello.printEng();
		}

		return "Error";
	}

}

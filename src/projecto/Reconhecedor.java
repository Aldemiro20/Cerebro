/*
 * Created on 10/05/2005
 *  
 */
package projecto;


import java.io.FileReader;
import java.util.Locale;
import javax.speech.Central;
import javax.speech.EngineModeDesc;
import javax.speech.recognition.Recognizer;
import javax.speech.recognition.Result;
import javax.speech.recognition.ResultAdapter;
import javax.speech.recognition.ResultEvent;
import javax.speech.recognition.ResultToken;
import javax.speech.recognition.RuleGrammar;

public class Reconhecedor extends ResultAdapter {
	public static Recognizer rec;
	private final String url;
	private final String gramatica;
	private Command command;

	public Reconhecedor(String url, String gram) {
		this.url = url;
		gramatica = gram;
	}
	
	public void setCommand(Command com) {
		command = com;
	}
	
	public Command getCommand() {
		return command;
	}

	// Receives RESULT_ACCEPTED event: print it, clean up, exit
        @Override
	public void resultAccepted(ResultEvent e) {
		Result r = (Result) (e.getSource());
		ResultToken tokens[] = r.getBestTokens();
		String frase = "";
		for (int i = 0; i < tokens.length; i++) {
			frase = frase.concat(tokens[i].getSpokenText() + " ");
		}
		System.out.println(frase + ".");
		if(command!=null)
			command.commandSaid(frase);
		//Sintetizador sin = new Sintetizador();
		//sin.speak(frase);
		// Deallocate the recognizer and exit
		if ((tokens[0].getSpokenText()).equals("terminar")) {
			try {
				rec.deallocate();
				System.out.println("SAINDO DO PROGRAMA");
				System.exit(0);
			} catch (Exception exp) {
				System.out.println("Deu pau! " + exp.toString());
			}
		}
	}

	public void iniciar() {
		try {
			// Create a recognizer that supports Portuguese.
			rec = Central.createRecognizer(new EngineModeDesc(new Locale("pt",
					"BR")));
                        rec.allocate();
			FileReader reader = new FileReader("C:\\Users\\MG\\Documents\\NetBeansProjects\\Projecto\\src\\projecto\\gramatica.gram");
			RuleGrammar gram = rec.loadJSGF(reader);
			gram.setEnabled(true);
			rec.addResultListener(this);
			rec.commitChanges();
			rec.requestFocus();
			rec.resume();
		} catch (Exception e) {
			System.out.println("Reconhecedor - Error 1: " + e.toString());
		}
	}

	public static void main(String args[]) {
		Reconhecedor reconhecedor = new Reconhecedor("C:\\Users\\MG\\Documents\\NetBeansProjects\\Projecto\\src\\projecto\\gramatica.gram","gramatica");
		reconhecedor.iniciar();
	}
}


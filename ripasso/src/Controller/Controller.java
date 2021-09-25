package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Model.Data;
import View.Grafica;

public class Controller implements ActionListener {
	Grafica view;
	Data d;
	
	public Controller(Grafica view, Data d) {
		// TODO Auto-generated constructor stub
		this.view = view;
		this.d = d;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		view.setN_tent(5);
		if (e.getSource() == view.getBottone()) {
			if (d.getTentativi() > 0) {
			//System.out.println("ciao");
			int x = d.genera_n();
			//System.out.println(" "+x);
			int n = view.getTextField();
			if (d.check(n) == 1) {
				view.setRisposta("Hai vinto!");
			}
			else {
				view.setN_tent(d.dec_tent());
				if (d.check(n) == 2) view.setRisposta("Riprova con un numero maggiore...");
				if (d.check(n) == 0) view.setRisposta("Riprova con un numero minore...");
			}
		}
			else view.setRisposta("Hai perso, tentativi finiti");
		}
		
	}

}

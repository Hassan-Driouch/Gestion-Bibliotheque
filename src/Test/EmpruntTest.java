package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


import Utility.BibalExceptions;
import control.OeuvreControl;
import control.UsagerControl;
import domaine.Emprunt;
import domaine.Exemplaire;
import domaine.Livre;
import domaine.Oeuvre;
import domaine.Usager;

public class EmpruntTest {

    private static UsagerControl usagerControl;

    private static OeuvreControl ouvreControl;
    private static control.ExemplaireControl ExemplaireControl;


	@Test
	public void testEmprunter() throws BibalExceptions {
	    // Création d'un usager et sauvegarde dans la base de données
	    Usager usager = new Usager("khalid", "bouwari", new Date(90, 11, 31), "M", "1 rue des Lilas", "0123456789");

	    usagerControl.ajouter(usager);

	    // Création d'une oeuvre et sauvegarde dans la base de données
	    Oeuvre oeuvre = new Oeuvre();
	    oeuvre.setTitre("Titre de l'oeuvre");
	    oeuvre.setAuteur("Auteur de l'oeuvre");
	    oeuvre.setCategorie("Categorie de l'oeuvre");
	    ouvreControl.ajouter(oeuvre);

	    // Création d'un exemplaire et sauvegarde dans la base de données
	    Exemplaire exemplaire = new Exemplaire();
	    exemplaire.setOeuvresExamplaire(oeuvre);
	    exemplaire.setEtat("Exemplaire");
	    ExemplaireControl.ajouter(oeuvre, null);

	  

	}


}

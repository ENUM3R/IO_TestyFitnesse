package org.example.prezenter;

import org.example.model.Role;

public interface Logowanie {

	String zaloguj(String nazwaUzytkownika, String haslo);


	String zarejestruj(String nazwaUzytkownika, String haslo, Role rola);

}
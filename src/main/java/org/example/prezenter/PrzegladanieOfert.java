package org.example.prezenter;

import org.example.model.*;

public interface PrzegladanieOfert {

	Oferta[] przegladajOferty(Filtry filtry, Sortowanie sortowanie);
}
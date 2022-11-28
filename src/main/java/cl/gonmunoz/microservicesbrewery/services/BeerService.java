package cl.gonmunoz.microservicesbrewery.services;

import cl.gonmunoz.microservicesbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);
}

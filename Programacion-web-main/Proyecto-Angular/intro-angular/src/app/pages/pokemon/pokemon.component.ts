import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { PokedexService } from 'src/app/services/pokedex/pokedex.service';

@Component({
  selector: 'app-pokemon',
  templateUrl: './pokemon.component.html',
  styleUrls: ['./pokemon.component.css']
})
export class PokemonComponent implements OnInit {

  pokemon: any = null;

  constructor(
    private pokedexService: PokedexService,
    private route: ActivatedRoute) { }

  ngOnInit(): void {
    const pokemonId = this.route.snapshot.paramMap.get('id');
    if (pokemonId) {
      const id = parseInt(pokemonId);
      this.obtenerPokemon(id);
    }
  }

  obtenerPokemon(id: number) {
    this.pokedexService
      .getPokemon(id)
      .subscribe((pokemon: any) => {
        console.log({ pokemon });
        this.pokemon = pokemon;
      });
  }

  siguientePokemon() {
    const siguienteId = this.pokemon.id + 1;
    if (siguienteId <= 1010) {
      this.obtenerPokemon(siguienteId);
    }
  }

  anteriorPokemon() {
    const anteriorID = this.pokemon.id - 1;
    if (anteriorID > 0) {
      this.obtenerPokemon(anteriorID);
    }
  }

  getRandomPokemon() {
    const randomID = Math.floor(Math.random() * 1010);
    this.obtenerPokemon(randomID);
  };
}
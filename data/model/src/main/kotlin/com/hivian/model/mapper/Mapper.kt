package com.hivian.model.mapper

import com.hivian.model.domain.Pokemon
import com.hivian.model.domain.PokemonStat
import com.hivian.model.domain.PokemonType
import com.hivian.model.dto.database.DbPokemon
import com.hivian.model.dto.database.DbPokemonStat
import com.hivian.model.dto.database.DbPokemonType
import com.hivian.model.dto.network.NetworkPokemonObject

abstract class Mapper<I, O> {
    /**
     * Mapping object.
     *
     * @param from Initial object to from mapping.
     * @return An Object containing the results of applying the transformation.
     */
    abstract fun map(input: I): O

    fun map(input: List<I>) : List<O> = input.map { map(it) }
}

data class MapperPokedexRepository(val remoteToDbMapper: MapperPokemonRemoteToDbImpl, val dbToDomainMapper: MapperPokemonDbToDomainImpl)

class MapperPokemonDbToDomainImpl : Mapper<DbPokemon, Pokemon>() {
    override fun map(input: DbPokemon): Pokemon {
        return Pokemon(
            pokemonId = input.pokemonId,
            name = input.name,
            height = input.height,
            weight = input.weight,
            abilities = input.abilities,
            forms = input.forms,
            moves = input.moves,
            imageUrl = input.imageUrl,
            stats = input.stats.map { PokemonStat(it.name, it.baseStat, it.effort) },
            types = input.types.map { PokemonType(it.slot, it.name) })
    }
}

class MapperPokemonRemoteToDbImpl : Mapper<NetworkPokemonObject, DbPokemon>() {
    override fun map(input: NetworkPokemonObject): DbPokemon {
        return DbPokemon(
            pokemonId = input.id,
            name = input.name,
            height = input.height,
            weight = input.weight,
            generation = Generations.from(input.id),
            abilities = input.abilities.map { it.ability.name },
            forms = input.forms.map { it.name },
            moves = input.moves.map { it.move.name },
            // High resolution image source.
            imageUrl = "https://pokeres.bastionbot.org/images/pokemon/${input.id}.png",
            stats = input.stats.map { DbPokemonStat(
                name = it.stat.name,
                baseStat = it.baseStat,
                effort = it.effort
            ) },
            types = input.types.map { DbPokemonType(
                slot = it.slot,
                name = it.type.name
            ) }
        )
    }

}
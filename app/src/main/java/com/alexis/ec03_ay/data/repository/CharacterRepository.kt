package com.alexis.ec03_ay.data.repository

import com.alexis.ec03_ay.data.CharacterServiceResult
import com.alexis.ec03_ay.data.response.ListCharacterResponse
import com.alexis.ec03_ay.data.retrofit.RetrofitHelper

class CharacterRepository {
    suspend fun getCharacters(): CharacterServiceResult<ListCharacterResponse>{
        return try {
            val response = RetrofitHelper.characterService.getAllCharacters()
            CharacterServiceResult.Succes(response)
        }catch (e: Exception){
            CharacterServiceResult.Error(e)
        }

    }
}
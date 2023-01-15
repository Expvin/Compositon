package com.example.compositon.domain.usecases


import com.example.compositon.domain.repostiory.GameRepository

class GetGameSettingsUseCase(private val repository: GameRepository) {

    operator fun invoke(maxSumValue: Int) = repository.generateQuestions(maxSumValue, COUNT_OF_OPTIONS)

    private companion object {
        private const val COUNT_OF_OPTIONS = 6
    }
}
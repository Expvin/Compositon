package com.example.compositon.domain.usecases

import com.example.compositon.domain.entity.Level
import com.example.compositon.domain.repostiory.GameRepository

class GenerateQuestionUseCase(private val repository: GameRepository) {

    operator fun invoke(level: Level) = repository.getGameSettings(level)
}
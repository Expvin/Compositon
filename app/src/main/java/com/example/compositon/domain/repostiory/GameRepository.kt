package com.example.compositon.domain.repostiory

import com.example.compositon.domain.entity.GameSettings
import com.example.compositon.domain.entity.Level
import com.example.compositon.domain.entity.Question

interface GameRepository {
    fun generateQuestions(maxSumValue: Int, countOfOptions: Int): Question
    fun getGameSettings(level: Level): GameSettings
}
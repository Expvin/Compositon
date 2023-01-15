package com.example.compositon.domain.entity

data class GameSettings(
    val maxSumValue: Int,
    val minCountOfRightAnswers: Int,
    val minPresentOfRightAnswers: Int,
    val gameTimeInSeconds: Int)
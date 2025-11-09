package com.ZoTa.pilot.Question

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable
import com.ZoTa.pilot.Question.Model.QuestionModel

@Composable
fun QuestionScreen(
    questions:List<QuestionModel>,
    onFinish:(finalscore:Int)->Unit,
    onBackClick:()->Unit
    ){}

@Preview
@Composable
fun QuestionScreenPreview() {
    val questions = listOf(
        QuestionModel(
            id = 1,
            question = "What is the capital of France?",
            answer_1 = "Berlin",
            answer_2 = "Madrid",
            answer_3 = "Paris",
            answer_4 = "Rome",
            correctAnswer = "Paris",
            score = 10,
            picPath = null,
            clickedAnswer = null
        )
    )
    QuestionScreen(questions = questions, onFinish = {}, onBackClick = {})
}
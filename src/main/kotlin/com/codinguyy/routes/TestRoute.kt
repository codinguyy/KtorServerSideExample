package com.codinguyy.routes

import com.codinguyy.data.model.Jokes
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

private val jokes = listOf(
    Jokes("Meine Oma arbeitet beim FBI, deshalb nennen wir sie auch: Top Sigrid"),
    Jokes("Wie nennt man einen Waschbaer, der viel trainiert? - Waschmaschiene."),
)

fun Route.randomJoke() {
    get("/joke") {
        call.respond(
            HttpStatusCode.OK,
            jokes.random()
        )
    }
}


package com.codinguyy.routes

import com.codinguyy.data.model.Jokes
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

private val jokes = listOf(
    Jokes("Mama, darf ich die Schuessel auslecken? - Nein Kevin, du drückst die Spülung wie jeder andere auch!"),
    Jokes("Warum haben Frauen so kleine Füße? - Damit sie näher am Herd stehen können!"),
    Jokes("Warum scheint in Ethiopien immer die Sonne? - (...), weil die Kinder immer ihr Teller aufessen"),
    Jokes("Darf ich Ihnen den Stuhl vorschieben? - Gentleman fragt höflich nach Analverkehr"),
    Jokes("Warum scheint in Ethiopien immer die Sonne? - (...), weil die Kinder immer ihr Teller aufessen"),
    Jokes("Abgemacht ist abgemacht - Stefan, 42, Chirurg")
)

fun Route.randomJoke() {
    get("/joke") {
        call.respond(
            HttpStatusCode.OK,
            jokes.random()
        )
    }

}

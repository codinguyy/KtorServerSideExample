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
    Jokes("Abgemacht ist abgemacht - Stefan, 42, Chirurg"),
    Jokes("Meine Oma arbeitet beim FBI, deshalb nennen wir sie auch: Top Sigrid"),
    Jokes("Wie kannst du mit 14 schon schwanger sein? Chantal - 28, schimpft mit ihrer Tochter."),
    Jokes("Ein Tag mal abschalten und die Ruhe geniessen, Jochen - 55 - Pfleger auf der Intensivstation"),
    Jokes("Wie nennt man einen Waschbaer, der viel trainiert? - Waschmaschiene."),
    Jokes("Habe einem Hipster ins Bein geschossen - Jetzt hopst er."),
    Jokes("Was ist der Gott der Vegetarier? - Kraueterbuddah")
)


private val pickuplines = listOf(
    Jokes("Sag mir deinen Namen und ich sage dir wie du heisst"),
)

private val selfcare = listOf(
    Jokes("Nimm dich selber nicht zu ernst, verstehe Spass und lache ueber dich selbst"),
    Jokes("Sei nicht so streng mit dir selbst"),
)

fun Route.randomJoke() {
    get("/joke") {
        call.respond(
            HttpStatusCode.OK,
            jokes.random()
        )
    }
}

fun Route.randomPickupline() {
    get("/pickupline") {
        call.respond(
            HttpStatusCode.OK,
            pickuplines.random()
        )
    }
}

fun Route.randomSelfcareSayings() {
    get("/selfcare") {
        call.respond(
            HttpStatusCode.OK,
            pickuplines.random()
        )
    }
}

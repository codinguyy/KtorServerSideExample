package com.codinguyy.routes

import com.codinguyy.data.model.Jokes
import com.codinguyy.data.model.Meals
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*


private val meals = listOf(
    Meals(
        "Reis mit Hänchenbrust",
        listOf("Reis", "Brokkoli", "Hühnchenbrustfilet", "Champgnons", "Knoblauch", "Brathänchenwürzer", "Zwiebel")
    ),

    )

fun Route.getMeales() {
    get("/meals") {
        call.respond(
            HttpStatusCode.OK,
            meals.random()
        )
    }
}

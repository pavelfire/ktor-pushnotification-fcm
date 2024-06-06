package com.vk.plugins

import com.vk.sendNotification
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        sendNotification()
//        get("/") {
//            call.respondText("Hello World!")
//        }
    }
}

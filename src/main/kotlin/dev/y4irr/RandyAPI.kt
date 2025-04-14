package dev.y4irr

import com.google.gson.Gson
import spark.Spark.*

/*
 * This project can't be redistributed without
 * authorization of the developer
 *
 * Project @ Randy-API
 * @author Yair Soto @ 2025
 * Date: month:04 - day:13
 */

fun main() {
    val authToken = "sexo-token-123"

    ipAddress("127.0.0.1")
    port(8080)

    before("/*") { request, response ->
        val token = request.headers("Authorization")
        if (token != "Bearer $authToken") {
            halt(401, Gson().toJson(mapOf("error" to "QUE TA ACHENDO MAMAPINGA GET OUT OF HERE!")))
        }
    }

    get("/ping") { _, response ->
        response.type("application/json")
        Gson().toJson(mapOf("pong" to true))
    }

    get("/status/:name") { req, res ->
        val name = req.params("name")
        res.type("application/json")

    }
}


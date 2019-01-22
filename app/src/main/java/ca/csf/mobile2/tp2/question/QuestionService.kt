package ca.csf.mobile2.tp2.question

import android.util.Log
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import org.androidannotations.annotations.Background
import org.androidannotations.annotations.EBean
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.jackson.JacksonConverterFactory
import retrofit2.http.GET
import retrofit2.http.POST
import java.io.IOException

@EBean(scope = EBean.Scope.Singleton)
class QuestionService {

    private val service : Service

    init {
        val jackson = ObjectMapper()
            .registerKotlinModule()

        val retrofit = Retrofit.Builder()
            .baseUrl("https://m2t2.csfpwmjv.tk/")
            .addConverterFactory(JacksonConverterFactory.create(jackson))
            .build()

        service = retrofit.create(Service::class.java)
    }

    @Background
    fun getRandomQuestion(onSuccess : (Question) -> Unit,
                          onConnectivityError : () -> Unit,
                          onServerError : () -> Unit) {
        try {
            val response = service.getRandomQuestion().execute()
            if(response.isSuccessful) {
                onSuccess(response.body()!!)
            } else {
                onServerError()
            }

        } catch (e : IOException) {
            onConnectivityError()
            Log.v("QUESTION SERVICE", e.toString())
        }
    }

    private interface Service {

        @GET("/api/v1/question/random")
        fun getRandomQuestion() : Call<Question>
    }
}
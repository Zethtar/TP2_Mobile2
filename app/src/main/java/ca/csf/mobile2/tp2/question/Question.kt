package ca.csf.mobile2.tp2.question

import com.fasterxml.jackson.annotation.JsonProperty
import org.androidannotations.annotations.*
import org.parceler.Parcel


@Parcel(Parcel.Serialization.BEAN)
data class Question(@JsonProperty("id") val id : String = "",
               @JsonProperty("text") val text : String = "",
               @JsonProperty("choice1") val choice1 : String = "",
               @JsonProperty("choice2") val choice2 : String = "",
               @JsonProperty("nbChoice1") val nbChoice1 : Int = 0,
               @JsonProperty("nbChoice2") val nbChoice2 : Int = 0) {

}
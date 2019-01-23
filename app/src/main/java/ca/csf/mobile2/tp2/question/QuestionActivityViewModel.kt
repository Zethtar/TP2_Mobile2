package ca.csf.mobile2.tp2.question

import android.databinding.BaseObservable
import android.databinding.Bindable
import ca.csf.mobile2.tp2.util.ViewModelProperty
import com.fasterxml.jackson.databind.ser.std.NumberSerializers
import org.parceler.Parcel
import org.parceler.ParcelConstructor

@Parcel(Parcel.Serialization.BEAN)
class QuestionActivityViewModel @ParcelConstructor constructor() : BaseObservable() {

    var question : Question by ViewModelProperty(Question(), this)
    private val totalAnswers get() = question.nbChoice1 + question.nbChoice2

    @get:Bindable
    var activityState : QuestionActivityState by ViewModelProperty(QuestionActivityState.Question, this)
    @get:Bindable
    val text get() = question.text
    @get:Bindable
    val choice1 get() = question.choice1
    @get:Bindable
    val choice2 get() = question.choice2
    @get:Bindable
    val nbChoice1 : String
        get() {
            return if (totalAnswers > 0)
                ((question.nbChoice1.toFloat() / totalAnswers.toFloat() * 100).toInt()).toString() + "%"
            else
                "0%"
        }

    @get:Bindable
    val nbChoice2 : String //TODO("Better this / remove")
        get() {
            return if (totalAnswers > 0)
                ((question.nbChoice2.toFloat() / totalAnswers.toFloat() * 100).toInt()).toString() + "%"
            else
                "0%"
    }
    @get:Bindable
    var isConnectivityError = true

    init {
    }
}
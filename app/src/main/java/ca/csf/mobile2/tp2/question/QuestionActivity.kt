package ca.csf.mobile2.tp2.question

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import ca.csf.mobile2.tp2.R
import org.androidannotations.annotations.EActivity
import org.androidannotations.annotations.ViewById
import org.w3c.dom.Text

@SuppressLint("Registered") //Reason : Generated by Android Annotations
@EActivity(R.layout.activity_question)
class QuestionActivity : AppCompatActivity() {

    @ViewById(R.id.choice1_button)
    protected lateinit var choice1Button : Button
    @ViewById(R.id.choice1_result_background)
    protected lateinit var choice1ResultBackground : View
    @ViewById(R.id.choice1_result_textview)
    protected lateinit var choice1ResultTextView : TextView
    @ViewById(R.id.choice1_textview)
    protected lateinit var choice1TextView: TextView

    @ViewById(R.id.choice2_button)
    protected lateinit var choice2Button: Button
    @ViewById(R.id.choice2_result_background)
    protected lateinit var choice2ResultBackground : View
    @ViewById(R.id.choice2_result_textview)
    protected lateinit var choice2ResultTextView : TextView
    @ViewById(R.id.choice2_textview)
    protected lateinit var choice2TextView: TextView

    @ViewById(R.id.error_imageview)
    protected lateinit var errorImageView : ImageView
    @ViewById(R.id.error_textview)
    protected lateinit var errorTextViewById : TextView
    @ViewById(R.id.retry_button)
    protected lateinit var retryButton : Button
    @ViewById(R.id.progressBar)
    protected lateinit var progressBar : ProgressBar
}

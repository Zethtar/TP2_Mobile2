package ca.csf.mobile2.tp2.question

import android.annotation.SuppressLint
import android.support.constraint.ConstraintLayout
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.*
import ca.csf.mobile2.tp2.R
import org.androidannotations.annotations.*
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
    protected lateinit var errorTextView : TextView
    @ViewById(R.id.retry_button)
    protected lateinit var retryButton : Button

    @ViewById(R.id.progressBar)
    protected lateinit var progressBar : ProgressBar
    @ViewById(R.id.toolbar)
    protected lateinit var toolbar : Toolbar

    protected lateinit var currentQuestion : Question

    @Bean
    protected lateinit var questionService: QuestionService

    @AfterViews
    protected fun afterViews() {

    }

    private fun getRandomQuestion() {

    }

    @UiThread
    protected fun onQuestionFound(question : Question) {

    }

    @UiThread
    protected fun onConnectivityError() {
        hideProgressBar()
        showError()
        errorTextView.setText(R.string.text_error_internet)
    }

    protected fun onServerError() {
        hideProgressBar()
        showError()
        errorTextView.setText(R.string.text_error_server)
    }

    private fun hideProgressBar() {
        progressBar.visibility = View.INVISIBLE
    }

    private fun showProgressBar() {
        progressBar.visibility = View.VISIBLE
    }

    private fun showQuestions() {
        choice1Button.visibility = View.VISIBLE
        choice2Button.visibility = View.VISIBLE

        toolbar.visibility = View.VISIBLE
    }

    private fun hideQuestions() {
        choice1Button.visibility = View.INVISIBLE
        choice2Button.visibility = View.INVISIBLE

        toolbar.visibility = View.INVISIBLE
    }

    private fun showResults() {
        choice1TextView.visibility = View.VISIBLE
        choice1ResultTextView.visibility = View.VISIBLE
        choice1ResultBackground.visibility = View.VISIBLE

        choice2TextView.visibility = View.VISIBLE
        choice2ResultTextView.visibility = View.VISIBLE
        choice2ResultBackground.visibility = View.VISIBLE

        toolbar.visibility = View.VISIBLE
    }

    private fun hideResults() {
        choice1TextView.visibility = View.INVISIBLE
        choice1ResultTextView.visibility = View.INVISIBLE
        choice1ResultBackground.visibility = View.INVISIBLE

        choice2TextView.visibility = View.INVISIBLE
        choice2ResultTextView.visibility = View.INVISIBLE
        choice2ResultBackground.visibility = View.INVISIBLE
    }

    private fun showError() {
        errorImageView.visibility = View.VISIBLE
        errorTextView.visibility = View.VISIBLE
        retryButton.visibility = View.VISIBLE

        toolbar.visibility = View.INVISIBLE
    }

    private fun hideError() {
        errorImageView.visibility = View.INVISIBLE
        errorTextView.visibility = View.INVISIBLE
        retryButton.visibility = View.INVISIBLE
    }
}

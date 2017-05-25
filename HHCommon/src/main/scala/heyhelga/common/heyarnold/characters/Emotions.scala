package heyhelga.common.heyarnold.characters

sealed trait EmotionalState

object EmotionalState {

	case object UnusuallyHappy extends EmotionalState
	case object Normal extends EmotionalState
	case object Intense extends EmotionalState

}


trait Emotions {

	def currentEmotionalState: EmotionalState = EmotionalState.Normal

}

package heyhelga.common.heyarnold.characters

abstract class HelgasMomProto extends Person { // todo try inheritance

	override val firstName = "Merriam"

	private def say(something: String)(sb: StringBuilder): StringBuilder = {
		sb.append(s"""$firstName - dazed and confused, murmurs "$something"""")
	}

	override def startTheDay(sb: StringBuilder): StringBuilder = {
		say("Wha? Where am I? Where am I?")(sb)
	}

	override def sayGoodnight(sb: StringBuilder): StringBuilder = {
		say("Okay, night night.")(sb)
	}

}


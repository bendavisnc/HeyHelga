package heyhelga.common.heyarnold.characters

abstract class BrainyProto extends Person {

	override val firstName = "Brainy"

	private def breatheLoudly(context: String)(sb: StringBuilder): StringBuilder = {
		sb.append(s"""$firstName - $context: <Breathes loudly.>""")
	}

	private def wakeUp(sb: StringBuilder): StringBuilder = {
		breatheLoudly("waking up")(sb)
	}

	private def fallAsleep(sb: StringBuilder): StringBuilder = {
		breatheLoudly("falling asleep")(sb)
	}

	override def bumpInto(other: Person)(sb: StringBuilder): StringBuilder = {
		breatheLoudly("out of no where")(sb)
	}

	override def startTheDay(sb: StringBuilder): StringBuilder = {
		wakeUp(sb)
	}

	override def sayGoodnight(sb: StringBuilder): StringBuilder = {
		fallAsleep(sb)
	}

}

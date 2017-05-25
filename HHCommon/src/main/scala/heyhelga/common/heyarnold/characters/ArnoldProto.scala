package heyhelga.common.heyarnold.characters

abstract class ArnoldProto extends Person {

	override val firstName = "Arnold"

	private def apologize(subject: Person)(sb: StringBuilder): StringBuilder = {
		sb.append(s"""$firstName - earnest and apologetic: "Parden me, ${subject.firstName}"""")
	}

	override def bumpInto(other: Person)(sb: StringBuilder): StringBuilder = {
		apologize(other)(sb)
	}
}


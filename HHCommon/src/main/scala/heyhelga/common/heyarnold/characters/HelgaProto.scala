package heyhelga.common.heyarnold.characters

import heyhelga.common.heyarnold.items.{ItemsIncludedProto, snacks}

abstract class HelgaProto extends Person with Emotions {

	this: ItemsIncludedProto =>

	override val firstName = "Helga"

	private def shoutAtAngrily(message: String)(sb: StringBuilder): StringBuilder = {
		sb.append(s"""$firstName - angry and annoyed, shouts "$message"""")
	}

	private def respondCasually(message: String)(sb: StringBuilder): StringBuilder = {
		sb.append(s"""$firstName - unusually relaxed, says "$message"""")
	}

	private def wakeUpAndPonder(thought: String)(sb: StringBuilder): StringBuilder = {
		sb.append(s"""$firstName - wakes up and ponders "$thought"""")
	}

	private def fallAsleepAndWonder(thought: String)(sb: StringBuilder) = {
		sb.append(s"""$firstName - while falling asleep, wonders "$thought"""")
	}

	private def sockEm(victim: Person)(sb: StringBuilder): StringBuilder = {
		sb.append(s"""$firstName - <punches ${victim.firstName} on the nose.>""")
	}

	override def currentEmotionalState: EmotionalState = {
		this.snack match {
			case snacks.PorkRinds => EmotionalState.UnusuallyHappy
			case fudgeSicle: snacks.FudgeSicleProto => {
				if (fudgeSicle.isHalfMelted) EmotionalState.Intense else EmotionalState.UnusuallyHappy
			}
			case _ => EmotionalState.Normal
		}

	}

	override def bumpInto(other: Person)(sb: StringBuilder): StringBuilder = {
		other match {
			case  arnold: ArnoldProto => shoutAtAngrily("Move it football head!")(sb)
			case  brainy: BrainyProto => sockEm(other)(sb)
			case  helgasMom: HelgasMomProto => this.currentEmotionalState match {
				case EmotionalState.UnusuallyHappy => respondCasually("Parden me, mother.")(sb)
				case EmotionalState.Normal => shoutAtAngrily("Move it! Mother!")(sb)
				case EmotionalState.Intense => shoutAtAngrily("Outta my way you negation to humanity!")(sb)
			}
			case _ => shoutAtAngrily("Out of my way bucko!")(sb)
		}
	}

	override def startTheDay(sb: StringBuilder): StringBuilder = {
		wakeUpAndPonder(
		"""|Each morn, I see you bend to drink,
       |From love's own crystal pool.
			 |I tremble near you, try to think.
			 |Will I forever say, "You stink"?
			 |Am I bound by this tragic rule?""".stripMargin)(sb)
	}

	override def sayGoodnight(sb: StringBuilder): StringBuilder = {
		fallAsleepAndWonder(
		"""|Arnold my love,
       |My sultry preteen,
       |Why must I hold you
       |only whilst I dream?
       |Will I be forever enslaved by your spell?
       |Why must I worship you and never ever tell?
       |Arnold, you make my girlhood tremble,
       |My senses all go wacky.
       |Someday, I'll tell the world, my love...
       |Or my name's not Helga G. Pataki!""".stripMargin)(sb)
	}

}


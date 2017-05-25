package heyhelga.common.heyarnold.episode

import heyhelga.common.heyarnold.EverythingIncludedProto
import heyhelga.common.heyarnold.characters.Person


trait SuperShortEpisodeProto extends Episode {

	this: EverythingIncludedProto =>

	override def script: String = {
		this.sessionStringBuilder.append("ACT ONE")
		this.sessionStringBuilder.append("\n")
		this.sessionStringBuilder.append("\n")
		for (character: Person <- this.mainCharacter :: this.secondaryCharacter :: Nil) {
			character.startTheDay(this.sessionStringBuilder)
			this.sessionStringBuilder.append("\n")
			this.sessionStringBuilder.append("\n")
		}

		this.sessionStringBuilder.append("ACT TWO")
		this.sessionStringBuilder.append("\n")
		this.sessionStringBuilder.append("\n")
		this.mainCharacter.bumpInto(this.secondaryCharacter)(this.sessionStringBuilder)
		this.sessionStringBuilder.append("\n")
		this.sessionStringBuilder.append("\n")

		this.sessionStringBuilder.append("ACT THREE")
		this.sessionStringBuilder.append("\n")
		this.sessionStringBuilder.append("\n")
		for (character: Person <- this.mainCharacter :: this.secondaryCharacter :: Nil) {
			character.sayGoodnight(this.sessionStringBuilder)
			this.sessionStringBuilder.append("\n")
			this.sessionStringBuilder.append("\n")
		}

		this.sessionStringBuilder.toString
	}
}

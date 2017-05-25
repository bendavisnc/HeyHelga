package heyhelga.common.heyarnold.characters


trait Person {

	val firstName: String

	def bumpInto(other: Person)(sb: StringBuilder): StringBuilder = {
		throw new RuntimeException(s"bumpInto not implemented for $firstName")
	}

	def startTheDay(sb: StringBuilder): StringBuilder = {
		throw new RuntimeException(s"startTheDay not implemented for $firstName")
	}

	def sayGoodnight(sb: StringBuilder): StringBuilder = {
		throw new RuntimeException(s"sayGoodnight not implemented for $firstName")
	}

}


package heyhelga.heyarnold.episode

import heyhelga.common.heyarnold.characters.Person
import heyhelga.common.heyarnold.episode.CastRequirementsIncludedProto
import heyhelga.scaldi.moduleincluded.DynamicModuleIncluded

trait CastRequirementsIncluded extends CastRequirementsIncludedProto with DynamicModuleIncluded {

	import scaldi.Injectable._

	val mainCharacter: Person = inject[Person]('mainCharacter)
	val secondaryCharacter: Person = inject[Person]('secondaryCharacter)
}

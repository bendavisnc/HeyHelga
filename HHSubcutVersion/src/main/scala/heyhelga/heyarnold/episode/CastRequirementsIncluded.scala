package heyhelga.heyarnold.episode

import com.escalatesoft.subcut.inject.Injectable
import heyhelga.common.heyarnold.characters.Person
import heyhelga.common.heyarnold.episode.CastRequirementsIncludedProto
import heyhelga.subcut.moduleincluded.DynamicModuleIncluded

trait CastRequirementsIncluded extends CastRequirementsIncludedProto with DynamicModuleIncluded with Injectable {

	val mainCharacter: Person = inject[Person]('mainCharacter)
	val secondaryCharacter: Person = inject[Person]('secondaryCharacter)

}

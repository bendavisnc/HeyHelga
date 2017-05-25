package heyhelga.heyarnold.episode

import com.google.inject.Inject
import com.google.inject.name.Named
import heyhelga.common.heyarnold.characters.Person
import heyhelga.common.heyarnold.episode.CastRequirementsIncludedProto

trait CastRequirementsIncluded extends CastRequirementsIncludedProto {

	@Inject
	@Named("mainCharacter")
	var mainCharacter: Person = null

	@Inject
	@Named("secondaryCharacter")
	var secondaryCharacter: Person = null


}

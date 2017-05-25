package heyhelga.app.episodes

import com.escalatesoft.subcut.inject
import com.escalatesoft.subcut.inject.{MutableBindingModule, NewBindingModule, BindingModule}
import heyhelga.common.heyarnold.characters
import heyhelga.common.heyarnold.episode.Episode
import heyhelga.common.heyarnold.items.snacks
import heyhelga.heyarnold.characters.{HelgasMom, Helga}
import heyhelga.heyarnold.episode.SuperShortEpisode
import heyhelga.heyarnold.items.snacks.FudgeSicle

object FirstEpisodeSpecifics extends NewBindingModule (
	(module: MutableBindingModule) => {

		module.bind[characters.Person].identifiedBy('mainCharacter).toSingle(Helga)
		module.bind[characters.Person].identifiedBy('secondaryCharacter).toSingle(HelgasMom)
		module.bind[snacks.Snack].toSingle(FudgeSicle)
		module.bind[Boolean].identifiedBy('isHalfMelted).toSingle(true)
		module.bind[String].identifiedBy('title).toSingle("A Pataki Palooza")
		module.bind[StringBuilder].toSingle(new StringBuilder)
		module.bind[Episode].to(inject.newInstanceOf[SuperShortEpisode])
}
)


package heyhelga.app.episodes

import com.escalatesoft.subcut.inject
import com.escalatesoft.subcut.inject.{MutableBindingModule, NewBindingModule, BindingModule}
import heyhelga.common.heyarnold.characters
import heyhelga.common.heyarnold.episode.Episode
import heyhelga.common.heyarnold.items.snacks
import heyhelga.common.heyarnold.items.snacks.PorkRinds
import heyhelga.heyarnold.characters.{Brainy, HelgasMom, Helga}
import heyhelga.heyarnold.episode.SuperShortEpisode
import heyhelga.heyarnold.items.snacks.FudgeSicle

object SecondEpisodeSpecifics extends NewBindingModule (
	(module: MutableBindingModule) => {

		module.bind[characters.Person].identifiedBy('mainCharacter).toSingle(Helga)
		module.bind[characters.Person].identifiedBy('secondaryCharacter).toSingle(Brainy)
		module.bind[snacks.Snack].toSingle(PorkRinds)
		module.bind[String].identifiedBy('title).toSingle("Helga's Stalker")
		module.bind[StringBuilder].toSingle(new StringBuilder)
		module.bind[Episode].to(inject.newInstanceOf[SuperShortEpisode])
	}
)

package heyhelga.app.episodes

import heyhelga.common.heyarnold.characters
import heyhelga.common.heyarnold.episode.Episode
import heyhelga.common.heyarnold.items.snacks
import heyhelga.heyarnold.characters.{HelgasMom, Helga}
import heyhelga.heyarnold.episode.SuperShortEpisode
import heyhelga.heyarnold.items.snacks.FudgeSicle
import scaldi.Module

object FirstEpisodeSpecifics extends Module {

	bind[characters.Person].as('mainCharacter).to(Helga)
	bind[characters.Person].as('secondaryCharacter).to(HelgasMom)
	bind[snacks.Snack].to(FudgeSicle)
	bind[Boolean].as('isHalfMelted).to(true)
	bind[String].as('title).to("A Pataki Palooza")
	bind[StringBuilder].to(new StringBuilder)
	bind[Episode].to(injected[SuperShortEpisode])

}

package heyhelga.app.episodes

import heyhelga.common.heyarnold.characters
import heyhelga.common.heyarnold.episode.Episode
import heyhelga.common.heyarnold.items.snacks
import heyhelga.common.heyarnold.items.snacks.PorkRinds
import heyhelga.heyarnold.characters.{Brainy, HelgasMom, Helga}
import heyhelga.heyarnold.episode.SuperShortEpisode
import heyhelga.heyarnold.items.snacks.FudgeSicle
import scaldi.Module

object SecondEpisodeSpecifics extends Module {

	bind[characters.Person].as('mainCharacter).to(Helga)
	bind[characters.Person].as('secondaryCharacter).to(Brainy)
	bind[snacks.Snack].to(PorkRinds)
	bind[String].as('title).to("Helga's Stalker")
	bind[StringBuilder].to(new StringBuilder)
	bind[Episode].to(injected[SuperShortEpisode])

}
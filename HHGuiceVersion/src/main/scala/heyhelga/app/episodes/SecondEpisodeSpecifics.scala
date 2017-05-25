package heyhelga.app.episodes

import com.google.inject.AbstractModule
import com.google.inject.name.Names
import heyhelga.common.heyarnold.characters
import heyhelga.common.heyarnold.items.snacks
import heyhelga.common.heyarnold.items.snacks.PorkRinds
import heyhelga.heyarnold.characters.{Brainy, Helga}

object SecondEpisodeSpecifics extends AbstractModule {

	override def configure(): Unit = {

		this.bind(classOf[characters.Person])
			.annotatedWith(Names.named("mainCharacter"))
			.toInstance(Helga)

		this.bind(classOf[characters.Person])
			.annotatedWith(Names.named("secondaryCharacter"))
			.toInstance(Brainy)

		this.bind(classOf[snacks.Snack]).toInstance(PorkRinds)

		this.bind(classOf[String])
			.annotatedWith(Names.named("title"))
			.toInstance("Helga's Stalker")

		this.bind(classOf[StringBuilder])
			.toInstance(new StringBuilder)
	}

}

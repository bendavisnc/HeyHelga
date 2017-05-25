package heyhelga.app.episodes

import com.google.inject.AbstractModule
import com.google.inject.name.Names
import heyhelga.common.heyarnold.characters
import heyhelga.common.heyarnold.items.snacks
import heyhelga.heyarnold.characters.{HelgasMom, Helga}
import heyhelga.heyarnold.items.snacks.FudgeSicle

object FirstEpisodeSpecifics extends AbstractModule {

	override def configure(): Unit = {

		this.bind(classOf[characters.Person])
			.annotatedWith(Names.named("mainCharacter"))
			.toInstance(Helga)

		this.bind(classOf[characters.Person])
			.annotatedWith(Names.named("secondaryCharacter"))
			.toInstance(HelgasMom)

		this.bind(classOf[snacks.Snack]).toInstance(FudgeSicle)

		this.bind(classOf[Boolean])
			.annotatedWith(Names.named("isHalfMelted"))
//			.toInstance(false)
			.toInstance(true)

		this.bind(classOf[String])
			.annotatedWith(Names.named("title"))
			.toInstance("A Pataki Palooza")

		this.bind(classOf[StringBuilder])
			.toInstance(new StringBuilder)

	}


}

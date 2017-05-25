package heyhelga.app

import com.google.inject.Guice
import heyhelga.common.HeyHelgaAppProto
import heyhelga.heyarnold.episode.SuperShortEpisode

object HeyHelgaApp extends HeyHelgaAppProto {

	override def firstEpisode = {
		Guice.createInjector(episodes.FirstEpisodeSpecifics)
			.getInstance(classOf[SuperShortEpisode])
	}

	override def secondEpisode = {
		Guice.createInjector(episodes.SecondEpisodeSpecifics)
			.getInstance(classOf[SuperShortEpisode])
	}

	override def main (args: Array[String]) {
		import timeutil.Time.time
		time {super.main(args)}
	}

}

package heyhelga.app

import heyhelga.common.HeyHelgaAppProto
import heyhelga.common.heyarnold.episode.Episode
import heyhelga.heyarnold.episode.SuperShortEpisode
import heyhelga.scaldi.moduleincluded.DynamicModuleIncluded

object HeyHelgaApp extends HeyHelgaAppProto with DynamicModuleIncluded {

	import scaldi.Injectable._

	override def firstEpisode = {
		DynamicModuleIncluded.set(episodes.FirstEpisodeSpecifics)
		inject[Episode]
	}

	override def secondEpisode = {
		DynamicModuleIncluded.set(episodes.SecondEpisodeSpecifics)
		inject[Episode]
	}

}

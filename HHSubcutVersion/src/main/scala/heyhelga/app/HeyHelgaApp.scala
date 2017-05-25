package heyhelga.app

import com.escalatesoft.subcut.inject.Injectable
import heyhelga.common.HeyHelgaAppProto
import heyhelga.common.heyarnold.episode.Episode
import heyhelga.subcut.moduleincluded.DynamicModuleIncluded

object HeyHelgaApp extends HeyHelgaAppProto with DynamicModuleIncluded with Injectable {


	override def firstEpisode = {
		DynamicModuleIncluded.set(episodes.FirstEpisodeSpecifics)
		inject[Episode]
	}

	override def secondEpisode = {
		DynamicModuleIncluded.set(episodes.SecondEpisodeSpecifics)
		inject[Episode]
	}

}

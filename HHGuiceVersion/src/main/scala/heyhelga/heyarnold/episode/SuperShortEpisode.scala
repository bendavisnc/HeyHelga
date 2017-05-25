package heyhelga.heyarnold.episode

import com.google.inject.Inject
import com.google.inject.name.Named
import heyhelga.common.heyarnold.episode.SuperShortEpisodeProto
import heyhelga.heyarnold.EverythingIncluded

class SuperShortEpisode extends SuperShortEpisodeProto with EverythingIncluded {

	@Inject
	@Named("title")
	var title: String = null

}



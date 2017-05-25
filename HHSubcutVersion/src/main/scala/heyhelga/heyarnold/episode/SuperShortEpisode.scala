package heyhelga.heyarnold.episode

import com.escalatesoft.subcut.inject.Injectable
import heyhelga.common.heyarnold.episode.SuperShortEpisodeProto
import heyhelga.heyarnold.EverythingIncluded
import heyhelga.subcut.moduleincluded.DynamicModuleIncluded

class SuperShortEpisode extends SuperShortEpisodeProto with EverythingIncluded with Injectable with DynamicModuleIncluded {

	val title: String = inject[String]('title)


}



package heyhelga.heyarnold.episode

import heyhelga.common.heyarnold.characters.Person
import heyhelga.common.heyarnold.episode.SuperShortEpisodeProto
import heyhelga.heyarnold.EverythingIncluded
import heyhelga.scaldi.moduleincluded.DynamicModuleIncluded

class SuperShortEpisode extends SuperShortEpisodeProto with EverythingIncluded with DynamicModuleIncluded {

	import scaldi.Injectable._

	val title: String = inject[String]('title)


}



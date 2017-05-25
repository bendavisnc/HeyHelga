package heyhelga.heyarnold

import heyhelga.common.heyarnold.EverythingIncludedProto
import heyhelga.heyarnold.episode.CastRequirementsIncluded
import heyhelga.heyarnold.items.ItemsIncluded

trait EverythingIncluded extends EverythingIncludedProto with CastRequirementsIncluded with ItemsIncluded {

	val sessionStringBuilder: StringBuilder = inject[StringBuilder]

}

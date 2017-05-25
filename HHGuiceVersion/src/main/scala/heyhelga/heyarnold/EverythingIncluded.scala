package heyhelga.heyarnold

import com.google.inject.Inject
import heyhelga.common.heyarnold.EverythingIncludedProto
import heyhelga.heyarnold.episode.CastRequirementsIncluded
import heyhelga.heyarnold.items.ItemsIncluded

trait EverythingIncluded extends EverythingIncludedProto with CastRequirementsIncluded with ItemsIncluded {

	@Inject
	var sessionStringBuilder: StringBuilder = null

}

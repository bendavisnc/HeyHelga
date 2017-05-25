package heyhelga.common.heyarnold

import heyhelga.common.heyarnold.episode.CastRequirementsIncludedProto
import heyhelga.common.heyarnold.items.ItemsIncludedProto


trait EverythingIncludedProto extends CastRequirementsIncludedProto with ItemsIncludedProto {

	def sessionStringBuilder: StringBuilder

}



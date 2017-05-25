package heyhelga.heyarnold.items.snacks

import com.escalatesoft.subcut.inject.Injectable
import heyhelga.common.heyarnold.items.snacks.FudgeSicleProto
import heyhelga.subcut.moduleincluded.DynamicModuleIncluded

case object FudgeSicle extends FudgeSicleProto with DynamicModuleIncluded with Injectable {

	val isHalfMelted: Boolean = inject[Boolean]('isHalfMelted)
}


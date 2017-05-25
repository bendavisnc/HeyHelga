package heyhelga.scaldi.moduleincluded

import scaldi.Module

trait DynamicModuleIncluded extends ModuleIncluded {

	import DynamicModuleIncluded._

	override implicit def module: Module = {
		dynamicModule.getOrElse(
			throw new RuntimeException("No dynamic module set")
		)
	}

}

object DynamicModuleIncluded {

	private var dynamicModule: Option[Module] = None

	def set(m: Module) = {
		this.dynamicModule = Option(m)
	}
}



package heyhelga.subcut.moduleincluded

import com.escalatesoft.subcut.inject.BindingModule

trait DynamicModuleIncluded extends ModuleIncluded {

	import DynamicModuleIncluded._

	override implicit def bindingModule: BindingModule = {
		dynamicModule.getOrElse(
			throw new RuntimeException("No dynamic module set")
		)
	}

}

object DynamicModuleIncluded {

	private var dynamicModule: Option[BindingModule] = None

	def set(m: BindingModule) = {
		this.dynamicModule = Option(m)
	}
}



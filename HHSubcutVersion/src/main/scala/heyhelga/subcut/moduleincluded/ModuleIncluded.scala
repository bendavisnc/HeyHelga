package heyhelga.subcut.moduleincluded

import com.escalatesoft.subcut.inject.BindingModule

trait ModuleIncluded {

	implicit def bindingModule: BindingModule

}

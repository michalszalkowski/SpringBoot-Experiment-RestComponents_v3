package pl.btbw.core.product.core.roles;

import pl.btbw.core.common.output.Component;
import pl.btbw.core.common.output.ComponentProvider;
import pl.btbw.core.common.output.Mappable;

import java.util.List;

public class ComponentProviderWrapper extends ComponentProvider {

	private List<String> componentsAllowed;

	public ComponentProviderWrapper(List<String> componentsAllowed, Mappable entity) {
		super(entity);
		this.componentsAllowed = componentsAllowed;
	}

	public ComponentProviderWrapper add(Component component) {
		if (componentsAllowed.contains(component.getNameComponent())) {
			super.add(component);
		}
		return this;
	}
}

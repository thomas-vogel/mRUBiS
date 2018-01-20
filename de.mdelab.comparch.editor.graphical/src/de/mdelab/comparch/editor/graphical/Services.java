package de.mdelab.comparch.editor.graphical;

import java.util.Collection;
import java.util.LinkedList;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

import de.mdelab.comparch.AdaptationStrategy;
import de.mdelab.comparch.ArchitecturalElement;
import de.mdelab.comparch.ComponentType;
import de.mdelab.comparch.ConcernedElement;
import de.mdelab.comparch.Impact;
import de.mdelab.comparch.InputParameter;
import de.mdelab.comparch.Interface;
import de.mdelab.comparch.InterfaceType;
import de.mdelab.comparch.Issue;
import de.mdelab.comparch.MonitoredProperty;
import de.mdelab.comparch.PerformanceStats;
import de.mdelab.comparch.Tenant;
import de.mdelab.comparch.WorkingData;

/**
 * The services class used by the editor.
 * 
 * @author thomas vogel
 * @version 0.1
 */
public class Services {

	// /**
	// * See
	// *
	// http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24
	// * for documentation on how to write service methods.
	// */
	// public EObject myService(EObject self, String arg) {
	// return self;
	// }

	public Collection<InterfaceType> getAllInterfaceTypes(ComponentType componentType) {
		return componentType.getArchitecture().getInterfaceTypes();
	}

	public Collection<ComponentType> getAllComponentTypes(Tenant tenant) {
		return tenant.getArchitecture().getComponentTypes();
	}

	public String getMonitoredElements(MonitoredProperty property) {
		StringBuffer sb = new StringBuffer();
		sb.append(property.getArchitecturalElement().toString());
		return sb.toString();
	}

	public String getRelatedMonitoredElements(MonitoredProperty property) {
		StringBuffer sb = new StringBuffer();
		for (ArchitecturalElement elem : property.getRelatedArchitecturalElements()) {
			sb.append(elem.toString() + "\n\n");
		}
		return sb.toString();
	}

	public Collection<Issue> getAllIssues(Tenant tenant) {
		Collection<Issue> result = new LinkedList<Issue>();
		TreeIterator<EObject> eObjects = tenant.eAllContents();
		while (eObjects.hasNext()) {
			EObject eObject = eObjects.next();
			if (eObject instanceof ArchitecturalElement) {
				ArchitecturalElement elem = (ArchitecturalElement) eObject;
				for (Impact impact : elem.getIssueImpacts()) {
					result.add(impact.getIssue());
				}
			}
		}
		return result;
	}

	public String getImpactedElements(Issue issue) {
		StringBuffer sb = new StringBuffer();
		for (Impact impact : issue.getImpacts()) {
			sb.append("Impact Type: " + impact.getType() + "\n");
			if (impact.getName() != null) {
				sb.append("Impact Name: " + impact.getName() + "\n");
			}
			ArchitecturalElement element = impact.getArchitecturalElement();
			sb.append("Architectural Element: " + element.toString());
			sb.append("\n\n");
		}
		return sb.toString();
	}

	public String getAssignedAdaptationStrategies(Issue issue) {
		StringBuffer sb = new StringBuffer();
		for (AdaptationStrategy strategy : issue.getAssignedAdaptationStrategies()) {
			sb.append(strategy.toString() + "\n\n");
		}
		return sb.toString();
	}

	public Collection<WorkingData> getAllWorkingData(Tenant tenant) {
		Collection<WorkingData> result = new LinkedList<WorkingData>();
		TreeIterator<EObject> eObjects = tenant.eAllContents();
		while (eObjects.hasNext()) {
			EObject eObject = eObjects.next();
			if (eObject instanceof ArchitecturalElement) {
				ArchitecturalElement elem = (ArchitecturalElement) eObject;
				for (ConcernedElement concern : elem.getWorkingDataElements()) {
					result.add(concern.getWorkingdata());
				}
			}
		}
		return result;
	}

	public String getConcernedElements(WorkingData data) {
		StringBuffer sb = new StringBuffer();
		for (ConcernedElement concern : data.getConcernedElements()) {
			sb.append("Concern Type: " + concern.getType() + "\n");
			if (concern.getName() != null) {
				sb.append("Concern Name: " + concern.getName() + "\n");
			}
			ArchitecturalElement element = concern.getArchitecturalElement();
			sb.append("Architectural Element: " + element.toString());
			sb.append("\n\n");
		}
		return sb.toString();
	}

	public Collection<AdaptationStrategy> getAllAdaptationStrategies(Tenant tenant) {
		System.out.println(tenant.getName());
		Collection<AdaptationStrategy> result = new LinkedList<AdaptationStrategy>();
		TreeIterator<EObject> eObjects = tenant.eAllContents();
		while (eObjects.hasNext()) {
			EObject eObject = eObjects.next();
			if (eObject instanceof ArchitecturalElement) {
				ArchitecturalElement elem = (ArchitecturalElement) eObject;
				for (InputParameter param : elem.getStrategyInputs()) {
					result.add(param.getAdaptationStrategy());
				}
			}
		}
		System.out.println(result.size());
		return result;
	}

	public String getInputElements(AdaptationStrategy strategy) {
		StringBuffer sb = new StringBuffer();
		for (InputParameter param : strategy.getInputParameters()) {
			sb.append(param.getArchitecturalElement().toString() + "\n\n");
		}
		return sb.toString();
	}

	public String getAssignedIssues(AdaptationStrategy strategy) {
		StringBuffer sb = new StringBuffer();
		for (Issue issue : strategy.getAssignedIssues()) {
			sb.append(issue.toString() + "\n\n");
		}
		return sb.toString();
	}

	public String getUnqualifiedInterfaceName(Interface interfaze) {
		String fqName = interfaze.getType().getFqName();
		if (fqName.indexOf(".") == -1) {
			return fqName;
		} else {
			return fqName.substring(fqName.lastIndexOf(".") + 1);
		}
	}

	public String getUnqualifiedMethodName(PerformanceStats stats) {
		String signature = stats.getMethod().getSignature();
		return signature.substring(0, signature.indexOf("("));
	}

}

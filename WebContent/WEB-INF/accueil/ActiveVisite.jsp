<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@taglib uri="http://struts.apache.org/tags-nested" prefix="nested" %>

<% int i = 1; %>
<logic:present name="ajax"> 
					<thead>
					<tr role="row">
						<th style="width: 253px;" colspan="1" rowspan="1" role="columnheader" class="ui-state-default headTable">
							ID Patient
						</th>
						<th style="width: 253px;" colspan="1" rowspan="1" role="columnheader" class="ui-state-default headTable">
							Nom Complet
						</th>
						<th style="width: 62px;" colspan="1" rowspan="1" role="columnheader" class="ui-state-default headTable">
							Service
						</th>
						<th style="width: 253px;" colspan="1" rowspan="1" role="columnheader" class="ui-state-default headTable">
							Dernière Visite
						</th>
					</tr>
					</thead>
					<tbody aria-relevant="all" aria-live="polite" role="alert">
	<logic:iterate id="patient" name="ajax">
						<tr class="<%=(i % 2==0)?"even":"odd" %>" id="visit-603">
							<td><bean:write name="patient" property="ipp"/></td>
							<td>
								<a href="SearchAction.do?id=${patient.id }">
									<bean:write name="patient" property="nom"/> 
									<bean:write name="patient" property="prenom"/>
								</a>
							</td>
							<td>
								<bean:write name="patient" property="last.service.nom"/>
							<td>
								<bean:write name="patient" property="last.type"/> 
								@ <bean:write name="patient" property="last.date_debut"/>
							</td>
						</tr>
					<% i++; %>
	</logic:iterate>
					</tbody>
</logic:present>
<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1" --%>
<%--     pageEncoding="ISO-8859-1"%> --%>
<%-- <%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%> --%>
<%-- <%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> --%>
<%-- <%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %> --%>
<%-- <%@taglib uri="http://struts.apache.org/tags-nested" prefix="nested" %> --%>

<%-- <logic:present name="ajax">  --%>
<!-- 		<tr> -->
<!-- 			<th>Identifiant</th> -->
<!-- 			<th>Nom Complet</th> -->
<!-- 			<th>Sexe</th> -->
<!-- 			<th>Age</th> -->
<!-- 			<th>Date naissance</th> -->
<!-- 		</tr> -->
<%-- 		<logic:iterate id="patient" name="ajax"> --%>
<%-- 		<tr onclick="window.location='SearchAction.do?id=${patient.id }'"> --%>
<%-- 			<td><bean:write name="patient" property="ipp"/></td> --%>
<%-- 			<td><bean:write name="patient" property="nom"/> <bean:write name="patient" property="prenom"/></td> --%>
<%-- 			<td><bean:write name="patient" property="age"/></td> --%>
<%-- 			<td><bean:write name="patient" property="date_naissance"/></td> --%>
<!-- 		</tr> -->
<%-- 		</logic:iterate> --%>
<%-- </logic:present> --%>

<%-- 		<logic:iterate id="patient" name="ajax"> 
			<a href="#" class="record"><div class="con_record"><bean:write name="patient" property="ipp"/></div></a>
			<a href="#" class="record"><div class="con_record"><bean:write name="patient" property="nom"/> <bean:write name="patient" property="prenom"/></div></a>
			<a href="#" class="record"><div class="con_record"><bean:write name="patient" property="age"/></div></a>
			<a href="#" class="record"><div class="con_record"><bean:write name="patient" property="date_naissance"/></div></a>
		</logic:iterate>--%>
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
							Sexe
						</th>
						<th style="width: 62px;" colspan="1" rowspan="1" role="columnheader" class="ui-state-default headTable">
							Age
						</th>
						<th style="width: 253px;" colspan="1" rowspan="1" role="columnheader" class="ui-state-default headTable">
							Date naissance
						</th>
					</tr>
					</thead>
					<tbody aria-relevant="all" aria-live="polite" role="alert">
	<logic:iterate id="patient" name="ajax">
						<tr class="<%=(i % 2==0)?"even":"odd" %>" id="visit-603" onclick="window.location='SearchAction.do?id=${patient.id }'">
							<td><bean:write name="patient" property="ipp"/></td>
							<td>
								
									<bean:write name="patient" property="nom"/> 
									<bean:write name="patient" property="prenom"/>
								
							</td>
							<td>
								<bean:write name="patient" property="sexe"/>
							<td>
								<bean:write name="patient" property="age"/> 
							</td>
							<td>
								<bean:write name="patient" property="date_naissance"/>
							</td>
						</tr>
					<% i++; %>
	</logic:iterate>
					</tbody>
</logic:present>

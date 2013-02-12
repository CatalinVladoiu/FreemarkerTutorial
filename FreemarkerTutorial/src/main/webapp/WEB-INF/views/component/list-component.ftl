<table>
	<tr>
		<td>
			<label>Contacts List</label></br>
			  <table class="datatable">
			    <tr>
			        <th>Firstname</th><th>Lastname</th><th>Email</th><th>Telephone</th><th>Birth date</th><th>Gender</th>
			    </tr>
			    <#list users as user>
				    <tr>
				        <td>${user.firstname}</td> 
				        <td>${user.lastname}</td>
				        <td>${user.email}</td>
				        <td>${user.telephone}</td>
				        <td>${user.birthdate}</td> 
				        <td>${user.gender.genderLabel}</td> 
				    </tr>
			    </#list>
			  </table>
		 </td>
	</tr>
</table>
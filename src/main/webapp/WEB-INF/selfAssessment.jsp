<%@ page contentType="text/html; charset = UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">



<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">



<title>Self Assessment Form | Residential Property Tax</title>
</head>
<body>
	<div class="row mt-5">
		<div class="col-6 offset-3">
			<h3 class="text-left font-weight-normal">Self Assessment Form</h3>
			<form>
				<div class="form-group row">
					<label for="assessmentYear" class="col-sm-2 col-form-label">Year
						of Assessment</label>
					<div class="col-sm-10">
						<input type="number" maxlength="4" class="form-control"
							id="assessmentYear" value="" placeholder="YYYY">
					</div>
				</div>
				<div class="form-group row">
					<label for="name" class="col-sm-2 col-form-label">Name of
						the Owner</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="name" value=""
							placeholder="John Doe">
					</div>
				</div>
				<div class="form-group row">
					<label for="email" class="col-sm-2 col-form-label">Email</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="email" value=""
							placeholder="example@email.com">
					</div>
				</div>
				<div class="form-group row">
					<label for="address" class="col-sm-2 col-form-label">Address
						of the Property</label>
					<div class="col-sm-10">
						<textarea class="form-control" id="address" value=""
							placeholder="Enter Property Address...">
                            </textarea>
					</div>
				</div>
				<div class="form-group row">
					<label for="zone" class="col-sm-2 col-form-label">Zone</label>
					<div class="col-sm-10">
						<select id="zone" class="form-control">
							<!-- <option selected>Choose...</option> -->
							<c:forEach items="${properties[0].zones}" var="zone"
								>
								<option value="${zone.zoneName}">${zone.zoneName}</option>
							</c:forEach>
						</select>
					</div>
				</div>
				<div class="form-group row">
					<label for="property" class="col-sm-2 col-form-label">Description
						of Property</label>
					<div class="col-sm-10">
						<select id="property" class="form-control">
							<!-- <option selected>Choose...</option> -->
							<c:forEach items="${properties}" var="property"
								>
								<option value="${property.id}">${property.description}</option>
							</c:forEach>
						</select>
					</div>
				</div>
				<div class="form-group row">
					<label for="status" class="col-sm-2 col-form-label">Status</label>
					<div class="col-sm-10">
						<select autocapitalize="on" id="status" class="form-control">
							<!-- <option selected>Choose...</option> -->
							<option>Tenanted</option>
							<option>Owner</option>
						</select>
					</div>
				</div>
				<div class="form-group row">
					<label for="constructedYear" class="col-sm-2 col-form-label">Building
						Constructed Year</label>
					<div class="col-sm-10">
						<input type="number" maxlength="4" class="form-control"
							id="constructedYear" value="" placeholder="YYYY">
					</div>
				</div>
				<div class="form-group row">
					<label for="squareFoot" class="col-sm-2 col-form-label">Built
						Up Area(Square Foot)</label>
					<div class="col-sm-10">
						<input type="number" maxlength="4" class="form-control"
							id="squareFoot" value="" placeholder="YYYY">
					</div>
				</div>
				<div class="form-group row">
					<label for="totalTax" class="col-sm-2 col-form-label">Total
						Payable Tax</label>
					<div class="col-sm-10">
						<input type="number" class="form-control" id="totalTax" value=""
							placeholder="YYYY">
					</div>
				</div>
				<div class="form-group row">
					<div class="col-sm-10">
						<button type="submit" class="btn btn-primary">Pay Tax</button>
						<button type="reset" class="btn btn-danger">Cancel</button>
					</div>
				</div>
			</form>
		</div>
	</div>



	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>
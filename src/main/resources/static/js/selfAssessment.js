var data = null;

function getData() {
	const Http = new XMLHttpRequest();
	const url='http://localhost:8080/api/v1/properties';
	Http.open("GET", url);
	Http.send();

	Http.onreadystatechange = (e) => {
		if (Http.readyState == 4 && Http.status == 200) {
		data = JSON.parse(Http.response);
		console.log(data);
		}
	}
}

function calculateTax() {
	let zone = document.getElementById('zone').value;
	let property = document.getElementById('property').value;
	let status = document.getElementById('status').value;
	let constructedYear = document.getElementById('constructedYear').value;
	let areaSquareFeet = document.getElementById('squareFoot').value;
	let depreciation = new Date().getFullYear() - constructedYear;
	let totalTax = document.getElementById('totalTax');
	if(depreciation > 60)
		depreciation = 60;
	console.log(depreciation, property);
	let taxValue = getUnitAreaValue(zone, status, property);
	totalTax.value = computeTax(taxValue, areaSquareFeet, depreciation);
}

function computeTax(taxValue, areaSquareFeet, depreciation) {
	let total1 = areaSquareFeet * taxValue * 10;
	let total2 = total1 - (depreciation / 100);
	let total3 = total2 * 0.2;
	let total4 = total3 * 0.24;
	return (total3 + total4).toFixed(2);
}

function getUnitAreaValue(zone, status, property) {
	if(data === null)
		getData();
	let propertyType = getProperty(property);
	let zonedTax = propertyType.zones.find(z => z.zoneName === zone);
	let areaValue = zonedTax.taxValues.find(taxValue => taxValue.status === status);
	console.log(areaValue);
	return areaValue.tax;
}

function getProperty(property) {
	return data.find(p => p.id == property);
}

getData();
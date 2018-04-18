document.addEventListener('DOMContentLoaded', () => {
  const mapContainer = document.querySelector('#main-map');

  const codeclanE = {lat: 55.946962, lng:-3.201958};
  const codeclanG = {lat:55.865477, lng:-4.257998}
  const mainMap = new MapWrapper(mapContainer, codeclanE, 15);

  const contentString = '<div id="content">'+
  '<div id="siteNotice">'+
  '</div>'+
  '<h1 id="firstHeading" class="firstHeading">CodeClan</h1>'+
  '<div id="bodyContent">'+
  '<p>At <b>CodeClan</b>, we are passionate about teaching digital skills'+
  'including software development and user experience design. We believe'+
  'that promoting digital excellence creates opportunities for our students,'+
  'our graduates, our employer partners and the wider economy.</p>'+
  '</div>'+
  '</div>';

  mainMap.addMarker(codeclanE, contentString);
  mainMap.addMarker(codeclanG);

  mainMap.addClickListener();
});

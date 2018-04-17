document.addEventListener('DOMContentLoaded', () => {
  const mapContainer = document.querySelector('#main-map');

  const codeclanE = {lat: 55.946962, lng:-3.201958};
  const codeclanG = {lat:55.865477, lng:-4.257998}
  const mainMap = new MapWrapper(mapContainer, codeclanE, 15);

  mainMap.addMarker(codeclanE);
  mainMap.addMarker(codeclanG);

});

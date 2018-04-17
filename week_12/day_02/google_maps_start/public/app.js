document.addEventListener('DOMContentLoaded', () => {
  const mapContainer = document.querySelector('#main-map');

  const center = {lat: 55.946962, lng:-3.201958};
  const mainMap = new MapWrapper(mapContainer, center, 15);

});

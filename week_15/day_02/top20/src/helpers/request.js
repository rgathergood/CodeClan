class Request {
  constructor(url) {
      this.url = url;
  }

  get(onComplete) {
    const request = new XMLHttpRequest();
    request.open('GET', this.url);

    request.addEventListener('load', function() {
      if(request.status !== 200) return;
        const response = JSON.parse(request.responseText);

      onComplete(response);
    });

    request.send();
  };
}
export default Request;

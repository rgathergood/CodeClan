const express = require('express');
const router = new express.Router();

router.use('/cats', require('./cats.js'));
router.use('/dogs', require('./dogs.js'));

module.exports = router;

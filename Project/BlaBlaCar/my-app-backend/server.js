// server.js
const express = require('express');
const mongoose = require('mongoose');
const cors = require('cors');

const app = express();
app.use(cors());
app.use(express.json());

// Connect to MongoDB
mongoose.connect('mongodb://localhost:27017/locations', {
    useNewUrlParser: true,
    useUnifiedTopology: true,
});

// Define a Location Schema
const locationSchema = new mongoose.Schema({
    name: String,
});

const Location = mongoose.model('Location', locationSchema);

// API to get locations
app.get('/api/locations', async (req, res) => {
    const locations = await Location.find();
    res.json(locations);
});

// Start the server
app.listen(5000, () => {
    console.log('Server is running on port 5000');
});

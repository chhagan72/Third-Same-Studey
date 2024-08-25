import React, { useState, useEffect } from 'react';
import './css/findit.css';

function Findit() {
    const [locations, setLocations] = useState([]);
    const [leavingFrom, setLeavingFrom] = useState('');
    const [goingTo, setGoingTo] = useState('');
    const [passengers, setPassengers] = useState(1);

    useEffect(() => {
        fetch('http://localhost:5000/api/locations')
            .then((response) => response.json())
            .then((data) => setLocations(data))
            .catch((error) => console.error('Error fetching locations:', error));
    }, []);

    const handleIncrease = () => {
        setPassengers(passengers + 1);
    };

    const handleDecrease = () => {
        if (passengers > 1) {
            setPassengers(passengers - 1);
        }
    };

    return (
        <div className="form-container">
            <div className="container">
                <h2>Book Your Ride</h2>
                <form>
                    <div className="form-group mb-3">
                        <select 
                            className="form-control" 
                            value={leavingFrom} 
                            onChange={(e) => setLeavingFrom(e.target.value)} 
                            placeholder="Leaving From">
                            <option value="">Leaving From</option>
                            <option value="">Bavdhan</option>
                            <option value="">Kothrud</option>
                            <option value="">Katrej</option>
                            <option value="">Swarget</option>
                            {locations.map((location) => (
                                <option key={location._id} value={location.name}>
                                    {location.name}
                                </option>
                            ))}
                        </select>
                    </div>
                    <div className="form-group mb-3">
                        <select 
                            className="form-control" 
                            value={goingTo} 
                            onChange={(e) => setGoingTo(e.target.value)} 
                            placeholder="Going To">
                            <option value="">Going To</option>
                            <option value="">Bavdhan</option>
                            <option value="">Kothrud</option>
                            <option value="">Katrej</option>
                            <option value="">Swarget</option>
                            {locations.map((location) => (
                                <option key={location._id} value={location.name}>
                                    {location.name}
                                </option>
                            ))}
                        </select>
                    </div>
                    <div className="form-group mb-3">
                        <input type="date" className="form-control" id="date" />
                    </div>
                    <div className="form-group mb-3">
                        <div className="input-group">
                            <button className="btn btn-outline-secondary" type="button" onClick={handleDecrease}>-</button>
                            <input type="text" className="form-control text-center" id="passengers" value={passengers} readOnly />
                            <button className="btn btn-outline-secondary" type="button" onClick={handleIncrease}>+</button>
                        </div>
                    </div>
                    <div className="form-group">
                        <button type="submit" className="btn btn-primary">Submit</button>
                    </div>
                </form>
            </div>
        </div>
    );
}

export default Findit;

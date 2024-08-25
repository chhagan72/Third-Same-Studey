import React from 'react';
import { BrowserRouter as Router, Route, Routes, Link } from 'react-router-dom';
import Home from './Home';
import About from './About';
import '@fortawesome/fontawesome-free/css/all.min.css';

function Navbar() {
    return (
        <Router>
            <div className="container-fluid">
                <nav className="navbar navbar-expand-lg bg-body-tertiary">
                    <div className="container-fluid">
                        {/* Logo and Links */}
                        <Link className="navbar-brand" to="/">CarGo Together</Link>
                        <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarTogglerDemo03" aria-controls="navbarTogglerDemo03" aria-expanded="false" aria-label="Toggle navigation">
                            <span className="navbar-toggler-icon"></span>
                        </button>
                        <div className="collapse navbar-collapse" id="navbarTogglerDemo03">
                            <ul className="navbar-nav me-auto mb-2 mb-lg-0">
                                <li className="nav-item">
                                    <Link className="nav-link active" aria-current="page" to="/">Home</Link>
                                </li>
                                <li className="nav-item">
                                    <Link className="nav-link" to="/about">About Us</Link>
                                </li>
                            </ul>
                            {/* Search Icon and Profile Dropdown */}
                            <div className="d-flex align-items-center">
                                {/* <button className="btn btn-outline-secondary me-3" type="button" data-bs-toggle="modal" data-bs-target="#searchModal"> */}
                                <button className="btn btn-outline-secondary me-3" type="button"  >
                                    <i className="fas fa-search"></i>
                                </button>
                                <div className="dropdown">
                                    <button className="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-bs-toggle="dropdown" aria-expanded="false">
                                        <i className="fas fa-user"></i>
                                    </button>
                                    <ul className="dropdown-menu dropdown-menu-end" aria-labelledby="dropdownMenuButton">
                                        <li><Link className="dropdown-item" to="#">Log in</Link></li>
                                        <li><Link className="dropdown-item" to="#">Sign up</Link></li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                </nav>

                {/* Search Modal */}
                <div className="modal fade" id="searchModal" tabIndex="-1" aria-labelledby="searchModalLabel" aria-hidden="true">
                    <div className="modal-dialog">
                        <div className="modal-content">
                            <div className="modal-header">
                                <h5 className="modal-title" id="searchModalLabel">Search</h5>
                                <button type="button" className="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                            </div>
                            <div className="modal-body">
                                <form>
                                    <input className="form-control" type="search" placeholder="Search" aria-label="Search" />
                                </form>
                            </div>
                            <div className="modal-footer">
                                <button type="button" className="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                            </div>
                        </div>
                    </div>
                </div>

                <Routes>
                    <Route path="/" element={<Home />} />
                    <Route path="/about" element={<About />} />
                </Routes>
            </div>
        </Router>
    );
}

export default Navbar;

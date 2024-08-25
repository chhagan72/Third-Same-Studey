import React from 'react'
import './css/banner.css'
import Findit from './Findit'

function Home() {
  return (
    <><div className="banner-container">
      <div className="banner-content">
        <h1>Your pick of rides at low prices</h1>
        <p>Experience the thrill of riding with us.</p>
        {/* <button className="btn btn-primary">Get Started</button> */}
      </div>
    </div><Findit /></>
  )
}

export default Home

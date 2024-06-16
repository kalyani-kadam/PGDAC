import React from 'react'
import {NavLink} from 'react-router-dom'
export default function MainNavBar() {
  return (
    <div>
        <header>
        <nav className="navbar navbar-expand-lg navbar-light bg-light">
            <NavLink className="navbar-brand" to="/home">Home</NavLink>
                <button className="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                    <span className="navbar-toggler-icon"></span>
                </button>
  <div className="collapse navbar-collapse" id="navbarNav">
    <ul className="navbar-nav">
      <li className="nav-item active">
        <NavLink className="nav-link" to="/table">Table <span className="sr-only">(current)</span></NavLink>
      </li>
      <li className="nav-item">
        <NavLink className="nav-link" to="/form">Form</NavLink>
      </li>
      <li className="nav-item">
        <NavLink className="nav-link" to="/aboutus">Aboutus</NavLink>
      </li>
     
    </ul>
  </div>
</nav>
        </header>
    </div>
  )
}

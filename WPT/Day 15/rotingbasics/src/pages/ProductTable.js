import React from 'react'
import {Link,Outlet} from 'react-router-dom'
export default function ProductTable() {
  return (
    <div>
        <h1>In Producttable component</h1>
        <div>
            <ul>
                <li><Link to="/table/p1">Product 1</Link></li>
                <li><Link to="/table/p2">Product 2</Link></li>
                <li><Link to="/table/p3">Product 3</Link></li>
            </ul>
        </div>
        <div>
            <Outlet></Outlet>
        </div>
    </div>
  )
}

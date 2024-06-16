import logo from './logo.svg';
import './App.css';
import 'bootstrap/dist/css/bootstrap.css'
import Header from './components/Header';
import Footer from './components/Footer';
import {Routes,Route,Navigate} from 'react-router-dom'
import AboutUs from './pages/AboutUs';
import ProductTable from './pages/ProductTable';
import ProdutForm from './pages/ProdutForm';
import HomeComponent from './pages/HomeComponent';
import MainNavBar from './components/MainNavBar';
import ProductDetails from './pages/ProductDetails';
function App() {
  return (
    <div>
        <Header></Header>
        <MainNavBar></MainNavBar>
        <Routes>
           <Route path="/" element={<Navigate replace to="/home"></Navigate>}></Route>
           <Route path="/home" element={<HomeComponent/>}></Route>
           <Route path="/table" element={<ProductTable/>}>
               <Route path=":id" element={<ProductDetails/>}></Route>
           </Route>
           <Route path="/form" element={<ProdutForm/>}></Route>
           <Route path="/aboutus" element={<AboutUs/>}></Route>
           <Route path="**" element={<Navigate replace to="/home"></Navigate>}></Route>
        </Routes>
        <Footer></Footer>
    </div>
  );
}

export default App;

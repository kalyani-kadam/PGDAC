import React,{Component} from 'react'
class CounterClassComponent extends React.Component{
    constructor(props){
        super(props);
        console.log("props",props);
        console.log("in count component constructor function")
        this.state={
            count:0,
            name:"",
            id:""
        }
        //this.increament=this.increament.bind(this);

    }
    //if you use old style of function button will be passwed as this to the function
    //and hence to add class object you need to use bind function inside constrctor
    /*increament(){ this===button
        this.setState({...this.state,count:this.state.count+1})

    }*/
    increament=()=>{
        console.log("in count component increament function")
        this.setState({...this.state,count:this.state.count+1},function(){ // setState is asynchronous so add the code in callback function
            console.log(this.state.count);
        });
        
    }
    decrement=()=>{
        this.setState({...this.state,count:this.state.count>0?this.state.count-1:0},function(){
            console.log(this.state.count);
        })
    }
    resetcnt=()=>{
        this.setState({...this.state,count:parseInt(this.props.val)});
    }
    render(){
        console.log("in count component render function")
        return(
            <div>
                <h3>you clicked {this.state.count} time</h3>
                <button type="button" name="inc" id="inc" value="increament" onClick={this.increament}>Increament count</button>
                 &nbsp;&nbsp;&nbsp;
                <button type="button" name="decr" id="decr" value="decreament" onClick={this.decrement}>Decreament count</button>
                &nbsp;&nbsp;&nbsp;
                <button type="button" name="reset" id="reset" value="reset" onClick={this.resetcnt}>Reset count</button>
            </div>
        )
    }
}

export default CounterClassComponent
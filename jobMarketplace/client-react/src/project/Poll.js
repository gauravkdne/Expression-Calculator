import React, { Component } from 'react';
import './Poll.css';
import { Avatar, Icon } from 'antd';
import { Link } from 'react-router-dom';


import { Radio, Button } from 'antd';
const RadioGroup = Radio.Group;

class Poll extends Component {

   

    render() {
        const pollChoices = [];
        
        return (
            <div className="poll-content">
                <div className="poll-header">
                    <div className="poll-creator-info">
                        
                    
                            <span className="poll-creator-name">
                                {this.props.poll.id}
                            </span>
                            <span className="poll-creator-username">
                                @{this.props.poll.name}
                            </span>
                            <span className="poll-creator-username">
                                @{this.props.poll.description}
                            </span>
                    </div>
                </div>
            </div>
        );
    }
}


export default Poll;
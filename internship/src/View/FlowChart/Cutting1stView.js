import React, { Component } from 'react';
import { Step, Icon } from 'semantic-ui-react'
import '../View.css';

class Cutting1stView extends Component {
    render() {
        return (
            <div className="Cutting1st">
                <Step.Group>
                    {
                        this.props.cutting1st.result === true ?
                            <Step completed>
                                <Icon name='subscript' />
                                <Step.Content>
                                    <Step.Title>세포증식</Step.Title>
                                    <Step.Description>숙주내 복제 세포 자가증식</Step.Description>
                                </Step.Content>
                            </Step>
                            :
                            <Step active>
                                <Icon name='subscript' />
                                <Step.Content>
                                    <Step.Title>세포증식</Step.Title>
                                    <Step.Description>숙주내 복제 세포 자가증식</Step.Description>
                                </Step.Content>
                            </Step>}
                </Step.Group>
            </div>
        );
    }
}

export default Cutting1stView;

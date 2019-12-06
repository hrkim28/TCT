import React, { Component } from 'react';
import { Step, Icon } from 'semantic-ui-react'
import '../View.css';

class ChargingView extends Component {
    render() {
        return (
            <div className="Charging">
                <Step.Group>
                    {
                        this.props.charging.result === true ?
                            <Step completed>
                                <Icon name='thumbs up outline' />
                                <Step.Content>
                                    <Step.Title>성공</Step.Title>
                                    <Step.Description>DNA 복제 성공</Step.Description>
                                </Step.Content>
                            </Step>
                            :
                            <Step active>
                                <Icon name='thumbs up outline' />
                                <Step.Content>
                                    <Step.Title>성공</Step.Title>
                                    <Step.Description>DNA 복제 성공</Step.Description>
                                </Step.Content>
                            </Step>}
                </Step.Group>
            </div>
        );
    }
}

export default ChargingView;

import React, { Component } from 'react';
import { Step, Icon } from 'semantic-ui-react'
import '../View.css';

class ScrapView extends Component {
    render() {
        return (
            <div className="Scrap">
                <Step.Group>
                    {
                        this.props.scrap.result === true ?
                            <Step completed>
                                <Icon name='credit card' />
                                <Step.Content>
                                    <Step.Title>Scrap</Step.Title>
                                    <Step.Description>불량품 Scrap처리</Step.Description>
                                </Step.Content>
                            </Step>
                            :
                            <Step active>
                                <Icon name='credit card' />
                                <Step.Content>
                                    <Step.Title>Scrap</Step.Title>
                                    <Step.Description>불량품 Scrap처리</Step.Description>
                                </Step.Content>
                            </Step>}
                </Step.Group>
            </div>
        );
    }
}

export default ScrapView;

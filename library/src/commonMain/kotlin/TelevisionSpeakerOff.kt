package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TelevisionSpeakerOff: ImageVector
    get() {
        if (_TelevisionSpeakerOff != null) {
            return _TelevisionSpeakerOff!!
        }
        _TelevisionSpeakerOff = ImageVector.Builder(
            name = "TelevisionSpeakerOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 9f)
                horizontalLineTo(16f)
                curveTo(15f, 9f, 14.1f, 9.8f, 14f, 10.8f)
                lineTo(17.8f, 14.6f)
                curveTo(18f, 14.5f, 18.2f, 14.5f, 18.5f, 14.5f)
                horizontalLineTo(18.6f)
                curveTo(20.3f, 14.5f, 21.6f, 15.8f, 21.6f, 17.5f)
                curveTo(21.6f, 17.7f, 21.6f, 18f, 21.5f, 18.2f)
                lineTo(23.1f, 19.8f)
                verticalLineTo(11f)
                curveTo(23f, 9.9f, 22.1f, 9f, 21f, 9f)
                moveTo(18.5f, 13.5f)
                curveTo(17.7f, 13.5f, 17f, 12.8f, 17f, 12f)
                reflectiveCurveTo(17.7f, 10.5f, 18.5f, 10.5f)
                reflectiveCurveTo(20f, 11.2f, 20f, 12f)
                reflectiveCurveTo(19.3f, 13.5f, 18.5f, 13.5f)
                moveTo(23f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(21f)
                verticalLineTo(5f)
                horizontalLineTo(8.2f)
                lineTo(6.2f, 3f)
                horizontalLineTo(21f)
                curveTo(22.1f, 3f, 23f, 3.9f, 23f, 5f)
                moveTo(2.4f, 1.7f)
                lineTo(1.1f, 3f)
                lineTo(1.6f, 3.5f)
                curveTo(1.3f, 3.9f, 1f, 4.4f, 1f, 5f)
                verticalLineTo(17f)
                curveTo(1f, 18.1f, 1.9f, 19f, 3f, 19f)
                horizontalLineTo(8f)
                verticalLineTo(21f)
                horizontalLineTo(12f)
                verticalLineTo(17f)
                horizontalLineTo(3f)
                verticalLineTo(5f)
                horizontalLineTo(3.1f)
                lineTo(14f, 15.9f)
                verticalLineTo(20f)
                curveTo(14f, 21.1f, 14.9f, 22f, 16f, 22f)
                horizontalLineTo(20.1f)
                lineTo(20.8f, 22.7f)
                lineTo(22.2f, 21.5f)
                lineTo(2.4f, 1.7f)
                moveTo(18.5f, 20.5f)
                curveTo(16.8f, 20.5f, 15.5f, 19.2f, 15.5f, 17.5f)
                verticalLineTo(17.4f)
                lineTo(18.6f, 20.5f)
                horizontalLineTo(18.5f)
                close()
            }
        }.build()

        return _TelevisionSpeakerOff!!
    }

@Suppress("ObjectPropertyName")
private var _TelevisionSpeakerOff: ImageVector? = null

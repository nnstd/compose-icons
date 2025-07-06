package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SpeakerMessage: ImageVector
    get() {
        if (_SpeakerMessage != null) {
            return _SpeakerMessage!!
        }
        _SpeakerMessage = ImageVector.Builder(
            name = "SpeakerMessage",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.5f, 3f)
                horizontalLineTo(21.5f)
                curveTo(22.3f, 3f, 23f, 3.7f, 23f, 4.5f)
                verticalLineTo(7.5f)
                curveTo(23f, 8.3f, 22.3f, 9f, 21.5f, 9f)
                horizontalLineTo(18f)
                lineTo(15f, 12f)
                verticalLineTo(4.5f)
                curveTo(15f, 3.7f, 15.7f, 3f, 16.5f, 3f)
                moveTo(3f, 3f)
                curveTo(1.9f, 3f, 1f, 3.9f, 1f, 5f)
                verticalLineTo(19f)
                curveTo(1f, 20.1f, 1.9f, 21f, 3f, 21f)
                horizontalLineTo(11f)
                curveTo(12.1f, 21f, 13f, 20.1f, 13f, 19f)
                verticalLineTo(5f)
                curveTo(13f, 3.9f, 12.1f, 3f, 11f, 3f)
                horizontalLineTo(3f)
                moveTo(7f, 5f)
                curveTo(8.1f, 5f, 9f, 5.9f, 9f, 7f)
                reflectiveCurveTo(8.1f, 9f, 7f, 9f)
                reflectiveCurveTo(5f, 8.1f, 5f, 7f)
                reflectiveCurveTo(5.9f, 5f, 7f, 5f)
                moveTo(7f, 11f)
                curveTo(9.2f, 11f, 11f, 12.8f, 11f, 15f)
                reflectiveCurveTo(9.2f, 19f, 7f, 19f)
                reflectiveCurveTo(3f, 17.2f, 3f, 15f)
                reflectiveCurveTo(4.8f, 11f, 7f, 11f)
                moveTo(7f, 13f)
                curveTo(5.9f, 13f, 5f, 13.9f, 5f, 15f)
                reflectiveCurveTo(5.9f, 17f, 7f, 17f)
                reflectiveCurveTo(9f, 16.1f, 9f, 15f)
                reflectiveCurveTo(8.1f, 13f, 7f, 13f)
            }
        }.build()

        return _SpeakerMessage!!
    }

@Suppress("ObjectPropertyName")
private var _SpeakerMessage: ImageVector? = null

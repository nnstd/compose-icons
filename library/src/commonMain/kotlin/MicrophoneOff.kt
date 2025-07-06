package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MicrophoneOff: ImageVector
    get() {
        if (_MicrophoneOff != null) {
            return _MicrophoneOff!!
        }
        _MicrophoneOff = ImageVector.Builder(
            name = "MicrophoneOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 11f)
                curveTo(19f, 12.19f, 18.66f, 13.3f, 18.1f, 14.28f)
                lineTo(16.87f, 13.05f)
                curveTo(17.14f, 12.43f, 17.3f, 11.74f, 17.3f, 11f)
                horizontalLineTo(19f)
                moveTo(15f, 11.16f)
                lineTo(9f, 5.18f)
                verticalLineTo(5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 5f)
                verticalLineTo(11f)
                lineTo(15f, 11.16f)
                moveTo(4.27f, 3f)
                lineTo(21f, 19.73f)
                lineTo(19.73f, 21f)
                lineTo(15.54f, 16.81f)
                curveTo(14.77f, 17.27f, 13.91f, 17.58f, 13f, 17.72f)
                verticalLineTo(21f)
                horizontalLineTo(11f)
                verticalLineTo(17.72f)
                curveTo(7.72f, 17.23f, 5f, 14.41f, 5f, 11f)
                horizontalLineTo(6.7f)
                curveTo(6.7f, 14f, 9.24f, 16.1f, 12f, 16.1f)
                curveTo(12.81f, 16.1f, 13.6f, 15.91f, 14.31f, 15.58f)
                lineTo(12.65f, 13.92f)
                lineTo(12f, 14f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 11f)
                verticalLineTo(10.28f)
                lineTo(3f, 4.27f)
                lineTo(4.27f, 3f)
                close()
            }
        }.build()

        return _MicrophoneOff!!
    }

@Suppress("ObjectPropertyName")
private var _MicrophoneOff: ImageVector? = null

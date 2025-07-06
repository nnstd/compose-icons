package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MicrophoneMessageOff: ImageVector
    get() {
        if (_MicrophoneMessageOff != null) {
            return _MicrophoneMessageOff!!
        }
        _MicrophoneMessageOff = ImageVector.Builder(
            name = "MicrophoneMessageOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 5.27f)
                lineTo(3.28f, 4f)
                lineTo(20f, 20.72f)
                lineTo(18.73f, 22f)
                lineTo(13.38f, 16.65f)
                curveTo(12.55f, 18.35f, 10.93f, 19.59f, 9f, 19.92f)
                verticalLineTo(22f)
                horizontalLineTo(7f)
                verticalLineTo(19.92f)
                curveTo(4.16f, 19.44f, 2f, 16.97f, 2f, 14f)
                horizontalLineTo(4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 18f)
                curveTo(9.82f, 18f, 11.36f, 16.78f, 11.84f, 15.11f)
                lineTo(10f, 13.27f)
                verticalLineTo(14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 14f)
                verticalLineTo(9.27f)
                lineTo(2f, 5.27f)
                moveTo(21.41f, 9.41f)
                lineTo(17.17f, 13.66f)
                lineTo(18.18f, 10f)
                horizontalLineTo(14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 8f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 2f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 4f)
                verticalLineTo(8f)
                curveTo(22f, 8.55f, 21.78f, 9.05f, 21.41f, 9.41f)
                close()
            }
        }.build()

        return _MicrophoneMessageOff!!
    }

@Suppress("ObjectPropertyName")
private var _MicrophoneMessageOff: ImageVector? = null

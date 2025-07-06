package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MicrophoneOutline: ImageVector
    get() {
        if (_MicrophoneOutline != null) {
            return _MicrophoneOutline!!
        }
        _MicrophoneOutline = ImageVector.Builder(
            name = "MicrophoneOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.3f, 11f)
                curveTo(17.3f, 14f, 14.76f, 16.1f, 12f, 16.1f)
                curveTo(9.24f, 16.1f, 6.7f, 14f, 6.7f, 11f)
                horizontalLineTo(5f)
                curveTo(5f, 14.41f, 7.72f, 17.23f, 11f, 17.72f)
                verticalLineTo(21f)
                horizontalLineTo(13f)
                verticalLineTo(17.72f)
                curveTo(16.28f, 17.23f, 19f, 14.41f, 19f, 11f)
                moveTo(10.8f, 4.9f)
                curveTo(10.8f, 4.24f, 11.34f, 3.7f, 12f, 3.7f)
                curveTo(12.66f, 3.7f, 13.2f, 4.24f, 13.2f, 4.9f)
                lineTo(13.19f, 11.1f)
                curveTo(13.19f, 11.76f, 12.66f, 12.3f, 12f, 12.3f)
                curveTo(11.34f, 12.3f, 10.8f, 11.76f, 10.8f, 11.1f)
                moveTo(12f, 14f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 11f)
                verticalLineTo(5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 5f)
                verticalLineTo(11f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 14f)
                close()
            }
        }.build()

        return _MicrophoneOutline!!
    }

@Suppress("ObjectPropertyName")
private var _MicrophoneOutline: ImageVector? = null

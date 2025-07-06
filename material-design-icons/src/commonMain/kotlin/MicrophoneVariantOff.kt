package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MicrophoneVariantOff: ImageVector
    get() {
        if (_MicrophoneVariantOff != null) {
            return _MicrophoneVariantOff!!
        }
        _MicrophoneVariantOff = ImageVector.Builder(
            name = "MicrophoneVariantOff",
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
                lineTo(16f, 19.26f)
                curveTo(15.86f, 21.35f, 14.12f, 23f, 12f, 23f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 19f)
                verticalLineTo(18f)
                horizontalLineTo(7f)
                lineTo(6.16f, 9.82f)
                curveTo(5.82f, 9.47f, 5.53f, 9.06f, 5.33f, 8.6f)
                lineTo(2f, 5.27f)
                moveTo(9f, 3f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 7f)
                horizontalLineTo(8.82f)
                lineTo(6.08f, 4.26f)
                curveTo(6.81f, 3.5f, 7.85f, 3f, 9f, 3f)
                moveTo(11.84f, 9.82f)
                lineTo(11.82f, 10f)
                lineTo(9.82f, 8f)
                horizontalLineTo(12.87f)
                curveTo(12.69f, 8.7f, 12.33f, 9.32f, 11.84f, 9.82f)
                moveTo(11f, 18f)
                horizontalLineTo(10f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 19f)
                verticalLineTo(17.27f)
                lineTo(11.35f, 14.62f)
                lineTo(11f, 18f)
                moveTo(18f, 10f)
                horizontalLineTo(20f)
                lineTo(19f, 11f)
                lineTo(20f, 12f)
                horizontalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 14f)
                verticalLineTo(14.18f)
                lineTo(14.3f, 12.5f)
                curveTo(14.9f, 11f, 16.33f, 10f, 18f, 10f)
                moveTo(8f, 12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 13f)
                curveTo(9.21f, 13f, 9.4f, 12.94f, 9.56f, 12.83f)
                lineTo(8.17f, 11.44f)
                curveTo(8.06f, 11.6f, 8f, 11.79f, 8f, 12f)
                close()
            }
        }.build()

        return _MicrophoneVariantOff!!
    }

@Suppress("ObjectPropertyName")
private var _MicrophoneVariantOff: ImageVector? = null

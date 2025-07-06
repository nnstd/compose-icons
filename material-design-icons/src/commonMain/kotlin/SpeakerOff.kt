package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SpeakerOff: ImageVector
    get() {
        if (_SpeakerOff != null) {
            return _SpeakerOff!!
        }
        _SpeakerOff = ImageVector.Builder(
            name = "SpeakerOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 5.27f)
                lineTo(3.28f, 4f)
                lineTo(21f, 21.72f)
                lineTo(19.73f, 23f)
                lineTo(18.27f, 21.54f)
                curveTo(17.93f, 21.83f, 17.5f, 22f, 17f, 22f)
                horizontalLineTo(7f)
                curveTo(5.89f, 22f, 5f, 21.1f, 5f, 20f)
                verticalLineTo(8.27f)
                lineTo(2f, 5.27f)
                moveTo(12f, 18f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 15f)
                curveTo(9f, 14.24f, 9.28f, 13.54f, 9.75f, 13f)
                lineTo(8.33f, 11.6f)
                curveTo(7.5f, 12.5f, 7f, 13.69f, 7f, 15f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 20f)
                curveTo(13.31f, 20f, 14.5f, 19.5f, 15.4f, 18.67f)
                lineTo(14f, 17.25f)
                curveTo(13.45f, 17.72f, 12.76f, 18f, 12f, 18f)
                moveTo(17f, 15f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 10f)
                horizontalLineTo(11.82f)
                lineTo(5.12f, 3.3f)
                curveTo(5.41f, 2.54f, 6.14f, 2f, 7f, 2f)
                horizontalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 4f)
                verticalLineTo(17.18f)
                lineTo(17f, 15.17f)
                verticalLineTo(15f)
                moveTo(12f, 4f)
                curveTo(10.89f, 4f, 10f, 4.89f, 10f, 6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 6f)
                curveTo(14f, 4.89f, 13.1f, 4f, 12f, 4f)
                close()
            }
        }.build()

        return _SpeakerOff!!
    }

@Suppress("ObjectPropertyName")
private var _SpeakerOff: ImageVector? = null

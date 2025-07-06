package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TelevisionClassicOff: ImageVector
    get() {
        if (_TelevisionClassicOff != null) {
            return _TelevisionClassicOff!!
        }
        _TelevisionClassicOff = ImageVector.Builder(
            name = "TelevisionClassicOff",
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
                lineTo(17.73f, 21f)
                horizontalLineTo(4f)
                curveTo(2.89f, 21f, 2f, 20.11f, 2f, 19f)
                verticalLineTo(9f)
                curveTo(2f, 8f, 2.76f, 7.14f, 3.75f, 7f)
                lineTo(2f, 5.27f)
                moveTo(8.16f, 3f)
                lineTo(12f, 6.84f)
                lineTo(15.84f, 3f)
                lineTo(17.25f, 4.41f)
                lineTo(14.66f, 7f)
                horizontalLineTo(20f)
                curveTo(21.11f, 7f, 22f, 7.89f, 22f, 9f)
                verticalLineTo(19f)
                curveTo(22f, 19.34f, 21.92f, 19.66f, 21.77f, 19.94f)
                lineTo(17f, 15.18f)
                verticalLineTo(9f)
                horizontalLineTo(10.82f)
                lineTo(8.82f, 7f)
                horizontalLineTo(9.34f)
                lineTo(6.75f, 4.41f)
                lineTo(8.16f, 3f)
                moveTo(4f, 9f)
                verticalLineTo(19f)
                horizontalLineTo(15.73f)
                lineTo(5.73f, 9f)
                horizontalLineTo(4f)
                moveTo(19.5f, 9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.5f, 11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.5f, 10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.5f, 9f)
                moveTo(19.5f, 12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 13f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.5f, 14f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.5f, 13f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.5f, 12f)
                close()
            }
        }.build()

        return _TelevisionClassicOff!!
    }

@Suppress("ObjectPropertyName")
private var _TelevisionClassicOff: ImageVector? = null

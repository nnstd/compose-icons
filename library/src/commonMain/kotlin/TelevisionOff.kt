package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TelevisionOff: ImageVector
    get() {
        if (_TelevisionOff != null) {
            return _TelevisionOff!!
        }
        _TelevisionOff = ImageVector.Builder(
            name = "TelevisionOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0.5f, 2.77f)
                lineTo(1.78f, 1.5f)
                lineTo(21f, 20.72f)
                lineTo(19.73f, 22f)
                lineTo(16.73f, 19f)
                horizontalLineTo(16f)
                verticalLineTo(21f)
                horizontalLineTo(8f)
                verticalLineTo(19f)
                horizontalLineTo(3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 17f)
                verticalLineTo(5f)
                curveTo(1f, 4.5f, 1.17f, 4.07f, 1.46f, 3.73f)
                lineTo(0.5f, 2.77f)
                moveTo(21f, 17f)
                verticalLineTo(5f)
                horizontalLineTo(7.82f)
                lineTo(5.82f, 3f)
                horizontalLineTo(21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 5f)
                verticalLineTo(17f)
                curveTo(23f, 17.85f, 22.45f, 18.59f, 21.7f, 18.87f)
                lineTo(19.82f, 17f)
                horizontalLineTo(21f)
                moveTo(3f, 17f)
                horizontalLineTo(14.73f)
                lineTo(3f, 5.27f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _TelevisionOff!!
    }

@Suppress("ObjectPropertyName")
private var _TelevisionOff: ImageVector? = null

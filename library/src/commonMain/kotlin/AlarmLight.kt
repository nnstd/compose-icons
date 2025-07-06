package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlarmLight: ImageVector
    get() {
        if (_AlarmLight != null) {
            return _AlarmLight!!
        }
        _AlarmLight = ImageVector.Builder(
            name = "AlarmLight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 6.9f)
                lineTo(3.87f, 4.78f)
                lineTo(5.28f, 3.37f)
                lineTo(7.4f, 5.5f)
                lineTo(6f, 6.9f)
                moveTo(13f, 1f)
                verticalLineTo(4f)
                horizontalLineTo(11f)
                verticalLineTo(1f)
                horizontalLineTo(13f)
                moveTo(20.13f, 4.78f)
                lineTo(18f, 6.9f)
                lineTo(16.6f, 5.5f)
                lineTo(18.72f, 3.37f)
                lineTo(20.13f, 4.78f)
                moveTo(4.5f, 10.5f)
                verticalLineTo(12.5f)
                horizontalLineTo(1.5f)
                verticalLineTo(10.5f)
                horizontalLineTo(4.5f)
                moveTo(19.5f, 10.5f)
                horizontalLineTo(22.5f)
                verticalLineTo(12.5f)
                horizontalLineTo(19.5f)
                verticalLineTo(10.5f)
                moveTo(6f, 20f)
                horizontalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 22f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 20f)
                moveTo(12f, 5f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 11f)
                verticalLineTo(19f)
                horizontalLineTo(6f)
                verticalLineTo(11f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 5f)
                close()
            }
        }.build()

        return _AlarmLight!!
    }

@Suppress("ObjectPropertyName")
private var _AlarmLight: ImageVector? = null

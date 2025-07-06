package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LedOn: ImageVector
    get() {
        if (_LedOn != null) {
            return _LedOn!!
        }
        _LedOn = ImageVector.Builder(
            name = "LedOn",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 0f)
                verticalLineTo(4f)
                horizontalLineTo(13f)
                verticalLineTo(0f)
                horizontalLineTo(11f)
                moveTo(18.3f, 2.29f)
                lineTo(15.24f, 5.29f)
                lineTo(16.64f, 6.71f)
                lineTo(19.7f, 3.71f)
                lineTo(18.3f, 2.29f)
                moveTo(5.71f, 2.29f)
                lineTo(4.29f, 3.71f)
                lineTo(7.29f, 6.71f)
                lineTo(8.71f, 5.29f)
                lineTo(5.71f, 2.29f)
                moveTo(12f, 6f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 10f)
                verticalLineTo(16f)
                horizontalLineTo(6f)
                verticalLineTo(18f)
                horizontalLineTo(9f)
                verticalLineTo(23f)
                horizontalLineTo(11f)
                verticalLineTo(18f)
                horizontalLineTo(13f)
                verticalLineTo(23f)
                horizontalLineTo(15f)
                verticalLineTo(18f)
                horizontalLineTo(18f)
                verticalLineTo(16f)
                horizontalLineTo(16f)
                verticalLineTo(10f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 6f)
                moveTo(2f, 9f)
                verticalLineTo(11f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                horizontalLineTo(2f)
                moveTo(18f, 9f)
                verticalLineTo(11f)
                horizontalLineTo(22f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                close()
            }
        }.build()

        return _LedOn!!
    }

@Suppress("ObjectPropertyName")
private var _LedOn: ImageVector? = null

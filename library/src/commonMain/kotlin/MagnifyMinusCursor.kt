package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MagnifyMinusCursor: ImageVector
    get() {
        if (_MagnifyMinusCursor != null) {
            return _MagnifyMinusCursor!!
        }
        _MagnifyMinusCursor = ImageVector.Builder(
            name = "MagnifyMinusCursor",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 4f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 11f)
                curveTo(18f, 12.5f, 17.5f, 14f, 16.61f, 15.19f)
                lineTo(17.42f, 16f)
                horizontalLineTo(18f)
                lineTo(23f, 21f)
                lineTo(21f, 23f)
                lineTo(16f, 18f)
                verticalLineTo(17.41f)
                lineTo(15.19f, 16.6f)
                curveTo(12.1f, 18.92f, 7.71f, 18.29f, 5.39f, 15.2f)
                curveTo(3.07f, 12.11f, 3.7f, 7.72f, 6.79f, 5.4f)
                curveTo(8f, 4.5f, 9.5f, 4f, 11f, 4f)
                moveTo(7f, 10f)
                verticalLineTo(12f)
                horizontalLineTo(15f)
                verticalLineTo(10f)
                horizontalLineTo(7f)
                moveTo(1f, 1f)
                verticalLineTo(8f)
                lineTo(8f, 1f)
                horizontalLineTo(1f)
                close()
            }
        }.build()

        return _MagnifyMinusCursor!!
    }

@Suppress("ObjectPropertyName")
private var _MagnifyMinusCursor: ImageVector? = null

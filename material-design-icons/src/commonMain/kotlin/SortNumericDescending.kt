package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SortNumericDescending: ImageVector
    get() {
        if (_SortNumericDescending != null) {
            return _SortNumericDescending!!
        }
        _SortNumericDescending = ImageVector.Builder(
            name = "SortNumericDescending",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 7f)
                horizontalLineTo(22f)
                lineTo(18f, 3f)
                lineTo(14f, 7f)
                horizontalLineTo(17f)
                verticalLineTo(21f)
                horizontalLineTo(19f)
                moveTo(9f, 21f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                horizontalLineTo(9f)
                verticalLineTo(18f)
                horizontalLineTo(7f)
                curveTo(5.9f, 18f, 5f, 17.11f, 5f, 16f)
                verticalLineTo(15f)
                curveTo(5f, 13.9f, 5.9f, 13f, 7f, 13f)
                horizontalLineTo(9f)
                curveTo(10.11f, 13f, 11f, 13.9f, 11f, 15f)
                verticalLineTo(19f)
                curveTo(11f, 20.11f, 10.11f, 21f, 9f, 21f)
                moveTo(9f, 15f)
                horizontalLineTo(7f)
                verticalLineTo(16f)
                horizontalLineTo(9f)
                moveTo(7f, 3f)
                horizontalLineTo(9f)
                curveTo(10.11f, 3f, 11f, 3.9f, 11f, 5f)
                verticalLineTo(9f)
                curveTo(11f, 10.11f, 10.11f, 11f, 9f, 11f)
                horizontalLineTo(7f)
                curveTo(5.9f, 11f, 5f, 10.11f, 5f, 9f)
                verticalLineTo(5f)
                curveTo(5f, 3.9f, 5.9f, 3f, 7f, 3f)
                moveTo(7f, 9f)
                horizontalLineTo(9f)
                verticalLineTo(5f)
                horizontalLineTo(7f)
                close()
            }
        }.build()

        return _SortNumericDescending!!
    }

@Suppress("ObjectPropertyName")
private var _SortNumericDescending: ImageVector? = null

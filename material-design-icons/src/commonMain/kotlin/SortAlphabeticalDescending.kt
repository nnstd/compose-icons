package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SortAlphabeticalDescending: ImageVector
    get() {
        if (_SortAlphabeticalDescending != null) {
            return _SortAlphabeticalDescending!!
        }
        _SortAlphabeticalDescending = ImageVector.Builder(
            name = "SortAlphabeticalDescending",
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
                moveTo(11f, 13f)
                verticalLineTo(15f)
                lineTo(7.67f, 19f)
                horizontalLineTo(11f)
                verticalLineTo(21f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                lineTo(8.33f, 15f)
                horizontalLineTo(5f)
                verticalLineTo(13f)
                moveTo(9f, 3f)
                horizontalLineTo(7f)
                curveTo(5.9f, 3f, 5f, 3.9f, 5f, 5f)
                verticalLineTo(11f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                horizontalLineTo(9f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                verticalLineTo(5f)
                curveTo(11f, 3.9f, 10.11f, 3f, 9f, 3f)
                moveTo(9f, 7f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                horizontalLineTo(9f)
                close()
            }
        }.build()

        return _SortAlphabeticalDescending!!
    }

@Suppress("ObjectPropertyName")
private var _SortAlphabeticalDescending: ImageVector? = null

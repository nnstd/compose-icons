package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SortNumericAscending: ImageVector
    get() {
        if (_SortNumericAscending != null) {
            return _SortNumericAscending!!
        }
        _SortNumericAscending = ImageVector.Builder(
            name = "SortNumericAscending",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 17f)
                horizontalLineTo(22f)
                lineTo(18f, 21f)
                lineTo(14f, 17f)
                horizontalLineTo(17f)
                verticalLineTo(3f)
                horizontalLineTo(19f)
                verticalLineTo(17f)
                moveTo(9f, 13f)
                horizontalLineTo(7f)
                curveTo(5.9f, 13f, 5f, 13.9f, 5f, 15f)
                verticalLineTo(16f)
                curveTo(5f, 17.11f, 5.9f, 18f, 7f, 18f)
                horizontalLineTo(9f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                verticalLineTo(21f)
                horizontalLineTo(9f)
                curveTo(10.11f, 21f, 11f, 20.11f, 11f, 19f)
                verticalLineTo(15f)
                curveTo(11f, 13.9f, 10.11f, 13f, 9f, 13f)
                moveTo(9f, 16f)
                horizontalLineTo(7f)
                verticalLineTo(15f)
                horizontalLineTo(9f)
                verticalLineTo(16f)
                moveTo(9f, 3f)
                horizontalLineTo(7f)
                curveTo(5.9f, 3f, 5f, 3.9f, 5f, 5f)
                verticalLineTo(9f)
                curveTo(5f, 10.11f, 5.9f, 11f, 7f, 11f)
                horizontalLineTo(9f)
                curveTo(10.11f, 11f, 11f, 10.11f, 11f, 9f)
                verticalLineTo(5f)
                curveTo(11f, 3.9f, 10.11f, 3f, 9f, 3f)
                moveTo(9f, 9f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                horizontalLineTo(9f)
                verticalLineTo(9f)
                close()
            }
        }.build()

        return _SortNumericAscending!!
    }

@Suppress("ObjectPropertyName")
private var _SortNumericAscending: ImageVector? = null

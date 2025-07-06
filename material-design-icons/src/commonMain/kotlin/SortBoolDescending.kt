package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SortBoolDescending: ImageVector
    get() {
        if (_SortBoolDescending != null) {
            return _SortBoolDescending!!
        }
        _SortBoolDescending = ImageVector.Builder(
            name = "SortBoolDescending",
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
                moveTo(5f, 7f)
                curveTo(5f, 8.1f, 5.9f, 9f, 7f, 9f)
                curveTo(8.1f, 9f, 9f, 8.1f, 9f, 7f)
                curveTo(9f, 5.9f, 8.1f, 5f, 7f, 5f)
                curveTo(5.9f, 5f, 5f, 5.9f, 5f, 7f)
                moveTo(7f, 3f)
                curveTo(9.21f, 3f, 11f, 4.79f, 11f, 7f)
                curveTo(11f, 9.21f, 9.21f, 11f, 7f, 11f)
                curveTo(4.79f, 11f, 3f, 9.21f, 3f, 7f)
                curveTo(3f, 4.79f, 4.79f, 3f, 7f, 3f)
                moveTo(7f, 13f)
                curveTo(4.79f, 13f, 3f, 14.79f, 3f, 17f)
                curveTo(3f, 19.21f, 4.79f, 21f, 7f, 21f)
                curveTo(9.21f, 21f, 11f, 19.21f, 11f, 17f)
                curveTo(11f, 14.79f, 9.21f, 13f, 7f, 13f)
                close()
            }
        }.build()

        return _SortBoolDescending!!
    }

@Suppress("ObjectPropertyName")
private var _SortBoolDescending: ImageVector? = null

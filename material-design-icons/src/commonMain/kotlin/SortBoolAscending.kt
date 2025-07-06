package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SortBoolAscending: ImageVector
    get() {
        if (_SortBoolAscending != null) {
            return _SortBoolAscending!!
        }
        _SortBoolAscending = ImageVector.Builder(
            name = "SortBoolAscending",
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
                moveTo(7f, 3f)
                curveTo(4.79f, 3f, 3f, 4.79f, 3f, 7f)
                reflectiveCurveTo(4.79f, 11f, 7f, 11f)
                reflectiveCurveTo(11f, 9.21f, 11f, 7f)
                reflectiveCurveTo(9.21f, 3f, 7f, 3f)
                moveTo(7f, 9f)
                curveTo(5.9f, 9f, 5f, 8.1f, 5f, 7f)
                reflectiveCurveTo(5.9f, 5f, 7f, 5f)
                reflectiveCurveTo(9f, 5.9f, 9f, 7f)
                reflectiveCurveTo(8.1f, 9f, 7f, 9f)
                moveTo(7f, 13f)
                curveTo(4.79f, 13f, 3f, 14.79f, 3f, 17f)
                reflectiveCurveTo(4.79f, 21f, 7f, 21f)
                reflectiveCurveTo(11f, 19.21f, 11f, 17f)
                reflectiveCurveTo(9.21f, 13f, 7f, 13f)
                close()
            }
        }.build()

        return _SortBoolAscending!!
    }

@Suppress("ObjectPropertyName")
private var _SortBoolAscending: ImageVector? = null

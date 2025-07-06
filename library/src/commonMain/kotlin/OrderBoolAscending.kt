package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.OrderBoolAscending: ImageVector
    get() {
        if (_OrderBoolAscending != null) {
            return _OrderBoolAscending!!
        }
        _OrderBoolAscending = ImageVector.Builder(
            name = "OrderBoolAscending",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 3f)
                curveTo(3.79f, 3f, 2f, 4.79f, 2f, 7f)
                reflectiveCurveTo(3.79f, 11f, 6f, 11f)
                reflectiveCurveTo(10f, 9.21f, 10f, 7f)
                reflectiveCurveTo(8.21f, 3f, 6f, 3f)
                moveTo(6f, 9f)
                curveTo(4.9f, 9f, 4f, 8.1f, 4f, 7f)
                reflectiveCurveTo(4.9f, 5f, 6f, 5f)
                reflectiveCurveTo(8f, 5.9f, 8f, 7f)
                reflectiveCurveTo(7.1f, 9f, 6f, 9f)
                moveTo(6f, 13f)
                curveTo(3.79f, 13f, 2f, 14.79f, 2f, 17f)
                reflectiveCurveTo(3.79f, 21f, 6f, 21f)
                reflectiveCurveTo(10f, 19.21f, 10f, 17f)
                reflectiveCurveTo(8.21f, 13f, 6f, 13f)
                moveTo(12f, 5f)
                horizontalLineTo(22f)
                verticalLineTo(7f)
                horizontalLineTo(12f)
                verticalLineTo(5f)
                moveTo(12f, 19f)
                verticalLineTo(17f)
                horizontalLineTo(22f)
                verticalLineTo(19f)
                horizontalLineTo(12f)
                moveTo(12f, 11f)
                horizontalLineTo(22f)
                verticalLineTo(13f)
                horizontalLineTo(12f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _OrderBoolAscending!!
    }

@Suppress("ObjectPropertyName")
private var _OrderBoolAscending: ImageVector? = null

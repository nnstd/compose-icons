package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.OrderBoolDescending: ImageVector
    get() {
        if (_OrderBoolDescending != null) {
            return _OrderBoolDescending!!
        }
        _OrderBoolDescending = ImageVector.Builder(
            name = "OrderBoolDescending",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 13f)
                curveTo(3.79f, 13f, 2f, 14.79f, 2f, 17f)
                reflectiveCurveTo(3.79f, 21f, 6f, 21f)
                reflectiveCurveTo(10f, 19.21f, 10f, 17f)
                reflectiveCurveTo(8.21f, 13f, 6f, 13f)
                moveTo(6f, 19f)
                curveTo(4.9f, 19f, 4f, 18.1f, 4f, 17f)
                reflectiveCurveTo(4.9f, 15f, 6f, 15f)
                reflectiveCurveTo(8f, 15.9f, 8f, 17f)
                reflectiveCurveTo(7.1f, 19f, 6f, 19f)
                moveTo(6f, 3f)
                curveTo(3.79f, 3f, 2f, 4.79f, 2f, 7f)
                reflectiveCurveTo(3.79f, 11f, 6f, 11f)
                reflectiveCurveTo(10f, 9.21f, 10f, 7f)
                reflectiveCurveTo(8.21f, 3f, 6f, 3f)
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

        return _OrderBoolDescending!!
    }

@Suppress("ObjectPropertyName")
private var _OrderBoolDescending: ImageVector? = null

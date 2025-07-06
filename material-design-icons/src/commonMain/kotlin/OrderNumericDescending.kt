package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.OrderNumericDescending: ImageVector
    get() {
        if (_OrderNumericDescending != null) {
            return _OrderNumericDescending!!
        }
        _OrderNumericDescending = ImageVector.Builder(
            name = "OrderNumericDescending",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 11f)
                horizontalLineTo(3f)
                verticalLineTo(9f)
                horizontalLineTo(7f)
                verticalLineTo(8f)
                horizontalLineTo(5f)
                curveTo(3.9f, 8f, 3f, 7.11f, 3f, 6f)
                verticalLineTo(5f)
                curveTo(3f, 3.9f, 3.9f, 3f, 5f, 3f)
                horizontalLineTo(7f)
                curveTo(8.11f, 3f, 9f, 3.9f, 9f, 5f)
                verticalLineTo(9f)
                curveTo(9f, 10.11f, 8.11f, 11f, 7f, 11f)
                moveTo(7f, 5f)
                horizontalLineTo(5f)
                verticalLineTo(6f)
                horizontalLineTo(7f)
                moveTo(5f, 13f)
                horizontalLineTo(7f)
                curveTo(8.11f, 13f, 9f, 13.9f, 9f, 15f)
                verticalLineTo(19f)
                curveTo(9f, 20.11f, 8.11f, 21f, 7f, 21f)
                horizontalLineTo(5f)
                curveTo(3.9f, 21f, 3f, 20.11f, 3f, 19f)
                verticalLineTo(15f)
                curveTo(3f, 13.9f, 3.9f, 13f, 5f, 13f)
                moveTo(5f, 19f)
                horizontalLineTo(7f)
                verticalLineTo(15f)
                horizontalLineTo(5f)
                moveTo(12f, 5f)
                horizontalLineTo(22f)
                verticalLineTo(7f)
                horizontalLineTo(12f)
                moveTo(12f, 19f)
                verticalLineTo(17f)
                horizontalLineTo(22f)
                verticalLineTo(19f)
                moveTo(12f, 11f)
                horizontalLineTo(22f)
                verticalLineTo(13f)
                horizontalLineTo(12f)
                close()
            }
        }.build()

        return _OrderNumericDescending!!
    }

@Suppress("ObjectPropertyName")
private var _OrderNumericDescending: ImageVector? = null

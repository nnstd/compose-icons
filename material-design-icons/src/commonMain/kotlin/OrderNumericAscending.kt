package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.OrderNumericAscending: ImageVector
    get() {
        if (_OrderNumericAscending != null) {
            return _OrderNumericAscending!!
        }
        _OrderNumericAscending = ImageVector.Builder(
            name = "OrderNumericAscending",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 21f)
                horizontalLineTo(3f)
                verticalLineTo(19f)
                horizontalLineTo(7f)
                verticalLineTo(18f)
                horizontalLineTo(5f)
                curveTo(3.9f, 18f, 3f, 17.11f, 3f, 16f)
                verticalLineTo(15f)
                curveTo(3f, 13.9f, 3.9f, 13f, 5f, 13f)
                horizontalLineTo(7f)
                curveTo(8.11f, 13f, 9f, 13.9f, 9f, 15f)
                verticalLineTo(19f)
                curveTo(9f, 20.11f, 8.11f, 21f, 7f, 21f)
                moveTo(7f, 15f)
                horizontalLineTo(5f)
                verticalLineTo(16f)
                horizontalLineTo(7f)
                moveTo(5f, 3f)
                horizontalLineTo(7f)
                curveTo(8.11f, 3f, 9f, 3.9f, 9f, 5f)
                verticalLineTo(9f)
                curveTo(9f, 10.11f, 8.11f, 11f, 7f, 11f)
                horizontalLineTo(5f)
                curveTo(3.9f, 11f, 3f, 10.11f, 3f, 9f)
                verticalLineTo(5f)
                curveTo(3f, 3.9f, 3.9f, 3f, 5f, 3f)
                moveTo(5f, 9f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
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

        return _OrderNumericAscending!!
    }

@Suppress("ObjectPropertyName")
private var _OrderNumericAscending: ImageVector? = null

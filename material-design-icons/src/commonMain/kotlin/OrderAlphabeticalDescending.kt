package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.OrderAlphabeticalDescending: ImageVector
    get() {
        if (_OrderAlphabeticalDescending != null) {
            return _OrderAlphabeticalDescending!!
        }
        _OrderAlphabeticalDescending = ImageVector.Builder(
            name = "OrderAlphabeticalDescending",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 13f)
                horizontalLineTo(5f)
                curveTo(3.9f, 13f, 3f, 13.9f, 3f, 15f)
                verticalLineTo(21f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                horizontalLineTo(7f)
                verticalLineTo(21f)
                horizontalLineTo(9f)
                verticalLineTo(15f)
                curveTo(9f, 13.9f, 8.11f, 13f, 7f, 13f)
                moveTo(7f, 17f)
                horizontalLineTo(5f)
                verticalLineTo(15f)
                horizontalLineTo(7f)
                moveTo(9f, 3f)
                verticalLineTo(5f)
                lineTo(5.67f, 9f)
                horizontalLineTo(9f)
                verticalLineTo(11f)
                horizontalLineTo(3f)
                verticalLineTo(9f)
                lineTo(6.33f, 5f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
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

        return _OrderAlphabeticalDescending!!
    }

@Suppress("ObjectPropertyName")
private var _OrderAlphabeticalDescending: ImageVector? = null

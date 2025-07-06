package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShoppingOutline: ImageVector
    get() {
        if (_ShoppingOutline != null) {
            return _ShoppingOutline!!
        }
        _ShoppingOutline = ImageVector.Builder(
            name = "ShoppingOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 6f)
                horizontalLineTo(17f)
                curveTo(17f, 3.2f, 14.8f, 1f, 12f, 1f)
                reflectiveCurveTo(7f, 3.2f, 7f, 6f)
                horizontalLineTo(5f)
                curveTo(3.9f, 6f, 3f, 6.9f, 3f, 8f)
                verticalLineTo(20f)
                curveTo(3f, 21.1f, 3.9f, 22f, 5f, 22f)
                horizontalLineTo(19f)
                curveTo(20.1f, 22f, 21f, 21.1f, 21f, 20f)
                verticalLineTo(8f)
                curveTo(21f, 6.9f, 20.1f, 6f, 19f, 6f)
                moveTo(12f, 3f)
                curveTo(13.7f, 3f, 15f, 4.3f, 15f, 6f)
                horizontalLineTo(9f)
                curveTo(9f, 4.3f, 10.3f, 3f, 12f, 3f)
                moveTo(19f, 20f)
                horizontalLineTo(5f)
                verticalLineTo(8f)
                horizontalLineTo(19f)
                verticalLineTo(20f)
                moveTo(12f, 12f)
                curveTo(10.3f, 12f, 9f, 10.7f, 9f, 9f)
                horizontalLineTo(7f)
                curveTo(7f, 11.8f, 9.2f, 14f, 12f, 14f)
                reflectiveCurveTo(17f, 11.8f, 17f, 9f)
                horizontalLineTo(15f)
                curveTo(15f, 10.7f, 13.7f, 12f, 12f, 12f)
                close()
            }
        }.build()

        return _ShoppingOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ShoppingOutline: ImageVector? = null

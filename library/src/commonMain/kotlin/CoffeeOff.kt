package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CoffeeOff: ImageVector
    get() {
        if (_CoffeeOff != null) {
            return _CoffeeOff!!
        }
        _CoffeeOff = ImageVector.Builder(
            name = "CoffeeOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.27f, 2f)
                lineTo(22f, 20.72f)
                lineTo(20.72f, 22f)
                lineTo(19.73f, 21f)
                horizontalLineTo(2f)
                verticalLineTo(19f)
                horizontalLineTo(17.73f)
                lineTo(15.44f, 16.71f)
                curveTo(15f, 16.89f, 14.5f, 17f, 14f, 17f)
                horizontalLineTo(8f)
                curveTo(5.79f, 17f, 4f, 15.21f, 4f, 13f)
                verticalLineTo(5.27f)
                lineTo(2f, 3.27f)
                lineTo(3.27f, 2f)
                moveTo(22f, 5f)
                verticalLineTo(8f)
                curveTo(22f, 9.1f, 21.1f, 10f, 20f, 10f)
                horizontalLineTo(18f)
                verticalLineTo(13f)
                curveTo(18f, 13.36f, 17.94f, 13.7f, 17.85f, 14.04f)
                lineTo(6.81f, 3f)
                horizontalLineTo(20f)
                curveTo(21.1f, 3f, 22f, 3.89f, 22f, 5f)
                moveTo(20f, 5f)
                horizontalLineTo(18f)
                verticalLineTo(8f)
                horizontalLineTo(20f)
                verticalLineTo(5f)
                close()
            }
        }.build()

        return _CoffeeOff!!
    }

@Suppress("ObjectPropertyName")
private var _CoffeeOff: ImageVector? = null

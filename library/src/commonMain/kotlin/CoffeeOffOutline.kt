package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CoffeeOffOutline: ImageVector
    get() {
        if (_CoffeeOffOutline != null) {
            return _CoffeeOffOutline!!
        }
        _CoffeeOffOutline = ImageVector.Builder(
            name = "CoffeeOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 3.27f)
                lineTo(4f, 5.27f)
                verticalLineTo(13f)
                curveTo(4f, 15.21f, 5.79f, 17f, 8f, 17f)
                horizontalLineTo(14f)
                curveTo(14.5f, 17f, 15f, 16.89f, 15.44f, 16.71f)
                lineTo(17.73f, 19f)
                horizontalLineTo(2f)
                verticalLineTo(21f)
                horizontalLineTo(19.73f)
                lineTo(20.72f, 22f)
                lineTo(22f, 20.72f)
                lineTo(3.27f, 2f)
                lineTo(2f, 3.27f)
                moveTo(8f, 15f)
                curveTo(6.9f, 15f, 6f, 14.1f, 6f, 13f)
                verticalLineTo(7.27f)
                lineTo(13.73f, 15f)
                horizontalLineTo(8f)
                moveTo(20f, 3f)
                horizontalLineTo(6.81f)
                lineTo(8.81f, 5f)
                horizontalLineTo(16f)
                verticalLineTo(12.19f)
                lineTo(17.85f, 14.04f)
                curveTo(17.94f, 13.7f, 18f, 13.36f, 18f, 13f)
                verticalLineTo(10f)
                horizontalLineTo(20f)
                curveTo(21.1f, 10f, 22f, 9.1f, 22f, 8f)
                verticalLineTo(5f)
                curveTo(22f, 3.9f, 21.1f, 3f, 20f, 3f)
                moveTo(20f, 8f)
                horizontalLineTo(18f)
                verticalLineTo(5f)
                horizontalLineTo(20f)
                verticalLineTo(8f)
                close()
            }
        }.build()

        return _CoffeeOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CoffeeOffOutline: ImageVector? = null

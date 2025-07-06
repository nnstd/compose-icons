package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FoodOffOutline: ImageVector
    get() {
        if (_FoodOffOutline != null) {
            return _FoodOffOutline!!
        }
        _FoodOffOutline = ImageVector.Builder(
            name = "FoodOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 21f)
                horizontalLineTo(16f)
                verticalLineTo(22f)
                curveTo(16f, 22.54f, 15.56f, 23f, 15f, 23f)
                horizontalLineTo(2f)
                curveTo(1.45f, 23f, 1f, 22.54f, 1f, 22f)
                verticalLineTo(21f)
                moveTo(20.5f, 23.31f)
                lineTo(16f, 18.83f)
                verticalLineTo(19f)
                horizontalLineTo(1f)
                verticalLineTo(17f)
                horizontalLineTo(14.17f)
                lineTo(12.17f, 15f)
                horizontalLineTo(1f)
                curveTo(1f, 11.76f, 3.46f, 9.83f, 6.38f, 9.21f)
                lineTo(0.68f, 3.5f)
                lineTo(2.1f, 2.1f)
                lineTo(13f, 13f)
                lineTo(15f, 15f)
                lineTo(21.9f, 21.9f)
                lineTo(20.5f, 23.31f)
                moveTo(10.17f, 13f)
                lineTo(8.17f, 11f)
                curveTo(6.75f, 11.06f, 4.65f, 11.56f, 3.62f, 13f)
                horizontalLineTo(10.17f)
                moveTo(23f, 5f)
                horizontalLineTo(18f)
                verticalLineTo(1f)
                horizontalLineTo(16f)
                verticalLineTo(5f)
                horizontalLineTo(11f)
                lineTo(11.23f, 7f)
                horizontalLineTo(20.79f)
                lineTo(19.79f, 16.97f)
                lineTo(21.62f, 18.8f)
                lineTo(23f, 5f)
                close()
            }
        }.build()

        return _FoodOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FoodOffOutline: ImageVector? = null

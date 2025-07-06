package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FoodOff: ImageVector
    get() {
        if (_FoodOff != null) {
            return _FoodOff!!
        }
        _FoodOff = ImageVector.Builder(
            name = "FoodOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.35f, 8.5f)
                lineTo(11f, 5f)
                horizontalLineTo(16f)
                verticalLineTo(1f)
                horizontalLineTo(18f)
                verticalLineTo(5f)
                horizontalLineTo(23f)
                lineTo(21.62f, 18.79f)
                lineTo(11.35f, 8.5f)
                moveTo(1f, 21f)
                verticalLineTo(22f)
                curveTo(1f, 22.55f, 1.45f, 23f, 2f, 23f)
                horizontalLineTo(15f)
                curveTo(15.55f, 23f, 16f, 22.55f, 16f, 22f)
                verticalLineTo(21f)
                horizontalLineTo(1f)
                moveTo(21.9f, 21.9f)
                lineTo(2.1f, 2.1f)
                lineTo(0.69f, 3.5f)
                lineTo(6.39f, 9.21f)
                curveTo(3.28f, 9.87f, 1f, 12f, 1f, 15f)
                horizontalLineTo(12.17f)
                lineTo(14.17f, 17f)
                horizontalLineTo(1f)
                verticalLineTo(19f)
                horizontalLineTo(16f)
                verticalLineTo(18.83f)
                lineTo(20.5f, 23.32f)
                lineTo(21.9f, 21.9f)
                close()
            }
        }.build()

        return _FoodOff!!
    }

@Suppress("ObjectPropertyName")
private var _FoodOff: ImageVector? = null

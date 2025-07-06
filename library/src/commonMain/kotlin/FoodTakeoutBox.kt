package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FoodTakeoutBox: ImageVector
    get() {
        if (_FoodTakeoutBox != null) {
            return _FoodTakeoutBox!!
        }
        _FoodTakeoutBox = ImageVector.Builder(
            name = "FoodTakeoutBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.26f, 11f)
                horizontalLineTo(18.74f)
                lineTo(18.07f, 20f)
                horizontalLineTo(5.93f)
                lineTo(5.26f, 11f)
                moveTo(9f, 4f)
                horizontalLineTo(14.97f)
                lineTo(19f, 7.38f)
                lineTo(20.59f, 5.79f)
                lineTo(22f, 7.21f)
                lineTo(19.21f, 10f)
                horizontalLineTo(4.79f)
                lineTo(2f, 7.21f)
                lineTo(3.41f, 5.8f)
                lineTo(5f, 7.38f)
                lineTo(9f, 4f)
                close()
            }
        }.build()

        return _FoodTakeoutBox!!
    }

@Suppress("ObjectPropertyName")
private var _FoodTakeoutBox: ImageVector? = null

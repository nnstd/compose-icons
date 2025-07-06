package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FoodTakeoutBoxOutline: ImageVector
    get() {
        if (_FoodTakeoutBoxOutline != null) {
            return _FoodTakeoutBoxOutline!!
        }
        _FoodTakeoutBoxOutline = ImageVector.Builder(
            name = "FoodTakeoutBoxOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.79f, 18f)
                lineTo(7.28f, 11f)
                horizontalLineTo(16.74f)
                lineTo(16.23f, 18f)
                horizontalLineTo(7.79f)
                moveTo(9.83f, 5f)
                horizontalLineTo(14.16f)
                lineTo(16.96f, 7.73f)
                lineTo(16.87f, 9f)
                horizontalLineTo(7.12f)
                lineTo(7.03f, 7.73f)
                lineTo(9.83f, 5f)
                moveTo(22f, 7.46f)
                lineTo(20.59f, 6.05f)
                lineTo(19f, 7.63f)
                lineTo(19.03f, 7.07f)
                lineTo(15f, 3f)
                horizontalLineTo(9f)
                lineTo(4.97f, 7.07f)
                lineTo(5f, 7.57f)
                lineTo(3.41f, 6f)
                lineTo(2f, 7.44f)
                lineTo(5.23f, 10.55f)
                lineTo(5.93f, 20f)
                horizontalLineTo(18.07f)
                lineTo(18.77f, 10.56f)
                lineTo(22f, 7.46f)
                close()
            }
        }.build()

        return _FoodTakeoutBoxOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FoodTakeoutBoxOutline: ImageVector? = null

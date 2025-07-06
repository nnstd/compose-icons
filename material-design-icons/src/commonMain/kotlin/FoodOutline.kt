package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FoodOutline: ImageVector
    get() {
        if (_FoodOutline != null) {
            return _FoodOutline!!
        }
        _FoodOutline = ImageVector.Builder(
            name = "FoodOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 22f)
                curveTo(1f, 22.54f, 1.45f, 23f, 2f, 23f)
                horizontalLineTo(15f)
                curveTo(15.56f, 23f, 16f, 22.54f, 16f, 22f)
                verticalLineTo(21f)
                horizontalLineTo(1f)
                verticalLineTo(22f)
                moveTo(8.5f, 9f)
                curveTo(4.75f, 9f, 1f, 11f, 1f, 15f)
                horizontalLineTo(16f)
                curveTo(16f, 11f, 12.25f, 9f, 8.5f, 9f)
                moveTo(3.62f, 13f)
                curveTo(4.73f, 11.45f, 7.09f, 11f, 8.5f, 11f)
                reflectiveCurveTo(12.27f, 11.45f, 13.38f, 13f)
                horizontalLineTo(3.62f)
                moveTo(1f, 17f)
                horizontalLineTo(16f)
                verticalLineTo(19f)
                horizontalLineTo(1f)
                verticalLineTo(17f)
                moveTo(18f, 5f)
                verticalLineTo(1f)
                horizontalLineTo(16f)
                verticalLineTo(5f)
                horizontalLineTo(11f)
                lineTo(11.23f, 7f)
                horizontalLineTo(20.79f)
                lineTo(19.39f, 21f)
                horizontalLineTo(18f)
                verticalLineTo(23f)
                horizontalLineTo(19.72f)
                curveTo(20.56f, 23f, 21.25f, 22.35f, 21.35f, 21.53f)
                lineTo(23f, 5f)
                horizontalLineTo(18f)
                close()
            }
        }.build()

        return _FoodOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FoodOutline: ImageVector? = null

package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FoodHalal: ImageVector
    get() {
        if (_FoodHalal != null) {
            return _FoodHalal!!
        }
        _FoodHalal = ImageVector.Builder(
            name = "FoodHalal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 5f)
                verticalLineTo(15f)
                curveTo(7f, 16.11f, 6.11f, 17f, 5f, 17f)
                horizontalLineTo(4f)
                curveTo(3.45f, 17f, 3f, 16.55f, 3f, 16f)
                verticalLineTo(13f)
                horizontalLineTo(1f)
                verticalLineTo(16f)
                curveTo(1f, 17.66f, 2.34f, 19f, 4f, 19f)
                horizontalLineTo(5f)
                curveTo(7.21f, 19f, 9f, 17.21f, 9f, 15f)
                verticalLineTo(5f)
                moveTo(23f, 13.38f)
                lineTo(21.77f, 12.15f)
                curveTo(21.03f, 11.41f, 20.04f, 11f, 19f, 11f)
                horizontalLineTo(17f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                curveTo(19.5f, 13f, 20f, 13.2f, 20.35f, 13.56f)
                lineTo(20.7f, 13.91f)
                lineTo(19.5f, 14.6f)
                curveTo(19.04f, 14.86f, 18.53f, 15f, 18f, 15f)
                horizontalLineTo(17f)
                curveTo(16.44f, 15f, 16f, 14.56f, 16f, 14f)
                verticalLineTo(6f)
                horizontalLineTo(14f)
                verticalLineTo(9.81f)
                lineTo(13.38f, 9.12f)
                curveTo(12.7f, 8.37f, 11.6f, 8f, 10.59f, 8f)
                horizontalLineTo(10f)
                verticalLineTo(10f)
                horizontalLineTo(10.59f)
                curveTo(11.23f, 10f, 11.84f, 10.25f, 12.29f, 10.71f)
                lineTo(14f, 12.41f)
                verticalLineTo(14f)
                curveTo(14f, 15.12f, 13.12f, 16f, 12f, 16f)
                horizontalLineTo(10f)
                verticalLineTo(18f)
                horizontalLineTo(12f)
                curveTo(13.37f, 18f, 14.5f, 17.3f, 15.17f, 16.24f)
                curveTo(15.63f, 16.71f, 16.25f, 17f, 17f, 17f)
                horizontalLineTo(18f)
                curveTo(18.88f, 17f, 19.74f, 16.77f, 20.5f, 16.33f)
                lineTo(23f, 14.89f)
                close()
            }
        }.build()

        return _FoodHalal!!
    }

@Suppress("ObjectPropertyName")
private var _FoodHalal: ImageVector? = null

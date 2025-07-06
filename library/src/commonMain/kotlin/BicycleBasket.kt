package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BicycleBasket: ImageVector
    get() {
        if (_BicycleBasket != null) {
            return _BicycleBasket!!
        }
        _BicycleBasket = ImageVector.Builder(
            name = "BicycleBasket",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.74f, 13.36f)
                lineTo(14.14f, 7.71f)
                lineTo(13.06f, 5.5f)
                horizontalLineTo(10.5f)
                verticalLineTo(4f)
                horizontalLineTo(14f)
                lineTo(14.73f, 5.5f)
                horizontalLineTo(21.75f)
                lineTo(20.75f, 9f)
                horizontalLineTo(16.44f)
                lineTo(17.11f, 10.37f)
                curveTo(17.69f, 10.13f, 18.33f, 10f, 19f, 10f)
                curveTo(21.76f, 10f, 24f, 12.24f, 24f, 15f)
                curveTo(24f, 17.76f, 21.76f, 20f, 19f, 20f)
                curveTo(16.24f, 20f, 14f, 17.76f, 14f, 15f)
                curveTo(14f, 13.45f, 14.71f, 12.06f, 15.82f, 11.15f)
                lineTo(15f, 9.5f)
                lineTo(12.25f, 16f)
                horizontalLineTo(9.9f)
                curveTo(9.44f, 18.28f, 7.42f, 20f, 5f, 20f)
                curveTo(2.24f, 20f, 0f, 17.76f, 0f, 15f)
                curveTo(0f, 12.24f, 2.24f, 10f, 5f, 10f)
                curveTo(7.59f, 10f, 9.72f, 11.97f, 10f, 14.5f)
                horizontalLineTo(10.58f)
                lineTo(8.3f, 9f)
                horizontalLineTo(7.5f)
                curveTo(7.09f, 9f, 6.75f, 8.66f, 6.75f, 8.25f)
                curveTo(6.75f, 7.84f, 7.09f, 7.5f, 7.5f, 7.5f)
                horizontalLineTo(10.25f)
                curveTo(10.66f, 7.5f, 11f, 7.84f, 11f, 8.25f)
                curveTo(11f, 8.66f, 10.66f, 9f, 10.25f, 9f)
                horizontalLineTo(9.97f)
                lineTo(11.74f, 13.36f)
                moveTo(5f, 11.5f)
                curveTo(3.07f, 11.5f, 1.5f, 13.07f, 1.5f, 15f)
                curveTo(1.5f, 16.93f, 3.07f, 18.5f, 5f, 18.5f)
                curveTo(6.59f, 18.5f, 7.93f, 17.45f, 8.36f, 16f)
                horizontalLineTo(4f)
                verticalLineTo(14.5f)
                horizontalLineTo(8.47f)
                curveTo(8.22f, 12.8f, 6.76f, 11.5f, 5f, 11.5f)
                moveTo(19f, 11.5f)
                curveTo(18.57f, 11.5f, 18.15f, 11.58f, 17.77f, 11.72f)
                lineTo(19.7f, 15.68f)
                lineTo(18.35f, 16.34f)
                lineTo(16.5f, 12.55f)
                curveTo(15.88f, 13.18f, 15.5f, 14.05f, 15.5f, 15f)
                curveTo(15.5f, 16.93f, 17.07f, 18.5f, 19f, 18.5f)
                curveTo(20.93f, 18.5f, 22.5f, 16.93f, 22.5f, 15f)
                curveTo(22.5f, 13.07f, 20.93f, 11.5f, 19f, 11.5f)
                close()
            }
        }.build()

        return _BicycleBasket!!
    }

@Suppress("ObjectPropertyName")
private var _BicycleBasket: ImageVector? = null

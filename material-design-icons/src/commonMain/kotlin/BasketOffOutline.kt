package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BasketOffOutline: ImageVector
    get() {
        if (_BasketOffOutline != null) {
            return _BasketOffOutline!!
        }
        _BasketOffOutline = ImageVector.Builder(
            name = "BasketOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(6.92f, 8.81f)
                lineTo(6.79f, 9f)
                horizontalLineTo(2f)
                curveTo(1.45f, 9f, 1f, 9.45f, 1f, 10f)
                curveTo(1f, 10.09f, 1f, 10.18f, 1.04f, 10.27f)
                lineTo(3.58f, 19.54f)
                curveTo(3.81f, 20.38f, 4.58f, 21f, 5.5f, 21f)
                horizontalLineTo(18.5f)
                curveTo(18.68f, 21f, 18.86f, 20.96f, 19.03f, 20.92f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                moveTo(5.5f, 19f)
                lineTo(3.31f, 11f)
                horizontalLineTo(9.11f)
                lineTo(11.26f, 13.15f)
                curveTo(10.5f, 13.44f, 10f, 14.16f, 10f, 15f)
                curveTo(10f, 16.1f, 10.9f, 17f, 12f, 17f)
                curveTo(12.84f, 17f, 13.56f, 16.5f, 13.85f, 15.74f)
                lineTo(17.11f, 19f)
                horizontalLineTo(5.5f)
                moveTo(23f, 10f)
                lineTo(22.97f, 10.27f)
                lineTo(20.93f, 17.73f)
                lineTo(19.3f, 16.1f)
                lineTo(20.7f, 11f)
                horizontalLineTo(14.2f)
                lineTo(12.2f, 9f)
                horizontalLineTo(14.8f)
                lineTo(12f, 4.8f)
                lineTo(10.4f, 7.2f)
                lineTo(8.96f, 5.76f)
                lineTo(11.17f, 2.45f)
                curveTo(11.36f, 2.16f, 11.68f, 2f, 12f, 2f)
                reflectiveCurveTo(12.64f, 2.16f, 12.83f, 2.44f)
                lineTo(17.21f, 9f)
                horizontalLineTo(22f)
                curveTo(22.55f, 9f, 23f, 9.45f, 23f, 10f)
                close()
            }
        }.build()

        return _BasketOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BasketOffOutline: ImageVector? = null

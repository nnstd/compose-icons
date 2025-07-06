package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BasketCheckOutline: ImageVector
    get() {
        if (_BasketCheckOutline != null) {
            return _BasketCheckOutline!!
        }
        _BasketCheckOutline = ImageVector.Builder(
            name = "BasketCheckOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.63f, 16.27f)
                lineTo(17.76f, 20.17f)
                lineTo(16.41f, 18.8f)
                lineTo(15f, 20.22f)
                lineTo(17.75f, 23f)
                lineTo(23.03f, 17.68f)
                lineTo(21.63f, 16.27f)
                moveTo(14f, 15f)
                curveTo(14f, 16.1f, 13.1f, 17f, 12f, 17f)
                reflectiveCurveTo(10f, 16.1f, 10f, 15f)
                reflectiveCurveTo(10.9f, 13f, 12f, 13f)
                reflectiveCurveTo(14f, 13.9f, 14f, 15f)
                moveTo(13f, 20f)
                curveTo(13f, 19.66f, 13.04f, 19.33f, 13.09f, 19f)
                horizontalLineTo(5.5f)
                lineTo(3.31f, 11f)
                horizontalLineTo(20.7f)
                lineTo(19.86f, 14.07f)
                curveTo(20.54f, 14.17f, 21.18f, 14.37f, 21.76f, 14.68f)
                lineTo(22.97f, 10.27f)
                lineTo(23f, 10f)
                curveTo(23f, 9.45f, 22.55f, 9f, 22f, 9f)
                horizontalLineTo(17.21f)
                lineTo(12.83f, 2.44f)
                curveTo(12.64f, 2.16f, 12.32f, 2f, 12f, 2f)
                reflectiveCurveTo(11.36f, 2.16f, 11.17f, 2.45f)
                lineTo(6.79f, 9f)
                horizontalLineTo(2f)
                curveTo(1.45f, 9f, 1f, 9.45f, 1f, 10f)
                curveTo(1f, 10.09f, 1f, 10.18f, 1.04f, 10.27f)
                lineTo(3.58f, 19.54f)
                curveTo(3.81f, 20.38f, 4.58f, 21f, 5.5f, 21f)
                horizontalLineTo(13.09f)
                curveTo(13.04f, 20.67f, 13f, 20.34f, 13f, 20f)
                moveTo(12f, 4.8f)
                lineTo(14.8f, 9f)
                horizontalLineTo(9.2f)
                lineTo(12f, 4.8f)
                close()
            }
        }.build()

        return _BasketCheckOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BasketCheckOutline: ImageVector? = null

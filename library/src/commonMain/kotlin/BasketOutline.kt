package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BasketOutline: ImageVector
    get() {
        if (_BasketOutline != null) {
            return _BasketOutline!!
        }
        _BasketOutline = ImageVector.Builder(
            name = "BasketOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 9f)
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
                horizontalLineTo(18.5f)
                curveTo(19.42f, 21f, 20.19f, 20.38f, 20.43f, 19.54f)
                lineTo(22.97f, 10.27f)
                lineTo(23f, 10f)
                curveTo(23f, 9.45f, 22.55f, 9f, 22f, 9f)
                moveTo(12f, 4.8f)
                lineTo(14.8f, 9f)
                horizontalLineTo(9.2f)
                lineTo(12f, 4.8f)
                moveTo(18.5f, 19f)
                lineTo(5.5f, 19f)
                lineTo(3.31f, 11f)
                horizontalLineTo(20.7f)
                lineTo(18.5f, 19f)
                moveTo(12f, 13f)
                curveTo(10.9f, 13f, 10f, 13.9f, 10f, 15f)
                reflectiveCurveTo(10.9f, 17f, 12f, 17f)
                reflectiveCurveTo(14f, 16.1f, 14f, 15f)
                reflectiveCurveTo(13.1f, 13f, 12f, 13f)
                close()
            }
        }.build()

        return _BasketOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BasketOutline: ImageVector? = null

package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BasketRemove: ImageVector
    get() {
        if (_BasketRemove != null) {
            return _BasketRemove!!
        }
        _BasketRemove = ImageVector.Builder(
            name = "BasketRemove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.54f, 16.88f)
                lineTo(20.41f, 19f)
                lineTo(22.54f, 21.12f)
                lineTo(21.12f, 22.54f)
                lineTo(19f, 20.41f)
                lineTo(16.88f, 22.54f)
                lineTo(15.47f, 21.12f)
                lineTo(17.59f, 19f)
                lineTo(15.47f, 16.88f)
                lineTo(16.88f, 15.47f)
                lineTo(19f, 17.59f)
                lineTo(21.12f, 15.46f)
                lineTo(22.54f, 16.88f)
                moveTo(23f, 10f)
                lineTo(22.96f, 10.29f)
                lineTo(22f, 13.8f)
                curveTo(21.11f, 13.29f, 20.09f, 13f, 19f, 13f)
                curveTo(15.69f, 13f, 13f, 15.69f, 13f, 19f)
                curveTo(13f, 19.7f, 13.13f, 20.37f, 13.35f, 21f)
                horizontalLineTo(5.5f)
                curveTo(4.72f, 21f, 4.04f, 20.55f, 3.71f, 19.9f)
                lineTo(1.1f, 10.44f)
                lineTo(1f, 10f)
                curveTo(1f, 9.45f, 1.45f, 9f, 2f, 9f)
                horizontalLineTo(6.58f)
                lineTo(11.18f, 2.43f)
                curveTo(11.36f, 2.17f, 11.66f, 2f, 12f, 2f)
                reflectiveCurveTo(12.65f, 2.17f, 12.83f, 2.44f)
                lineTo(17.42f, 9f)
                horizontalLineTo(22f)
                curveTo(22.55f, 9f, 23f, 9.45f, 23f, 10f)
                moveTo(14f, 15f)
                curveTo(14f, 13.9f, 13.11f, 13f, 12f, 13f)
                reflectiveCurveTo(10f, 13.9f, 10f, 15f)
                reflectiveCurveTo(10.9f, 17f, 12f, 17f)
                reflectiveCurveTo(14f, 16.11f, 14f, 15f)
                moveTo(15f, 9f)
                lineTo(12f, 4.74f)
                lineTo(9f, 9f)
                horizontalLineTo(15f)
                close()
            }
        }.build()

        return _BasketRemove!!
    }

@Suppress("ObjectPropertyName")
private var _BasketRemove: ImageVector? = null

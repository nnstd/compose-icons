package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BasketMinus: ImageVector
    get() {
        if (_BasketMinus != null) {
            return _BasketMinus!!
        }
        _BasketMinus = ImageVector.Builder(
            name = "BasketMinus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(15f)
                verticalLineTo(18f)
                horizontalLineTo(23f)
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

        return _BasketMinus!!
    }

@Suppress("ObjectPropertyName")
private var _BasketMinus: ImageVector? = null

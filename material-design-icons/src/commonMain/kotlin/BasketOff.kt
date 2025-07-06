package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BasketOff: ImageVector
    get() {
        if (_BasketOff != null) {
            return _BasketOff!!
        }
        _BasketOff = ImageVector.Builder(
            name = "BasketOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 10f)
                lineTo(22.96f, 10.29f)
                lineTo(20.9f, 17.7f)
                lineTo(12.2f, 9f)
                horizontalLineTo(15f)
                lineTo(12f, 4.74f)
                lineTo(10.32f, 7.12f)
                lineTo(8.89f, 5.69f)
                lineTo(11.18f, 2.43f)
                curveTo(11.36f, 2.17f, 11.66f, 2f, 12f, 2f)
                reflectiveCurveTo(12.65f, 2.17f, 12.83f, 2.44f)
                lineTo(17.42f, 9f)
                horizontalLineTo(22f)
                curveTo(22.55f, 9f, 23f, 9.45f, 23f, 10f)
                moveTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(19.03f, 20.92f)
                curveTo(18.86f, 20.97f, 18.68f, 21f, 18.5f, 21f)
                horizontalLineTo(5.5f)
                curveTo(4.72f, 21f, 4.04f, 20.55f, 3.71f, 19.9f)
                lineTo(1.1f, 10.44f)
                lineTo(1f, 10f)
                curveTo(1f, 9.45f, 1.45f, 9f, 2f, 9f)
                horizontalLineTo(6.58f)
                lineTo(6.8f, 8.69f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                moveTo(13.85f, 15.74f)
                lineTo(11.26f, 13.15f)
                curveTo(10.5f, 13.44f, 10f, 14.16f, 10f, 15f)
                curveTo(10f, 16.11f, 10.9f, 17f, 12f, 17f)
                curveTo(12.84f, 17f, 13.56f, 16.5f, 13.85f, 15.74f)
                close()
            }
        }.build()

        return _BasketOff!!
    }

@Suppress("ObjectPropertyName")
private var _BasketOff: ImageVector? = null

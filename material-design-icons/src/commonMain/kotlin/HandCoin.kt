package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HandCoin: ImageVector
    get() {
        if (_HandCoin != null) {
            return _HandCoin!!
        }
        _HandCoin = ImageVector.Builder(
            name = "HandCoin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 12f)
                curveTo(18.76f, 12f, 21f, 9.76f, 21f, 7f)
                reflectiveCurveTo(18.76f, 2f, 16f, 2f)
                reflectiveCurveTo(11f, 4.24f, 11f, 7f)
                reflectiveCurveTo(13.24f, 12f, 16f, 12f)
                moveTo(21.45f, 17.6f)
                curveTo(21.06f, 17.2f, 20.57f, 17f, 20f, 17f)
                horizontalLineTo(13f)
                lineTo(10.92f, 16.27f)
                lineTo(11.25f, 15.33f)
                lineTo(13f, 16f)
                horizontalLineTo(15.8f)
                curveTo(16.15f, 16f, 16.43f, 15.86f, 16.66f, 15.63f)
                reflectiveCurveTo(17f, 15.12f, 17f, 14.81f)
                curveTo(17f, 14.27f, 16.74f, 13.9f, 16.22f, 13.69f)
                lineTo(8.95f, 11f)
                horizontalLineTo(7f)
                verticalLineTo(20f)
                lineTo(14f, 22f)
                lineTo(22.03f, 19f)
                curveTo(22.04f, 18.47f, 21.84f, 18f, 21.45f, 17.6f)
                moveTo(5f, 11f)
                horizontalLineTo(0.984f)
                verticalLineTo(22f)
                horizontalLineTo(5f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _HandCoin!!
    }

@Suppress("ObjectPropertyName")
private var _HandCoin: ImageVector? = null

package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AirplaneAlert: ImageVector
    get() {
        if (_AirplaneAlert != null) {
            return _AirplaneAlert!!
        }
        _AirplaneAlert = ImageVector.Builder(
            name = "AirplaneAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.56f, 3.91f)
                curveTo(18.15f, 4.5f, 18.15f, 5.45f, 17.56f, 6.03f)
                lineTo(13.67f, 9.92f)
                lineTo(15.79f, 19.11f)
                lineTo(14.38f, 20.53f)
                lineTo(10.5f, 13.1f)
                lineTo(6.6f, 17f)
                lineTo(6.96f, 19.47f)
                lineTo(5.89f, 20.53f)
                lineTo(4.13f, 17.35f)
                lineTo(0.944f, 15.58f)
                lineTo(2f, 14.5f)
                lineTo(4.5f, 14.87f)
                lineTo(8.37f, 11f)
                lineTo(0.944f, 7.09f)
                lineTo(2.36f, 5.68f)
                lineTo(11.55f, 7.8f)
                lineTo(15.44f, 3.91f)
                curveTo(16f, 3.33f, 17f, 3.33f, 17.56f, 3.91f)
                moveTo(20f, 7f)
                verticalLineTo(13f)
                horizontalLineTo(22f)
                verticalLineTo(7f)
                horizontalLineTo(20f)
                moveTo(20f, 17f)
                horizontalLineTo(22f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _AirplaneAlert!!
    }

@Suppress("ObjectPropertyName")
private var _AirplaneAlert: ImageVector? = null

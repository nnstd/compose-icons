package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WhiteBalanceSunny: ImageVector
    get() {
        if (_WhiteBalanceSunny != null) {
            return _WhiteBalanceSunny!!
        }
        _WhiteBalanceSunny = ImageVector.Builder(
            name = "WhiteBalanceSunny",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.55f, 19.09f)
                lineTo(4.96f, 20.5f)
                lineTo(6.76f, 18.71f)
                lineTo(5.34f, 17.29f)
                moveTo(12f, 6f)
                curveTo(8.69f, 6f, 6f, 8.69f, 6f, 12f)
                reflectiveCurveTo(8.69f, 18f, 12f, 18f)
                reflectiveCurveTo(18f, 15.31f, 18f, 12f)
                curveTo(18f, 8.68f, 15.31f, 6f, 12f, 6f)
                moveTo(20f, 13f)
                horizontalLineTo(23f)
                verticalLineTo(11f)
                horizontalLineTo(20f)
                moveTo(17.24f, 18.71f)
                lineTo(19.04f, 20.5f)
                lineTo(20.45f, 19.09f)
                lineTo(18.66f, 17.29f)
                moveTo(20.45f, 5f)
                lineTo(19.04f, 3.6f)
                lineTo(17.24f, 5.39f)
                lineTo(18.66f, 6.81f)
                moveTo(13f, 1f)
                horizontalLineTo(11f)
                verticalLineTo(4f)
                horizontalLineTo(13f)
                moveTo(6.76f, 5.39f)
                lineTo(4.96f, 3.6f)
                lineTo(3.55f, 5f)
                lineTo(5.34f, 6.81f)
                lineTo(6.76f, 5.39f)
                moveTo(1f, 13f)
                horizontalLineTo(4f)
                verticalLineTo(11f)
                horizontalLineTo(1f)
                moveTo(13f, 20f)
                horizontalLineTo(11f)
                verticalLineTo(23f)
                horizontalLineTo(13f)
            }
        }.build()

        return _WhiteBalanceSunny!!
    }

@Suppress("ObjectPropertyName")
private var _WhiteBalanceSunny: ImageVector? = null

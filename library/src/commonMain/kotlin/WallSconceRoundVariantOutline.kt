package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WallSconceRoundVariantOutline: ImageVector
    get() {
        if (_WallSconceRoundVariantOutline != null) {
            return _WallSconceRoundVariantOutline!!
        }
        _WallSconceRoundVariantOutline = ImageVector.Builder(
            name = "WallSconceRoundVariantOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 5f)
                verticalLineTo(8f)
                horizontalLineTo(13f)
                verticalLineTo(5f)
                horizontalLineTo(11f)
                moveTo(4.91f, 7.5f)
                lineTo(3.5f, 8.91f)
                lineTo(5.27f, 10.68f)
                lineTo(6.68f, 9.27f)
                lineTo(4.91f, 7.5f)
                moveTo(19.09f, 7.5f)
                lineTo(17.32f, 9.27f)
                lineTo(18.73f, 10.68f)
                lineTo(20.5f, 8.91f)
                lineTo(19.09f, 7.5f)
                moveTo(17.66f, 14f)
                curveTo(17.19f, 15.33f, 16.26f, 16.5f, 15f, 17.19f)
                curveTo(14.08f, 17.72f, 13.04f, 18f, 12f, 18f)
                reflectiveCurveTo(9.92f, 17.72f, 9f, 17.19f)
                curveTo(7.74f, 16.5f, 6.81f, 15.33f, 6.34f, 14f)
                horizontalLineTo(17.66f)
                moveTo(20f, 12f)
                horizontalLineTo(4f)
                curveTo(4f, 14.86f, 5.5f, 17.5f, 8f, 18.93f)
                curveTo(9.25f, 19.65f, 10.63f, 20f, 12f, 20f)
                reflectiveCurveTo(14.75f, 19.65f, 16f, 18.93f)
                curveTo(18.5f, 17.5f, 20f, 14.86f, 20f, 12f)
                close()
            }
        }.build()

        return _WallSconceRoundVariantOutline!!
    }

@Suppress("ObjectPropertyName")
private var _WallSconceRoundVariantOutline: ImageVector? = null

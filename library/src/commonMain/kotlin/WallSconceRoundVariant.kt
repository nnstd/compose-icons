package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WallSconceRoundVariant: ImageVector
    get() {
        if (_WallSconceRoundVariant != null) {
            return _WallSconceRoundVariant!!
        }
        _WallSconceRoundVariant = ImageVector.Builder(
            name = "WallSconceRoundVariant",
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
                moveTo(4f, 12f)
                curveTo(4f, 14.86f, 5.5f, 17.5f, 8f, 18.93f)
                reflectiveCurveTo(13.5f, 20.36f, 16f, 18.93f)
                reflectiveCurveTo(20f, 14.86f, 20f, 12f)
                horizontalLineTo(4f)
                close()
            }
        }.build()

        return _WallSconceRoundVariant!!
    }

@Suppress("ObjectPropertyName")
private var _WallSconceRoundVariant: ImageVector? = null

package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WallSconceRound: ImageVector
    get() {
        if (_WallSconceRound != null) {
            return _WallSconceRound!!
        }
        _WallSconceRound = ImageVector.Builder(
            name = "WallSconceRound",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 19f)
                verticalLineTo(16f)
                horizontalLineTo(11f)
                verticalLineTo(19f)
                horizontalLineTo(13f)
                moveTo(19.09f, 16.5f)
                lineTo(20.5f, 15.09f)
                lineTo(18.73f, 13.32f)
                lineTo(17.32f, 14.73f)
                lineTo(19.09f, 16.5f)
                moveTo(4.91f, 16.5f)
                lineTo(6.68f, 14.73f)
                lineTo(5.27f, 13.32f)
                lineTo(3.5f, 15.09f)
                lineTo(4.91f, 16.5f)
                moveTo(20f, 12f)
                curveTo(20f, 9.14f, 18.5f, 6.5f, 16f, 5.07f)
                reflectiveCurveTo(10.5f, 3.64f, 8f, 5.07f)
                reflectiveCurveTo(4f, 9.14f, 4f, 12f)
                horizontalLineTo(20f)
                close()
            }
        }.build()

        return _WallSconceRound!!
    }

@Suppress("ObjectPropertyName")
private var _WallSconceRound: ImageVector? = null

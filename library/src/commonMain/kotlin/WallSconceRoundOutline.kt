package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WallSconceRoundOutline: ImageVector
    get() {
        if (_WallSconceRoundOutline != null) {
            return _WallSconceRoundOutline!!
        }
        _WallSconceRoundOutline = ImageVector.Builder(
            name = "WallSconceRoundOutline",
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
                moveTo(12f, 6f)
                curveTo(13.04f, 6f, 14.08f, 6.28f, 15f, 6.81f)
                curveTo(16.26f, 7.5f, 17.19f, 8.67f, 17.66f, 10f)
                horizontalLineTo(6.34f)
                curveTo(6.81f, 8.67f, 7.74f, 7.5f, 9f, 6.81f)
                curveTo(9.92f, 6.28f, 10.96f, 6f, 12f, 6f)
                moveTo(12f, 4f)
                curveTo(10.63f, 4f, 9.25f, 4.36f, 8f, 5.07f)
                curveTo(5.5f, 6.5f, 4f, 9.14f, 4f, 12f)
                horizontalLineTo(20f)
                curveTo(20f, 9.14f, 18.5f, 6.5f, 16f, 5.07f)
                curveTo(14.75f, 4.36f, 13.38f, 4f, 12f, 4f)
                close()
            }
        }.build()

        return _WallSconceRoundOutline!!
    }

@Suppress("ObjectPropertyName")
private var _WallSconceRoundOutline: ImageVector? = null

package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Timer: ImageVector
    get() {
        if (_Timer != null) {
            return _Timer!!
        }
        _Timer = ImageVector.Builder(
            name = "Timer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.03f, 7.39f)
                lineTo(20.45f, 5.97f)
                curveTo(20f, 5.46f, 19.55f, 5f, 19.04f, 4.56f)
                lineTo(17.62f, 6f)
                curveTo(16.07f, 4.74f, 14.12f, 4f, 12f, 4f)
                curveTo(7.03f, 4f, 3f, 8.03f, 3f, 13f)
                reflectiveCurveTo(7.03f, 22f, 12f, 22f)
                curveTo(17f, 22f, 21f, 17.97f, 21f, 13f)
                curveTo(21f, 10.88f, 20.26f, 8.93f, 19.03f, 7.39f)
                moveTo(13f, 14f)
                horizontalLineTo(11f)
                verticalLineTo(7f)
                horizontalLineTo(13f)
                verticalLineTo(14f)
                moveTo(15f, 1f)
                horizontalLineTo(9f)
                verticalLineTo(3f)
                horizontalLineTo(15f)
                verticalLineTo(1f)
                close()
            }
        }.build()

        return _Timer!!
    }

@Suppress("ObjectPropertyName")
private var _Timer: ImageVector? = null

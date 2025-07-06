package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Rollupjs: ImageVector
    get() {
        if (_Rollupjs != null) {
            return _Rollupjs!!
        }
        _Rollupjs = ImageVector.Builder(
            name = "Rollupjs",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.46f, 8.64f)
                curveTo(19.46f, 11.11f, 18.11f, 13.26f, 16.12f, 14.4f)
                curveTo(16f, 14.5f, 15.93f, 14.66f, 16f, 14.81f)
                lineTo(19.41f, 21.55f)
                curveTo(19.5f, 21.76f, 19.36f, 22f, 19.13f, 22f)
                horizontalLineTo(6.1f)
                lineTo(6.17f, 21.96f)
                curveTo(6.66f, 21.68f, 10.06f, 14.97f, 13.38f, 11.79f)
                curveTo(16.7f, 8.61f, 17.12f, 9.67f, 15.29f, 6.21f)
                curveTo(15.29f, 6.21f, 16.7f, 8.96f, 15.5f, 9.17f)
                curveTo(14.56f, 9.34f, 12.4f, 7.25f, 13.2f, 5.37f)
                curveTo(14f, 3.53f, 17.15f, 3.88f, 18.6f, 5.38f)
                curveTo(19.15f, 6.34f, 19.46f, 7.45f, 19.46f, 8.64f)
                moveTo(7.16f, 13.13f)
                curveTo(5.84f, 15.56f, 5f, 17.33f, 4.54f, 18.57f)
                verticalLineTo(2.31f)
                curveTo(4.54f, 2.14f, 4.68f, 2f, 4.85f, 2f)
                horizontalLineTo(12.92f)
                curveTo(15.26f, 2.04f, 17.31f, 3.28f, 18.46f, 5.15f)
                curveTo(17.62f, 4.1f, 16.3f, 3.5f, 15f, 3.5f)
                curveTo(12.53f, 3.5f, 11.91f, 4.4f, 7.16f, 13.13f)
                close()
            }
        }.build()

        return _Rollupjs!!
    }

@Suppress("ObjectPropertyName")
private var _Rollupjs: ImageVector? = null

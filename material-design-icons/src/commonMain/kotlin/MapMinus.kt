package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MapMinus: ImageVector
    get() {
        if (_MapMinus != null) {
            return _MapMinus!!
        }
        _MapMinus = ImageVector.Builder(
            name = "MapMinus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(23f)
                verticalLineTo(18f)
                horizontalLineTo(15f)
                moveTo(13.16f, 20.36f)
                lineTo(9f, 18.9f)
                lineTo(3.66f, 20.97f)
                curveTo(3.6f, 21f, 3.55f, 21f, 3.5f, 21f)
                curveTo(3.22f, 21f, 3f, 20.78f, 3f, 20.5f)
                verticalLineTo(5.38f)
                curveTo(3f, 5.15f, 3.16f, 4.97f, 3.36f, 4.9f)
                lineTo(9f, 3f)
                lineTo(15f, 5.1f)
                lineTo(20.34f, 3f)
                horizontalLineTo(20.5f)
                curveTo(20.78f, 3f, 21f, 3.22f, 21f, 3.5f)
                verticalLineTo(13.35f)
                curveTo(20.37f, 13.13f, 19.7f, 13f, 19f, 13f)
                curveTo(17.46f, 13f, 16.06f, 13.58f, 15f, 14.54f)
                verticalLineTo(7.1f)
                lineTo(9f, 5f)
                verticalLineTo(16.9f)
                lineTo(13.04f, 18.32f)
                curveTo(13f, 18.54f, 13f, 18.77f, 13f, 19f)
                curveTo(13f, 19.47f, 13.06f, 19.92f, 13.16f, 20.36f)
                close()
            }
        }.build()

        return _MapMinus!!
    }

@Suppress("ObjectPropertyName")
private var _MapMinus: ImageVector? = null

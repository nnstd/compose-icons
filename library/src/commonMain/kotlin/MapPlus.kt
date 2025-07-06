package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MapPlus: ImageVector
    get() {
        if (_MapPlus != null) {
            return _MapPlus!!
        }
        _MapPlus = ImageVector.Builder(
            name = "MapPlus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 3f)
                lineTo(3.36f, 4.9f)
                curveTo(3.16f, 4.97f, 3f, 5.15f, 3f, 5.38f)
                verticalLineTo(20.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.5f, 21f)
                curveTo(3.55f, 21f, 3.6f, 21f, 3.66f, 20.97f)
                lineTo(9f, 18.9f)
                lineTo(13.16f, 20.36f)
                curveTo(13.06f, 19.92f, 13f, 19.46f, 13f, 19f)
                curveTo(13f, 18.77f, 13f, 18.54f, 13.04f, 18.3f)
                lineTo(9f, 16.9f)
                verticalLineTo(5f)
                lineTo(15f, 7.1f)
                verticalLineTo(14.56f)
                curveTo(16.07f, 13.6f, 17.47f, 13f, 19f, 13f)
                curveTo(19.7f, 13f, 20.37f, 13.13f, 21f, 13.36f)
                verticalLineTo(3.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.5f, 3f)
                horizontalLineTo(20.34f)
                lineTo(15f, 5.1f)
                lineTo(9f, 3f)
                moveTo(18f, 15f)
                verticalLineTo(18f)
                horizontalLineTo(15f)
                verticalLineTo(20f)
                horizontalLineTo(18f)
                verticalLineTo(23f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                horizontalLineTo(23f)
                verticalLineTo(18f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(18f)
                close()
            }
        }.build()

        return _MapPlus!!
    }

@Suppress("ObjectPropertyName")
private var _MapPlus: ImageVector? = null

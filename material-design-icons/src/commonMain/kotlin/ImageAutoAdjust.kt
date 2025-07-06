package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ImageAutoAdjust: ImageVector
    get() {
        if (_ImageAutoAdjust != null) {
            return _ImageAutoAdjust!!
        }
        _ImageAutoAdjust = ImageVector.Builder(
            name = "ImageAutoAdjust",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 10f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(14f)
                verticalLineTo(3f)
                horizontalLineTo(5f)
                curveTo(3.92f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.1f, 3.92f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(20.12f, 21f, 21f, 20.1f, 21f, 19f)
                verticalLineTo(10f)
                horizontalLineTo(19f)
                moveTo(17f, 10f)
                lineTo(17.94f, 7.94f)
                lineTo(20f, 7f)
                lineTo(17.94f, 6.06f)
                lineTo(17f, 4f)
                lineTo(16.06f, 6.06f)
                lineTo(14f, 7f)
                lineTo(16.06f, 7.94f)
                lineTo(17f, 10f)
                moveTo(13.25f, 10.75f)
                lineTo(12f, 8f)
                lineTo(10.75f, 10.75f)
                lineTo(8f, 12f)
                lineTo(10.75f, 13.25f)
                lineTo(12f, 16f)
                lineTo(13.25f, 13.25f)
                lineTo(16f, 12f)
                lineTo(13.25f, 10.75f)
                close()
            }
        }.build()

        return _ImageAutoAdjust!!
    }

@Suppress("ObjectPropertyName")
private var _ImageAutoAdjust: ImageVector? = null

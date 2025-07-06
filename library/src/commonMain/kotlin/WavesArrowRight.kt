package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WavesArrowRight: ImageVector
    get() {
        if (_WavesArrowRight != null) {
            return _WavesArrowRight!!
        }
        _WavesArrowRight = ImageVector.Builder(
            name = "WavesArrowRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 14f)
                horizontalLineTo(22f)
                verticalLineTo(16f)
                horizontalLineTo(20f)
                curveTo(18.62f, 16f, 17.26f, 15.65f, 16f, 15f)
                curveTo(13.5f, 16.3f, 10.5f, 16.3f, 8f, 15f)
                curveTo(6.74f, 15.65f, 5.37f, 16f, 4f, 16f)
                horizontalLineTo(2f)
                verticalLineTo(14f)
                horizontalLineTo(4f)
                curveTo(5.39f, 14f, 6.78f, 13.53f, 8f, 12.67f)
                curveTo(10.44f, 14.38f, 13.56f, 14.38f, 16f, 12.67f)
                curveTo(17.22f, 13.53f, 18.61f, 14f, 20f, 14f)
                moveTo(20f, 20f)
                horizontalLineTo(22f)
                verticalLineTo(22f)
                horizontalLineTo(20f)
                curveTo(18.62f, 22f, 17.26f, 21.65f, 16f, 21f)
                curveTo(13.5f, 22.3f, 10.5f, 22.3f, 8f, 21f)
                curveTo(6.74f, 21.65f, 5.37f, 22f, 4f, 22f)
                horizontalLineTo(2f)
                verticalLineTo(20f)
                horizontalLineTo(4f)
                curveTo(5.39f, 20f, 6.78f, 19.53f, 8f, 18.67f)
                curveTo(10.44f, 20.38f, 13.56f, 20.38f, 16f, 18.67f)
                curveTo(17.22f, 19.53f, 18.61f, 20f, 20f, 20f)
                moveTo(22f, 6f)
                lineTo(18f, 2f)
                verticalLineTo(5f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                horizontalLineTo(18f)
                verticalLineTo(10f)
            }
        }.build()

        return _WavesArrowRight!!
    }

@Suppress("ObjectPropertyName")
private var _WavesArrowRight: ImageVector? = null

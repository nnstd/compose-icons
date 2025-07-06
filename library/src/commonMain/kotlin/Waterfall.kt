package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Waterfall: ImageVector
    get() {
        if (_Waterfall != null) {
            return _Waterfall!!
        }
        _Waterfall = ImageVector.Builder(
            name = "Waterfall",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 20f)
                curveTo(18.61f, 20f, 17.22f, 19.53f, 16f, 18.67f)
                curveTo(13.56f, 20.38f, 10.44f, 20.38f, 8f, 18.67f)
                curveTo(6.78f, 19.53f, 5.39f, 20f, 4f, 20f)
                horizontalLineTo(2f)
                verticalLineTo(22f)
                horizontalLineTo(4f)
                curveTo(5.37f, 22f, 6.74f, 21.65f, 8f, 21f)
                curveTo(10.5f, 22.3f, 13.5f, 22.3f, 16f, 21f)
                curveTo(17.26f, 21.65f, 18.62f, 22f, 20f, 22f)
                horizontalLineTo(22f)
                verticalLineTo(20f)
                moveTo(20f, 16f)
                curveTo(18.61f, 16f, 17.22f, 15.53f, 16f, 14.67f)
                curveTo(13.56f, 16.38f, 10.44f, 16.38f, 8f, 14.67f)
                curveTo(6.78f, 15.53f, 5.39f, 16f, 4f, 16f)
                horizontalLineTo(2f)
                verticalLineTo(18f)
                horizontalLineTo(4f)
                curveTo(5.37f, 18f, 6.74f, 17.65f, 8f, 17f)
                curveTo(10.5f, 18.3f, 13.5f, 18.3f, 16f, 17f)
                curveTo(17.26f, 17.65f, 18.62f, 18f, 20f, 18f)
                horizontalLineTo(22f)
                verticalLineTo(16f)
                moveTo(22f, 2f)
                horizontalLineTo(2f)
                verticalLineTo(4f)
                horizontalLineTo(6f)
                verticalLineTo(16f)
                horizontalLineTo(18f)
                verticalLineTo(4f)
                horizontalLineTo(22f)
                moveTo(9f, 4f)
                horizontalLineTo(11f)
                verticalLineTo(10f)
                horizontalLineTo(9f)
                moveTo(13f, 8f)
                horizontalLineTo(15f)
                verticalLineTo(14f)
                horizontalLineTo(13f)
                close()
            }
        }.build()

        return _Waterfall!!
    }

@Suppress("ObjectPropertyName")
private var _Waterfall: ImageVector? = null

package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Skate: ImageVector
    get() {
        if (_Skate != null) {
            return _Skate!!
        }
        _Skate = ImageVector.Builder(
            name = "Skate",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.95f, 17f)
                curveTo(20.7f, 18.69f, 19.26f, 20f, 17.5f, 20f)
                horizontalLineTo(16f)
                verticalLineTo(18f)
                horizontalLineTo(19f)
                curveTo(18.93f, 16.72f, 19.26f, 14.04f, 18.53f, 12.95f)
                curveTo(17.56f, 10.9f, 14.83f, 10.56f, 12.93f, 10.05f)
                curveTo(12f, 10f, 11f, 9f, 10.84f, 8f)
                horizontalLineTo(8f)
                curveTo(7.72f, 8f, 7.5f, 7.78f, 7.5f, 7.5f)
                curveTo(7.5f, 7.22f, 7.72f, 7f, 8f, 7f)
                horizontalLineTo(10.5f)
                verticalLineTo(6f)
                horizontalLineTo(8f)
                curveTo(7.72f, 6f, 7.5f, 5.78f, 7.5f, 5.5f)
                curveTo(7.5f, 5.22f, 7.72f, 5f, 8f, 5f)
                horizontalLineTo(10.5f)
                verticalLineTo(2f)
                horizontalLineTo(2.03f)
                verticalLineTo(18f)
                horizontalLineTo(5f)
                verticalLineTo(20f)
                horizontalLineTo(1f)
                verticalLineTo(22f)
                horizontalLineTo(17.5f)
                curveTo(20.36f, 22f, 22.72f, 19.8f, 23f, 17f)
                horizontalLineTo(20.95f)
                moveTo(14f, 20f)
                horizontalLineTo(7f)
                verticalLineTo(18f)
                horizontalLineTo(14f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _Skate!!
    }

@Suppress("ObjectPropertyName")
private var _Skate: ImageVector? = null

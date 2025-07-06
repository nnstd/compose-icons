package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Wave: ImageVector
    get() {
        if (_Wave != null) {
            return _Wave!!
        }
        _Wave = ImageVector.Builder(
            name = "Wave",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 12f)
                curveTo(18.61f, 12f, 17.22f, 11.53f, 16f, 10.67f)
                curveTo(13.56f, 12.38f, 10.44f, 12.38f, 8f, 10.67f)
                curveTo(6.78f, 11.53f, 5.39f, 12f, 4f, 12f)
                horizontalLineTo(2f)
                verticalLineTo(14f)
                horizontalLineTo(4f)
                curveTo(5.37f, 14f, 6.74f, 13.65f, 8f, 13f)
                curveTo(10.5f, 14.3f, 13.5f, 14.3f, 16f, 13f)
                curveTo(17.26f, 13.65f, 18.62f, 14f, 20f, 14f)
                horizontalLineTo(22f)
                verticalLineTo(12f)
            }
        }.build()

        return _Wave!!
    }

@Suppress("ObjectPropertyName")
private var _Wave: ImageVector? = null

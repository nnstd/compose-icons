package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Script: ImageVector
    get() {
        if (_Script != null) {
            return _Script!!
        }
        _Script = ImageVector.Builder(
            name = "Script",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.8f, 20f)
                curveTo(17.4f, 21.2f, 16.3f, 22f, 15f, 22f)
                horizontalLineTo(5f)
                curveTo(3.3f, 22f, 2f, 20.7f, 2f, 19f)
                verticalLineTo(18f)
                horizontalLineTo(5f)
                lineTo(14.2f, 18f)
                curveTo(14.6f, 19.2f, 15.7f, 20f, 17f, 20f)
                horizontalLineTo(17.8f)
                moveTo(19f, 2f)
                horizontalLineTo(8f)
                curveTo(6.3f, 2f, 5f, 3.3f, 5f, 5f)
                verticalLineTo(16f)
                horizontalLineTo(16f)
                verticalLineTo(17f)
                curveTo(16f, 17.6f, 16.4f, 18f, 17f, 18f)
                horizontalLineTo(18f)
                verticalLineTo(5f)
                curveTo(18f, 4.4f, 18.4f, 4f, 19f, 4f)
                curveTo(19.6f, 4f, 20f, 4.4f, 20f, 5f)
                verticalLineTo(6f)
                horizontalLineTo(22f)
                verticalLineTo(5f)
                curveTo(22f, 3.3f, 20.7f, 2f, 19f, 2f)
                close()
            }
        }.build()

        return _Script!!
    }

@Suppress("ObjectPropertyName")
private var _Script: ImageVector? = null

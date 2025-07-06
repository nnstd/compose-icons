package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ScriptTextPlayOutline: ImageVector
    get() {
        if (_ScriptTextPlayOutline != null) {
            return _ScriptTextPlayOutline!!
        }
        _ScriptTextPlayOutline = ImageVector.Builder(
            name = "ScriptTextPlayOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 14f)
                horizontalLineTo(14f)
                verticalLineTo(15.7f)
                curveTo(13.9f, 15.8f, 13.9f, 15.9f, 13.8f, 16f)
                horizontalLineTo(9f)
                verticalLineTo(14f)
                moveTo(9f, 12f)
                horizontalLineTo(14f)
                verticalLineTo(10f)
                horizontalLineTo(9f)
                verticalLineTo(12f)
                moveTo(9f, 8f)
                horizontalLineTo(14f)
                verticalLineTo(6f)
                horizontalLineTo(9f)
                verticalLineTo(8f)
                moveTo(7f, 5f)
                curveTo(7f, 4.4f, 7.4f, 4f, 8f, 4f)
                horizontalLineTo(16f)
                verticalLineTo(13.8f)
                curveTo(16.6f, 13.4f, 17.3f, 13.2f, 18f, 13.1f)
                verticalLineTo(5f)
                curveTo(18f, 4.4f, 18.4f, 4f, 19f, 4f)
                reflectiveCurveTo(20f, 4.4f, 20f, 5f)
                verticalLineTo(6f)
                horizontalLineTo(22f)
                verticalLineTo(5f)
                curveTo(22f, 3.3f, 20.7f, 2f, 19f, 2f)
                horizontalLineTo(8f)
                curveTo(6.3f, 2f, 5f, 3.3f, 5f, 5f)
                verticalLineTo(16f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                moveTo(13f, 19f)
                verticalLineTo(18.4f)
                verticalLineTo(18f)
                horizontalLineTo(2f)
                verticalLineTo(19f)
                curveTo(2f, 20.7f, 3.3f, 22f, 5f, 22f)
                horizontalLineTo(13.8f)
                curveTo(13.3f, 21.1f, 13f, 20.1f, 13f, 19f)
                moveTo(17f, 16f)
                verticalLineTo(22f)
                lineTo(22f, 19f)
                lineTo(17f, 16f)
                close()
            }
        }.build()

        return _ScriptTextPlayOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ScriptTextPlayOutline: ImageVector? = null

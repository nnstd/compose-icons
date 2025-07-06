package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ScriptTextPlay: ImageVector
    get() {
        if (_ScriptTextPlay != null) {
            return _ScriptTextPlay!!
        }
        _ScriptTextPlay = ImageVector.Builder(
            name = "ScriptTextPlay",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.8f, 22f)
                horizontalLineTo(5f)
                curveTo(3.3f, 22f, 2f, 20.7f, 2f, 19f)
                verticalLineTo(18f)
                horizontalLineTo(13.1f)
                curveTo(13f, 18.3f, 13f, 18.7f, 13f, 19f)
                curveTo(13f, 20.1f, 13.3f, 21.1f, 13.8f, 22f)
                moveTo(13.8f, 16f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                curveTo(5f, 3.3f, 6.3f, 2f, 8f, 2f)
                horizontalLineTo(19f)
                curveTo(20.7f, 2f, 22f, 3.3f, 22f, 5f)
                verticalLineTo(6f)
                horizontalLineTo(20f)
                verticalLineTo(5f)
                curveTo(20f, 4.4f, 19.6f, 4f, 19f, 4f)
                reflectiveCurveTo(18f, 4.4f, 18f, 5f)
                verticalLineTo(13.1f)
                curveTo(16.2f, 13.4f, 14.7f, 14.5f, 13.8f, 16f)
                moveTo(8f, 8f)
                horizontalLineTo(15f)
                verticalLineTo(6f)
                horizontalLineTo(8f)
                verticalLineTo(8f)
                moveTo(8f, 12f)
                horizontalLineTo(14f)
                verticalLineTo(10f)
                horizontalLineTo(8f)
                verticalLineTo(12f)
                moveTo(17f, 16f)
                verticalLineTo(22f)
                lineTo(22f, 19f)
                lineTo(17f, 16f)
                close()
            }
        }.build()

        return _ScriptTextPlay!!
    }

@Suppress("ObjectPropertyName")
private var _ScriptTextPlay: ImageVector? = null

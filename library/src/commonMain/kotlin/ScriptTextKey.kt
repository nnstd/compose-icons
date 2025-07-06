package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ScriptTextKey: ImageVector
    get() {
        if (_ScriptTextKey != null) {
            return _ScriptTextKey!!
        }
        _ScriptTextKey = ImageVector.Builder(
            name = "ScriptTextKey",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.8f, 19f)
                curveTo(17.4f, 17.8f, 16.3f, 17f, 15f, 17f)
                curveTo(13.3f, 17f, 12f, 18.3f, 12f, 20f)
                reflectiveCurveTo(13.3f, 23f, 15f, 23f)
                curveTo(16.3f, 23f, 17.4f, 22.2f, 17.8f, 21f)
                horizontalLineTo(19f)
                verticalLineTo(23f)
                horizontalLineTo(21f)
                verticalLineTo(21f)
                horizontalLineTo(23f)
                verticalLineTo(19f)
                horizontalLineTo(17.8f)
                moveTo(15f, 21.3f)
                curveTo(14.3f, 21.3f, 13.7f, 20.7f, 13.7f, 20f)
                reflectiveCurveTo(14.3f, 18.7f, 15f, 18.7f)
                reflectiveCurveTo(16.3f, 19.3f, 16.3f, 20f)
                reflectiveCurveTo(15.7f, 21.3f, 15f, 21.3f)
                moveTo(15f, 15f)
                curveTo(16.1f, 15f, 17.2f, 15.4f, 18f, 16f)
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
                horizontalLineTo(12f)
                curveTo(12.8f, 15.4f, 13.9f, 15f, 15f, 15f)
                moveTo(8f, 6f)
                horizontalLineTo(15f)
                verticalLineTo(8f)
                horizontalLineTo(8f)
                verticalLineTo(6f)
                moveTo(8f, 10f)
                horizontalLineTo(14f)
                verticalLineTo(12f)
                horizontalLineTo(8f)
                verticalLineTo(10f)
                moveTo(10.4f, 22f)
                horizontalLineTo(5f)
                curveTo(3.3f, 22f, 2f, 20.7f, 2f, 19f)
                verticalLineTo(18f)
                horizontalLineTo(10.4f)
                curveTo(10.1f, 18.6f, 10f, 19.3f, 10f, 20f)
                reflectiveCurveTo(10.1f, 21.4f, 10.4f, 22f)
            }
        }.build()

        return _ScriptTextKey!!
    }

@Suppress("ObjectPropertyName")
private var _ScriptTextKey: ImageVector? = null

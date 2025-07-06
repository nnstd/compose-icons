package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ScriptTextKeyOutline: ImageVector
    get() {
        if (_ScriptTextKeyOutline != null) {
            return _ScriptTextKeyOutline!!
        }
        _ScriptTextKeyOutline = ImageVector.Builder(
            name = "ScriptTextKeyOutline",
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
                moveTo(9f, 10f)
                horizontalLineTo(14f)
                verticalLineTo(12f)
                horizontalLineTo(9f)
                verticalLineTo(10f)
                moveTo(9f, 6f)
                horizontalLineTo(14f)
                verticalLineTo(8f)
                horizontalLineTo(9f)
                verticalLineTo(6f)
                moveTo(7f, 5f)
                curveTo(7f, 4.4f, 7.4f, 4f, 8f, 4f)
                horizontalLineTo(16f)
                verticalLineTo(15.1f)
                curveTo(16.7f, 15.3f, 17.4f, 15.6f, 18f, 16f)
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
                moveTo(10f, 20f)
                curveTo(10f, 19.3f, 10.1f, 18.6f, 10.4f, 18f)
                horizontalLineTo(2f)
                verticalLineTo(19f)
                curveTo(2f, 20.7f, 3.3f, 22f, 5f, 22f)
                horizontalLineTo(10.4f)
                curveTo(10.1f, 21.4f, 10f, 20.7f, 10f, 20f)
                moveTo(9f, 16f)
                horizontalLineTo(12f)
                curveTo(12.6f, 15.6f, 13.3f, 15.2f, 14f, 15.1f)
                verticalLineTo(14f)
                horizontalLineTo(9f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _ScriptTextKeyOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ScriptTextKeyOutline: ImageVector? = null

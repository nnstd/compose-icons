package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlarmPanel: ImageVector
    get() {
        if (_AlarmPanel != null) {
            return _AlarmPanel!!
        }
        _AlarmPanel = ImageVector.Builder(
            name = "AlarmPanel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 3f)
                horizontalLineTo(4f)
                curveTo(2.9f, 3f, 2f, 3.9f, 2f, 5f)
                verticalLineTo(19f)
                curveTo(2f, 20.1f, 2.9f, 21f, 4f, 21f)
                horizontalLineTo(20f)
                curveTo(21.1f, 21f, 22f, 20.1f, 22f, 19f)
                verticalLineTo(5f)
                curveTo(22f, 3.9f, 21.1f, 3f, 20f, 3f)
                moveTo(8f, 19f)
                horizontalLineTo(5f)
                verticalLineTo(17f)
                horizontalLineTo(8f)
                verticalLineTo(19f)
                moveTo(8f, 16f)
                horizontalLineTo(5f)
                verticalLineTo(14f)
                horizontalLineTo(8f)
                verticalLineTo(16f)
                moveTo(8f, 13f)
                horizontalLineTo(5f)
                verticalLineTo(11f)
                horizontalLineTo(8f)
                verticalLineTo(13f)
                moveTo(13.5f, 19f)
                horizontalLineTo(10.5f)
                verticalLineTo(17f)
                horizontalLineTo(13.5f)
                verticalLineTo(19f)
                moveTo(13.5f, 16f)
                horizontalLineTo(10.5f)
                verticalLineTo(14f)
                horizontalLineTo(13.5f)
                verticalLineTo(16f)
                moveTo(13.5f, 13f)
                horizontalLineTo(10.5f)
                verticalLineTo(11f)
                horizontalLineTo(13.5f)
                verticalLineTo(13f)
                moveTo(19f, 19f)
                horizontalLineTo(16f)
                verticalLineTo(17f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                moveTo(19f, 16f)
                horizontalLineTo(16f)
                verticalLineTo(14f)
                horizontalLineTo(19f)
                verticalLineTo(16f)
                moveTo(19f, 13f)
                horizontalLineTo(16f)
                verticalLineTo(11f)
                horizontalLineTo(19f)
                verticalLineTo(13f)
                moveTo(19f, 9f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                verticalLineTo(9f)
                close()
            }
        }.build()

        return _AlarmPanel!!
    }

@Suppress("ObjectPropertyName")
private var _AlarmPanel: ImageVector? = null

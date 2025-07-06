package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlarmPanelOutline: ImageVector
    get() {
        if (_AlarmPanelOutline != null) {
            return _AlarmPanelOutline!!
        }
        _AlarmPanelOutline = ImageVector.Builder(
            name = "AlarmPanelOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 12f)
                horizontalLineTo(6f)
                verticalLineTo(10f)
                horizontalLineTo(9f)
                verticalLineTo(12f)
                moveTo(13.5f, 10f)
                horizontalLineTo(10.5f)
                verticalLineTo(12f)
                horizontalLineTo(13.5f)
                verticalLineTo(10f)
                moveTo(18f, 10f)
                horizontalLineTo(15f)
                verticalLineTo(12f)
                horizontalLineTo(18f)
                verticalLineTo(10f)
                moveTo(18f, 6f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                verticalLineTo(6f)
                moveTo(20f, 5f)
                horizontalLineTo(4f)
                lineTo(4f, 19f)
                lineTo(20f, 19f)
                lineTo(20f, 5f)
                lineTo(20f, 5f)
                moveTo(20f, 3f)
                curveTo(21.1f, 3f, 22f, 3.9f, 22f, 5f)
                verticalLineTo(19f)
                curveTo(22f, 20.1f, 21.1f, 21f, 20f, 21f)
                horizontalLineTo(4f)
                curveTo(2.9f, 21f, 2f, 20.1f, 2f, 19f)
                verticalLineTo(5f)
                curveTo(2f, 3.9f, 2.9f, 3f, 4f, 3f)
                horizontalLineTo(20f)
                moveTo(9f, 13f)
                horizontalLineTo(6f)
                verticalLineTo(15f)
                horizontalLineTo(9f)
                verticalLineTo(13f)
                moveTo(13.5f, 13f)
                horizontalLineTo(10.5f)
                verticalLineTo(15f)
                horizontalLineTo(13.5f)
                verticalLineTo(13f)
                moveTo(18f, 13f)
                horizontalLineTo(15f)
                verticalLineTo(15f)
                horizontalLineTo(18f)
                verticalLineTo(13f)
                moveTo(9f, 16f)
                horizontalLineTo(6f)
                verticalLineTo(18f)
                horizontalLineTo(9f)
                verticalLineTo(16f)
                moveTo(13.5f, 16f)
                horizontalLineTo(10.5f)
                verticalLineTo(18f)
                horizontalLineTo(13.5f)
                verticalLineTo(16f)
                moveTo(18f, 16f)
                horizontalLineTo(15f)
                verticalLineTo(18f)
                horizontalLineTo(18f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _AlarmPanelOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AlarmPanelOutline: ImageVector? = null

package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ToolboxOutline: ImageVector
    get() {
        if (_ToolboxOutline != null) {
            return _ToolboxOutline!!
        }
        _ToolboxOutline = ImageVector.Builder(
            name = "ToolboxOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 8f)
                horizontalLineTo(17f)
                verticalLineTo(6f)
                curveTo(17f, 4.9f, 16.1f, 4f, 15f, 4f)
                horizontalLineTo(9f)
                curveTo(7.9f, 4f, 7f, 4.9f, 7f, 6f)
                verticalLineTo(8f)
                horizontalLineTo(4f)
                curveTo(2.9f, 8f, 2f, 8.9f, 2f, 10f)
                verticalLineTo(20f)
                horizontalLineTo(22f)
                verticalLineTo(10f)
                curveTo(22f, 8.9f, 21.1f, 8f, 20f, 8f)
                moveTo(9f, 6f)
                horizontalLineTo(15f)
                verticalLineTo(8f)
                horizontalLineTo(9f)
                verticalLineTo(6f)
                moveTo(20f, 18f)
                horizontalLineTo(4f)
                verticalLineTo(15f)
                horizontalLineTo(6f)
                verticalLineTo(16f)
                horizontalLineTo(8f)
                verticalLineTo(15f)
                horizontalLineTo(16f)
                verticalLineTo(16f)
                horizontalLineTo(18f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(18f)
                moveTo(18f, 13f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(13f)
                horizontalLineTo(8f)
                verticalLineTo(12f)
                horizontalLineTo(6f)
                verticalLineTo(13f)
                horizontalLineTo(4f)
                verticalLineTo(10f)
                horizontalLineTo(20f)
                verticalLineTo(13f)
                horizontalLineTo(18f)
                close()
            }
        }.build()

        return _ToolboxOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ToolboxOutline: ImageVector? = null

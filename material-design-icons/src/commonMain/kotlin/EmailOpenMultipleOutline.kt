package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EmailOpenMultipleOutline: ImageVector
    get() {
        if (_EmailOpenMultipleOutline != null) {
            return _EmailOpenMultipleOutline!!
        }
        _EmailOpenMultipleOutline = ImageVector.Builder(
            name = "EmailOpenMultipleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 8f)
                verticalLineTo(22f)
                horizontalLineTo(20f)
                verticalLineTo(24f)
                horizontalLineTo(2f)
                curveTo(0.895f, 24f, 0f, 23.11f, 0f, 22f)
                verticalLineTo(8f)
                horizontalLineTo(2f)
                moveTo(23.03f, 6.29f)
                lineTo(14f, 0.64f)
                lineTo(4.97f, 6.29f)
                curveTo(4.39f, 6.64f, 4f, 7.27f, 4f, 8f)
                verticalLineTo(18f)
                curveTo(4f, 19.1f, 4.9f, 20f, 6f, 20f)
                horizontalLineTo(22f)
                curveTo(23.1f, 20f, 24f, 19.1f, 24f, 18f)
                verticalLineTo(8f)
                curveTo(24f, 7.27f, 23.61f, 6.64f, 23.03f, 6.29f)
                moveTo(22f, 18f)
                horizontalLineTo(6f)
                verticalLineTo(10f)
                lineTo(14f, 15f)
                lineTo(22f, 10f)
                verticalLineTo(18f)
                moveTo(14f, 13f)
                lineTo(6f, 8f)
                lineTo(14f, 3f)
                lineTo(22f, 8f)
                lineTo(14f, 13f)
                close()
            }
        }.build()

        return _EmailOpenMultipleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _EmailOpenMultipleOutline: ImageVector? = null

package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Trophy: ImageVector
    get() {
        if (_Trophy != null) {
            return _Trophy!!
        }
        _Trophy = ImageVector.Builder(
            name = "Trophy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 2f)
                curveTo(17.1f, 2f, 16f, 3f, 16f, 4f)
                horizontalLineTo(8f)
                curveTo(8f, 3f, 6.9f, 2f, 6f, 2f)
                horizontalLineTo(2f)
                verticalLineTo(11f)
                curveTo(2f, 12f, 3f, 13f, 4f, 13f)
                horizontalLineTo(6.2f)
                curveTo(6.6f, 15f, 7.9f, 16.7f, 11f, 17f)
                verticalLineTo(19.08f)
                curveTo(8f, 19.54f, 8f, 22f, 8f, 22f)
                horizontalLineTo(16f)
                curveTo(16f, 22f, 16f, 19.54f, 13f, 19.08f)
                verticalLineTo(17f)
                curveTo(16.1f, 16.7f, 17.4f, 15f, 17.8f, 13f)
                horizontalLineTo(20f)
                curveTo(21f, 13f, 22f, 12f, 22f, 11f)
                verticalLineTo(2f)
                horizontalLineTo(18f)
                moveTo(6f, 11f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                horizontalLineTo(6f)
                verticalLineTo(11f)
                moveTo(20f, 11f)
                horizontalLineTo(18f)
                verticalLineTo(4f)
                horizontalLineTo(20f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _Trophy!!
    }

@Suppress("ObjectPropertyName")
private var _Trophy: ImageVector? = null

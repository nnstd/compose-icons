package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CheckerboardRemove: ImageVector
    get() {
        if (_CheckerboardRemove != null) {
            return _CheckerboardRemove!!
        }
        _CheckerboardRemove = ImageVector.Builder(
            name = "CheckerboardRemove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 16f)
                horizontalLineTo(12f)
                verticalLineTo(12f)
                horizontalLineTo(8f)
                verticalLineTo(16f)
                moveTo(12f, 12f)
                horizontalLineTo(16f)
                verticalLineTo(8f)
                horizontalLineTo(12f)
                verticalLineTo(12f)
                moveTo(2f, 2f)
                verticalLineTo(22f)
                horizontalLineTo(13.5f)
                curveTo(13f, 21.4f, 12.6f, 20.7f, 12.3f, 20f)
                horizontalLineTo(8f)
                verticalLineTo(16f)
                horizontalLineTo(4f)
                verticalLineTo(12f)
                horizontalLineTo(8f)
                verticalLineTo(8f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                horizontalLineTo(8f)
                verticalLineTo(8f)
                horizontalLineTo(12f)
                verticalLineTo(4f)
                horizontalLineTo(16f)
                verticalLineTo(8f)
                horizontalLineTo(20f)
                verticalLineTo(12.4f)
                curveTo(20.7f, 12.7f, 21.4f, 13.1f, 22f, 13.6f)
                verticalLineTo(2f)
                horizontalLineTo(2f)
                moveTo(20.1f, 14.5f)
                lineTo(18f, 16.6f)
                lineTo(15.9f, 14.5f)
                lineTo(14.5f, 15.9f)
                lineTo(16.6f, 18f)
                lineTo(14.5f, 20.1f)
                lineTo(15.9f, 21.5f)
                lineTo(18f, 19.4f)
                lineTo(20.1f, 21.5f)
                lineTo(21.5f, 20.1f)
                lineTo(19.4f, 18f)
                lineTo(21.5f, 15.9f)
                lineTo(20.1f, 14.5f)
                close()
            }
        }.build()

        return _CheckerboardRemove!!
    }

@Suppress("ObjectPropertyName")
private var _CheckerboardRemove: ImageVector? = null

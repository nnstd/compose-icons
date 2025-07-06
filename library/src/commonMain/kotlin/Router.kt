package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Router: ImageVector
    get() {
        if (_Router != null) {
            return _Router!!
        }
        _Router = ImageVector.Builder(
            name = "Router",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(6.5f, 2f, 2f, 6.5f, 2f, 12f)
                curveTo(2f, 17.5f, 6.5f, 22f, 12f, 22f)
                curveTo(17.5f, 22f, 22f, 17.5f, 22f, 12f)
                curveTo(22f, 6.5f, 17.5f, 2f, 12f, 2f)
                moveTo(12f, 20f)
                curveTo(7.58f, 20f, 4f, 16.42f, 4f, 12f)
                curveTo(4f, 7.58f, 7.58f, 4f, 12f, 4f)
                curveTo(16.42f, 4f, 20f, 7.58f, 20f, 12f)
                curveTo(20f, 16.42f, 16.42f, 20f, 12f, 20f)
                moveTo(13f, 13f)
                verticalLineTo(16f)
                horizontalLineTo(15f)
                lineTo(12f, 19f)
                lineTo(9f, 16f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                moveTo(5f, 13f)
                horizontalLineTo(8f)
                verticalLineTo(15f)
                lineTo(11f, 12f)
                lineTo(8f, 9f)
                verticalLineTo(11f)
                horizontalLineTo(5f)
                moveTo(11f, 11f)
                verticalLineTo(8f)
                horizontalLineTo(9f)
                lineTo(12f, 5f)
                lineTo(15f, 8f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                moveTo(19f, 11f)
                horizontalLineTo(16f)
                verticalLineTo(9f)
                lineTo(13f, 12f)
                lineTo(16f, 15f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
            }
        }.build()

        return _Router!!
    }

@Suppress("ObjectPropertyName")
private var _Router: ImageVector? = null

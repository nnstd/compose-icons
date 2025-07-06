package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BagPersonalTagOutline: ImageVector
    get() {
        if (_BagPersonalTagOutline != null) {
            return _BagPersonalTagOutline!!
        }
        _BagPersonalTagOutline = ImageVector.Builder(
            name = "BagPersonalTagOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 5f)
                verticalLineTo(4f)
                curveTo(14f, 2.9f, 13.1f, 2f, 12f, 2f)
                horizontalLineTo(8f)
                curveTo(6.9f, 2f, 6f, 2.9f, 6f, 4f)
                verticalLineTo(5f)
                curveTo(3.8f, 5f, 2f, 6.8f, 2f, 9f)
                verticalLineTo(20f)
                curveTo(2f, 21.1f, 2.9f, 22f, 4f, 22f)
                horizontalLineTo(15.2f)
                lineTo(13.2f, 20f)
                horizontalLineTo(4f)
                verticalLineTo(16f)
                horizontalLineTo(6f)
                verticalLineTo(18f)
                horizontalLineTo(7f)
                verticalLineTo(16f)
                horizontalLineTo(12f)
                verticalLineTo(15f)
                horizontalLineTo(4f)
                verticalLineTo(9f)
                curveTo(4f, 7.9f, 4.9f, 7f, 6f, 7f)
                horizontalLineTo(14f)
                curveTo(15.1f, 7f, 16f, 7.9f, 16f, 9f)
                verticalLineTo(12f)
                horizontalLineTo(18f)
                verticalLineTo(9f)
                curveTo(18f, 6.8f, 16.2f, 5f, 14f, 5f)
                moveTo(12f, 5f)
                horizontalLineTo(8f)
                verticalLineTo(4f)
                horizontalLineTo(12f)
                verticalLineTo(5f)
                moveTo(10f, 9f)
                lineTo(8f, 11f)
                lineTo(10f, 13f)
                lineTo(12f, 11f)
                lineTo(10f, 9f)
                moveTo(21.8f, 17.8f)
                lineTo(18.2f, 14.2f)
                curveTo(18f, 14.1f, 17.8f, 14f, 17.6f, 14f)
                horizontalLineTo(14.8f)
                curveTo(14.4f, 14f, 14f, 14.4f, 14f, 14.8f)
                verticalLineTo(17.6f)
                curveTo(14f, 17.8f, 14.1f, 18f, 14.2f, 18.2f)
                lineTo(17.8f, 21.8f)
                curveTo(17.9f, 21.9f, 18.1f, 22f, 18.4f, 22f)
                curveTo(18.6f, 22f, 18.8f, 21.9f, 19f, 21.8f)
                lineTo(21.8f, 19f)
                curveTo(21.9f, 18.9f, 22f, 18.7f, 22f, 18.4f)
                curveTo(22f, 18.2f, 21.9f, 18f, 21.8f, 17.8f)
                moveTo(15.4f, 16f)
                curveTo(15.1f, 16f, 14.8f, 15.7f, 14.8f, 15.4f)
                curveTo(14.8f, 15.1f, 15.1f, 14.8f, 15.4f, 14.8f)
                curveTo(15.7f, 14.8f, 16f, 15.1f, 16f, 15.4f)
                curveTo(16f, 15.7f, 15.7f, 16f, 15.4f, 16f)
                close()
            }
        }.build()

        return _BagPersonalTagOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BagPersonalTagOutline: ImageVector? = null

package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BagPersonalPlus: ImageVector
    get() {
        if (_BagPersonalPlus != null) {
            return _BagPersonalPlus!!
        }
        _BagPersonalPlus = ImageVector.Builder(
            name = "BagPersonalPlus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 19f)
                horizontalLineTo(19f)
                verticalLineTo(22f)
                horizontalLineTo(17f)
                verticalLineTo(19f)
                horizontalLineTo(14f)
                verticalLineTo(17f)
                horizontalLineTo(17f)
                verticalLineTo(14f)
                horizontalLineTo(19f)
                verticalLineTo(17f)
                horizontalLineTo(22f)
                verticalLineTo(19f)
                moveTo(8f, 2f)
                curveTo(6.9f, 2f, 6f, 2.9f, 6f, 4f)
                verticalLineTo(5f)
                curveTo(3.8f, 5f, 2f, 6.8f, 2f, 9f)
                verticalLineTo(20f)
                curveTo(2f, 21.1f, 2.9f, 22f, 4f, 22f)
                horizontalLineTo(13.5f)
                curveTo(12.5f, 20.9f, 12f, 19.5f, 12f, 18f)
                curveTo(12f, 17.3f, 12.1f, 16.6f, 12.3f, 16f)
                horizontalLineTo(7f)
                verticalLineTo(18f)
                horizontalLineTo(6f)
                verticalLineTo(16f)
                horizontalLineTo(4f)
                verticalLineTo(15f)
                horizontalLineTo(12.8f)
                curveTo(13.8f, 13.2f, 15.8f, 12f, 18f, 12f)
                verticalLineTo(9f)
                curveTo(18f, 6.8f, 16.2f, 5f, 14f, 5f)
                verticalLineTo(4f)
                curveTo(14f, 2.9f, 13.1f, 2f, 12f, 2f)
                horizontalLineTo(8f)
                moveTo(8f, 4f)
                horizontalLineTo(12f)
                verticalLineTo(5f)
                horizontalLineTo(8f)
                verticalLineTo(4f)
                moveTo(10f, 9f)
                lineTo(12f, 11f)
                lineTo(10f, 13f)
                lineTo(8f, 11f)
                lineTo(10f, 9f)
                close()
            }
        }.build()

        return _BagPersonalPlus!!
    }

@Suppress("ObjectPropertyName")
private var _BagPersonalPlus: ImageVector? = null

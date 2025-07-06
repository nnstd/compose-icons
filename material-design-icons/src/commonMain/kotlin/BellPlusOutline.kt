package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BellPlusOutline: ImageVector
    get() {
        if (_BellPlusOutline != null) {
            return _BellPlusOutline!!
        }
        _BellPlusOutline = ImageVector.Builder(
            name = "BellPlusOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(10.9f, 2f, 10f, 2.9f, 10f, 4f)
                curveTo(10f, 4.1f, 10f, 4.19f, 10f, 4.29f)
                curveTo(7.12f, 5.14f, 5f, 7.82f, 5f, 11f)
                verticalLineTo(17f)
                lineTo(3f, 19f)
                verticalLineTo(20f)
                horizontalLineTo(12.35f)
                curveTo(12.12f, 19.36f, 12f, 18.68f, 12f, 18f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                curveTo(7f, 8.24f, 9.24f, 6f, 12f, 6f)
                curveTo(14.76f, 6f, 17f, 8.24f, 17f, 11f)
                verticalLineTo(12.09f)
                curveTo(17.33f, 12.03f, 17.67f, 12f, 18f, 12f)
                curveTo(18.34f, 12f, 18.67f, 12.03f, 19f, 12.09f)
                verticalLineTo(11f)
                curveTo(19f, 7.82f, 16.88f, 5.14f, 14f, 4.29f)
                curveTo(14f, 4.19f, 14f, 4.1f, 14f, 4f)
                curveTo(14f, 2.9f, 13.11f, 2f, 12f, 2f)
                moveTo(17f, 14f)
                verticalLineTo(17f)
                horizontalLineTo(14f)
                verticalLineTo(19f)
                horizontalLineTo(17f)
                verticalLineTo(22f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                horizontalLineTo(22f)
                verticalLineTo(17f)
                horizontalLineTo(19f)
                verticalLineTo(14f)
                moveTo(10f, 21f)
                curveTo(10f, 22.11f, 10.9f, 23f, 12f, 23f)
                curveTo(12.66f, 23f, 13.28f, 22.67f, 13.65f, 22.13f)
                curveTo(13.33f, 21.79f, 13.05f, 21.41f, 12.81f, 21f)
                close()
            }
        }.build()

        return _BellPlusOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BellPlusOutline: ImageVector? = null

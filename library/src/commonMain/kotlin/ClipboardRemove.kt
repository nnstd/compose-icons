package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ClipboardRemove: ImageVector
    get() {
        if (_ClipboardRemove != null) {
            return _ClipboardRemove!!
        }
        _ClipboardRemove = ImageVector.Builder(
            name = "ClipboardRemove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                horizontalLineTo(14.82f)
                curveTo(14.4f, 1.84f, 13.3f, 1f, 12f, 1f)
                reflectiveCurveTo(9.6f, 1.84f, 9.18f, 3f)
                horizontalLineTo(5f)
                curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.11f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(20.11f, 21f, 21f, 20.11f, 21f, 19f)
                verticalLineTo(5f)
                curveTo(21f, 3.9f, 20.11f, 3f, 19f, 3f)
                moveTo(12f, 3f)
                curveTo(12.55f, 3f, 13f, 3.45f, 13f, 4f)
                reflectiveCurveTo(12.55f, 5f, 12f, 5f)
                reflectiveCurveTo(11f, 4.55f, 11f, 4f)
                reflectiveCurveTo(11.45f, 3f, 12f, 3f)
                moveTo(15.54f, 15.12f)
                lineTo(14.12f, 16.54f)
                lineTo(12f, 14.41f)
                lineTo(9.88f, 16.54f)
                lineTo(8.47f, 15.12f)
                lineTo(10.59f, 13f)
                lineTo(8.47f, 10.88f)
                lineTo(9.88f, 9.47f)
                lineTo(12f, 11.59f)
                lineTo(14.12f, 9.47f)
                lineTo(15.54f, 10.88f)
                lineTo(13.41f, 13f)
                lineTo(15.54f, 15.12f)
                close()
            }
        }.build()

        return _ClipboardRemove!!
    }

@Suppress("ObjectPropertyName")
private var _ClipboardRemove: ImageVector? = null

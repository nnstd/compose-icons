package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PencilCircle: ImageVector
    get() {
        if (_PencilCircle != null) {
            return _PencilCircle!!
        }
        _PencilCircle = ImageVector.Builder(
            name = "PencilCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(6.47f, 2f, 2f, 6.47f, 2f, 12f)
                curveTo(2f, 17.53f, 6.47f, 22f, 12f, 22f)
                curveTo(17.53f, 22f, 22f, 17.53f, 22f, 12f)
                curveTo(22f, 6.47f, 17.53f, 2f, 12f, 2f)
                moveTo(15.1f, 7.07f)
                curveTo(15.24f, 7.07f, 15.38f, 7.12f, 15.5f, 7.23f)
                lineTo(16.77f, 8.5f)
                curveTo(17f, 8.72f, 17f, 9.07f, 16.77f, 9.28f)
                lineTo(15.77f, 10.28f)
                lineTo(13.72f, 8.23f)
                lineTo(14.72f, 7.23f)
                curveTo(14.82f, 7.12f, 14.96f, 7.07f, 15.1f, 7.07f)
                moveTo(13.13f, 8.81f)
                lineTo(15.19f, 10.87f)
                lineTo(9.13f, 16.93f)
                horizontalLineTo(7.07f)
                verticalLineTo(14.87f)
                lineTo(13.13f, 8.81f)
                close()
            }
        }.build()

        return _PencilCircle!!
    }

@Suppress("ObjectPropertyName")
private var _PencilCircle: ImageVector? = null

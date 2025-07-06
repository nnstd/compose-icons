package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CloseCircleOutline: ImageVector
    get() {
        if (_CloseCircleOutline != null) {
            return _CloseCircleOutline!!
        }
        _CloseCircleOutline = ImageVector.Builder(
            name = "CloseCircleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 20f)
                curveTo(7.59f, 20f, 4f, 16.41f, 4f, 12f)
                curveTo(4f, 7.59f, 7.59f, 4f, 12f, 4f)
                curveTo(16.41f, 4f, 20f, 7.59f, 20f, 12f)
                curveTo(20f, 16.41f, 16.41f, 20f, 12f, 20f)
                moveTo(12f, 2f)
                curveTo(6.47f, 2f, 2f, 6.47f, 2f, 12f)
                curveTo(2f, 17.53f, 6.47f, 22f, 12f, 22f)
                curveTo(17.53f, 22f, 22f, 17.53f, 22f, 12f)
                curveTo(22f, 6.47f, 17.53f, 2f, 12f, 2f)
                moveTo(14.59f, 8f)
                lineTo(12f, 10.59f)
                lineTo(9.41f, 8f)
                lineTo(8f, 9.41f)
                lineTo(10.59f, 12f)
                lineTo(8f, 14.59f)
                lineTo(9.41f, 16f)
                lineTo(12f, 13.41f)
                lineTo(14.59f, 16f)
                lineTo(16f, 14.59f)
                lineTo(13.41f, 12f)
                lineTo(16f, 9.41f)
                lineTo(14.59f, 8f)
                close()
            }
        }.build()

        return _CloseCircleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CloseCircleOutline: ImageVector? = null
